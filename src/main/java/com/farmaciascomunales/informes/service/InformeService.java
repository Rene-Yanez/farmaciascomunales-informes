package com.farmaciascomunales.informes.service;

import com.farmaciascomunales.informes.model.InformeVenta;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InformeService {

    public List<InformeVenta> generarInformeMock() {
        return List.of(
                new InformeVenta() {{
                    setIdVenta(1L);
                    setIdProducto(100L);
                    setNombreProducto("Paracetamol 500mg");
                    setCantidad(10);
                    setPrecioUnitario(100);
                    setFecha(LocalDate.now().minusDays(2));
                }},
                new InformeVenta() {{
                    setIdVenta(2L);
                    setIdProducto(101L);
                    setNombreProducto("Ibuprofeno 400mg");
                    setCantidad(5);
                    setPrecioUnitario(200);
                    setFecha(LocalDate.now().minusDays(1));
                }}
        );
    }
}