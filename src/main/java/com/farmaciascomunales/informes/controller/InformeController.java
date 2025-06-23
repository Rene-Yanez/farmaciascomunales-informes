package com.farmaciascomunales.informes.controller;

import com.farmaciascomunales.informes.model.InformeVenta;
import com.farmaciascomunales.informes.service.InformeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/informes")
public class InformeController {

    private final InformeService service;

    public InformeController(InformeService service) {
        this.service = service;
    }

    @GetMapping("/ventas")
    public List<InformeVenta> obtenerInformeVentas() {
        return service.generarInformeMock();
    }
}