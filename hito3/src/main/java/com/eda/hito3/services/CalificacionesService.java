package com.eda.hito3.service;

import org.springframework.stereotype.Service;

@Service
public class CalificacionesService {

    private double[] calificaciones = new double[110];
    private int totalNotas = 0;

    public String agregar(double valor) {
        if (totalNotas >= 110) return "Arreglo lleno";
        calificaciones[totalNotas++] = valor;
        return "Nota agregada: " + valor;
    }

    public double[] getCalificaciones() {
        double[] resultado = new double[totalNotas];
        for (int i = 0; i < totalNotas; i++) {
            resultado[i] = calificaciones[i];
        }
        return resultado;
    }

    public double getPromedio() {
        if (totalNotas == 0) return 0;
        double suma = 0;
        for (int i = 0; i < totalNotas; i++) suma += calificaciones[i];
        return suma / totalNotas;
    }

    public double getMax() {
        if (totalNotas == 0) return 0;
        double max = calificaciones[0];
        for (int i = 1; i < totalNotas; i++)
            if (calificaciones[i] > max) max = calificaciones[i];
        return max;
    }

    public double getMin() {
        if (totalNotas == 0) return 0;
        double min = calificaciones[0];
        for (int i = 1; i < totalNotas; i++)
            if (calificaciones[i] < min) min = calificaciones[i];
        return min;
    }
}