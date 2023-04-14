package org.example;

public class Saude extends Area {

    private static Saude saude = new Saude();

    private Saude() {};

    public static Saude getInstancia() {
        return saude;
    }
}
