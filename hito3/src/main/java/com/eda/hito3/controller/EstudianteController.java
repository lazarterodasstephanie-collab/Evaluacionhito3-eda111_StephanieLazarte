package com.eda.hito3.controller;

import com.eda.hito3.services.EstudianteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final EstudianteService service;

    public EstudianteController(EstudianteService service) {
        this.service = service;
    }

    @GetMapping("/agregar")
    public String agregar(@RequestParam int id, @RequestParam String nombre, @RequestParam double puntaje) {
        return service.agregar(id, nombre, puntaje);
    }

    @GetMapping
    public Object mostrar() {
        return service.mostrar();
    }

    @GetMapping("/ordenados")
    public Object ordenados() {
        return service.ordenados();
    }

    @GetMapping("/buscar/{nombre}")
    public Object buscar(@PathVariable String nombre) {
        return service.buscar(nombre);
    }
}