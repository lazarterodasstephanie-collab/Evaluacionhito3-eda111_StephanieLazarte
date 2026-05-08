package com.eda.hito3.controller;

import com.eda.hito3.service.CalificacionesService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notas")
public class CalificacionesController {

    private final CalificacionesService service;

    public CalificacionesController(CalificacionesService service) {
        this.service = service;
    }

    @GetMapping("/agregar")
    public String agregar(@RequestParam double valor) {
        return service.agregar(valor);
    }

    @GetMapping
    public double[] mostrar() {
        return service.getCalificaciones();
    }

    @GetMapping("/promedio")
    public String promedio() {
        return "Promedio: " + service.getPromedio();
    }

    @GetMapping("/max")
    public String max() {
        return "Nota máxima: " + service.getMax();
    }

    @GetMapping("/min")
    public String min() {
        return "Nota mínima: " + service.getMin();
    }
}