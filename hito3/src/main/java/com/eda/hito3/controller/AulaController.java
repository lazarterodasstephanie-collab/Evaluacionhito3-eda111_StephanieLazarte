package com.eda.hito3.controller;

import com.eda.hito3.services.AulaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aula")
public class AulaController {

    private final AulaService service;

    public AulaController(AulaService services) {
        this.service = services;
    }

    @GetMapping
    public int[][] mostrar() {
        return service.getMatriz();
    }

    @GetMapping("/ocupados")
    public String ocupados() {
        return "Asientos ocupados: " + service.contarOcupados();
    }

    @GetMapping("/ocupar")
    public String ocupar(@RequestParam int fila, @RequestParam int columna) {
        return service.ocupar(fila, columna);
    }

    @GetMapping("/liberar")
    public String liberar(@RequestParam int fila, @RequestParam int columna) {
        return service.liberar(fila, columna);
    }
}