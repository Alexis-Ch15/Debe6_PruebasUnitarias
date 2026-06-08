package com.empresa;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ProductoTest {
    @Test
    void testCasoValido() {
        Producto p = new Producto(5);
        assertTrue(p.hayStock());
    }

    @Test
    void testCasoLimite() {
        Producto p = new Producto(0);
        assertFalse(p.hayStock());
    }

    @Test
    void testCasoNoValido() {
        Producto p = new Producto(-1);
        assertFalse(p.hayStock());
    }
}