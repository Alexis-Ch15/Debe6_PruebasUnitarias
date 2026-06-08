package com.deber6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LibroTest {

    @Test
    void testPrestarLibroExitoso() {
        Libro libro = new Libro(5, true);
        assertTrue(libro.puedePrestarse(), "Debería poder prestarse");
    }

    @Test
    void testNoPrestarSinStock() {
        Libro libro = new Libro(0, true);
        assertFalse(libro.puedePrestarse(), "No debería prestarse si no hay stock");
    }

    @Test
    void testNoPrestarSiNoHaSidoDevuelto() {
        Libro libro = new Libro(5, false); 
        assertFalse(libro.puedePrestarse(), "No debería prestarse si no ha sido devuelto");
    }
}