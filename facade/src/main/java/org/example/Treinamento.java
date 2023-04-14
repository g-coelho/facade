package org.example;

public class Treinamento extends Area {

    private static Treinamento treinamento = new Treinamento();

    private Treinamento() {};

    public static Treinamento getInstancia() {
        return treinamento;
    }
}