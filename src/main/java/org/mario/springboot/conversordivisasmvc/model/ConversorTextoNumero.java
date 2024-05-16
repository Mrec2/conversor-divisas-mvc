package org.mario.springboot.conversordivisasmvc.model;

public class ConversorTextoNumero implements InterfazConversorTextoNumero {

    @Override
    public double convertir(String valor) {
        try {
            return Double.parseDouble(valor);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Valor no válido");
        }
    }
}
