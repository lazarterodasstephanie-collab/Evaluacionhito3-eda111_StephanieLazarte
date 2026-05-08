package com.eda.hito3.services;

import com.eda.hito3.estructuras.ListaEstudiantes;
import com.eda.hito3.model.Estudiante;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstudianteService {

    private ListaEstudiantes lista = new ListaEstudiantes();

    public String agregar(int id, String nombre, double puntaje) {
        lista.insertar(new Estudiante(id, nombre, puntaje));
        return "Estudiante agregado: " + nombre;
    }

    public List<Estudiante> mostrar() {
        return lista.mostrar();
    }

    public List<Estudiante> ordenados() {
        return lista.ordenadosAprobados();
    }

    public Object buscar(String nombre) {
        Estudiante e = lista.buscar(nombre);
        return e != null ? e : "Estudiante no encontrado";
    }
}