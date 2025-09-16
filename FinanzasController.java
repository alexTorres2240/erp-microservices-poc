package com.erp.finanzas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinanzasController {

    @GetMapping("/ventas")
    public String listarFinanzas() {
        return "Listado de finanzas (ejemplo)";
    }
}
