package org.example;

public class AtletaFacade {
    public static boolean verificarPendenciasCompetir(Atleta atleta) {
    if (Dieta.getInstancia().verificarAtletaComPendencia(atleta)) {
        return false;
    }
    if (Saude.getInstancia().verificarAtletaComPendencia(atleta)) {
        return false;
    }
    if (Treinamento.getInstancia().verificarAtletaComPendencia(atleta)) {
        return false;
    }
    return true;
}
}

