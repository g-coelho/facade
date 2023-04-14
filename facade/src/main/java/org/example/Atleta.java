package org.example;

public class Atleta {

    public boolean competir() {
        return AtletaFacade.verificarPendenciasCompetir(this);
    }

}
