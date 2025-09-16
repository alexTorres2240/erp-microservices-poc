package com.erp.ventas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VentasController {

    @GetMapping("/ventas")
    public String listarVentas() {
        return "Listado de ventas (ejemplo)";
    }
}
