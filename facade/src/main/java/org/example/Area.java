package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Area {

    private List<Atleta> atletasComPendencia = new ArrayList<Atleta>();

    public void addAtletaPendente(Atleta atleta) {
        this.atletasComPendencia.add(atleta);
    }

    public boolean verificarAtletaComPendencia(Atleta atleta) {
        return this.atletasComPendencia.contains(atleta);
    }

}
