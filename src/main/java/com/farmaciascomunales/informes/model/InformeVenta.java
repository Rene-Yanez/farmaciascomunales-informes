package com.farmaciascomunales.informes.model;

import java.time.LocalDate;

public class InformeVenta {

    private Long idVenta;
    private Long idProducto;
    private String nombreProducto;
    private int cantidad;
    private int precioUnitario;
    private LocalDate fecha;

    // Getters y setters
    public Long getIdVenta() { return idVenta; }

    public void setIdVenta(Long idVenta) { this.idVenta = idVenta; }

    public Long getIdProducto() { return idProducto; }

    public void setIdProducto(Long idProducto) { this.idProducto = idProducto; }

    public String getNombreProducto() { return nombreProducto; }

    public void setNombreProducto(String nombreProducto) { this.nombreProducto = nombreProducto; }

    public int getCantidad() { return cantidad; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public int getPrecioUnitario() { return precioUnitario; }

    public void setPrecioUnitario(int precioUnitario) { this.precioUnitario = precioUnitario; }

    public LocalDate getFecha() { return fecha; }

    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
}