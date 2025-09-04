package org.example;

public class Resta {
    // Atributos
    private int numero1;
    private int numero2;

    // Constructor
    public Resta(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Método para obtener resultado
    public int getResultado() {
        return numero1 - numero2;
    }

    // Métodos getters
    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }
}