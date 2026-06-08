package com.empresa;

public class Producto {
    private int stock;
    public Producto(int stock) { this.stock = stock; }
    public boolean hayStock() { return stock > 0; }
}