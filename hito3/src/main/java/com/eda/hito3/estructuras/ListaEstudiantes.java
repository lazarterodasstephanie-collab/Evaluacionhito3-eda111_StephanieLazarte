package com.eda.hito3.estructuras;

import com.eda.hito3.model.Estudiante;
import java.util.ArrayList;
import java.util.List;

public class ListaEstudiantes {

    private Nodo cabeza;

    public void insertar(Estudiante e) {
        Nodo nuevo = new Nodo(e);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) actual = actual.siguiente;
            actual.siguiente = nuevo;
        }
    }

    public List<Estudiante> mostrar() {
        List<Estudiante> lista = new ArrayList<>();
        Nodo actual = cabeza;
        while (actual != null) {
            lista.add(actual.estudiante);
            actual = actual.siguiente;
        }
        return lista;
    }

    public Estudiante buscar(String nombre) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.estudiante.nombre.equalsIgnoreCase(nombre))
                return actual.estudiante;
            actual = actual.siguiente;
        }
        return null;
    }

    public List<Estudiante> ordenadosAprobados() {
        List<Estudiante> aprobados = new ArrayList<>();
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.estudiante.puntaje >= 60)
                aprobados.add(actual.estudiante);
            actual = actual.siguiente;
        }
        for (int i = 0; i < aprobados.size() - 1; i++) {
            for (int j = 0; j < aprobados.size() - i - 1; j++) {
                if (aprobados.get(j).puntaje < aprobados.get(j + 1).puntaje) {
                    Estudiante temp = aprobados.get(j);
                    aprobados.set(j, aprobados.get(j + 1));
                    aprobados.set(j + 1, temp);
                }
            }
        }
        return aprobados;
    }
}