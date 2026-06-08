package com.empresa;

public class Login {
    private int intentos = 0;
    private static final int MAX_INTENTOS = 3;
    private boolean bloqueado = false;

    public boolean intentarLogin(String usuario, String password) {
        if (bloqueado) return false;

        if (usuario.equals("admin") && password.equals("1234")) {
            intentos = 0; 
            return true;
        } else {
            intentos++;
            if (intentos >= MAX_INTENTOS) {
                bloqueado = true;
            }
            return false;
        }
    }

    public boolean estaBloqueado() {
        return bloqueado;
    }
}