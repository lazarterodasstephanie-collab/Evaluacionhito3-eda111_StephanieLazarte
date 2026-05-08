package com.eda.hito3.services;

import org.springframework.stereotype.Service;

@Service
public class AulaService {

    private int[][] aula = new int[5][15];

    public String ocupar(int fila, int columna) {
        if (!esValido(fila, columna)) return "Posición inválida";
        aula[fila][columna] = 1;
        return "Asiento ocupado: fila " + fila + ", columna " + columna;
    }

    public String liberar(int fila, int columna) {
        if (!esValido(fila, columna)) return "Posición inválida";
        aula[fila][columna] = 0;
        return "Asiento liberado: fila " + fila + ", columna " + columna;
    }

    public int[][] getMatriz() {
        return aula;
    }

    public int contarOcupados() {
        int count = 0;
        for (int[] fila : aula)
            for (int asiento : fila)
                if (asiento == 1) count++;
        return count;
    }

    private boolean esValido(int f, int c) {
        return f >= 0 && f < 5 && c >= 0 && c < 15;
    }
}