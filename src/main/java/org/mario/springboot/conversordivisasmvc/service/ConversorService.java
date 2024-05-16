package org.mario.springboot.conversordivisasmvc.service;

import org.springframework.stereotype.Service;

@Service
public class ConversorService {

    public double convertir(double euros, String divisa) {
        switch (divisa) {
            case "LIBRAS":
                return euros * 0.85;
            case "PESETAS":
                return euros * 166.386;
            default:
                throw new IllegalArgumentException("Divisa no soportada");
        }
    }
}
