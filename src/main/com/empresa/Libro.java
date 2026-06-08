package com.empresa;

public class Libro {
    private int cantidadDisponible;
    private boolean estaDevuelto;

    public Libro(int cantidadDisponible, boolean estaDevuelto) {
        this.cantidadDisponible = cantidadDisponible;
        this.estaDevuelto = estaDevuelto;
    }

    public boolean puedePrestarse() {
        return (cantidadDisponible > 0) && estaDevuelto;
    }
}