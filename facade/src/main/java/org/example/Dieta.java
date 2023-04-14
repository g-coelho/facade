package org.example;

public class Dieta extends Area {

    private static Dieta dieta = new Dieta();

    private Dieta() {};

    public static Dieta getInstancia() {
        return dieta;
    }
}
