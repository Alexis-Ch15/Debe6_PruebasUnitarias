package com.empresa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LoginServiceTest {

    @Test
    void Login() {
        LoginService login = new LoginService();
        assertTrue(login.intentarLogin("admin", "1234"));
    }

    @Test
    void testBloqueoTras3Intentos() {
        LoginService login = new LoginService();
        login.intentarLogin("wrong", "wrong");
        login.intentarLogin("wrong", "wrong");
        login.intentarLogin("wrong", "wrong");
        
        assertTrue(login.estaBloqueado(), "El usuario debería estar bloqueado");
        assertFalse(login.intentarLogin("admin", "1234"), "No debería dejar entrar aunque ponga la clave correcta tras bloqueo");
    }
}