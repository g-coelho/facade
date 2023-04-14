import org.example.Atleta;
import org.example.Dieta;
import org.example.Saude;
import org.example.Treinamento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtletaTest {

    @Test
    void deveRetornarPendenciaDietaCompetir() {
        Atleta atleta = new Atleta();
        Dieta.getInstancia().addAtletaPendente(atleta);

        assertEquals(false, atleta.competir());
    }

    @Test
    void deveRetornarPendenciaSaudeCompetir() {
        Atleta atleta = new Atleta();
        Saude.getInstancia().addAtletaPendente(atleta);

        assertEquals(false, atleta.competir());
    }

    @Test
    void deveRetornarPendenciaTreinamentoCompetir() {
        Atleta atleta = new Atleta();
        Treinamento.getInstancia().addAtletaPendente(atleta);

        assertEquals(false, atleta.competir());
    }

    @Test
    void deveRetornarAtletaSemPendenciaCompetir() {
        Atleta atleta = new Atleta();

        assertEquals(true, atleta.competir());
    }

}