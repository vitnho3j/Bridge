import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenorTest {

    @Test
    public void deveRetornarPontosComRankMenorComDesempenhoRuim(){
        Desempenho desempenho = new Ruim();
        Menor rank = new Menor(10);
        rank.setDesempenho(desempenho);
        assertEquals(10, rank.calcularPontos());
    }

    @Test
    public void deveRetornarPontosComRankMenorComDesempenhoMedio(){
        Desempenho desempenho = new Medio();
        Menor rank = new Menor(10);
        rank.setDesempenho(desempenho);
        assertEquals(10, rank.calcularPontos());
    }

    @Test
    public void deveRetornarPontosComRankMenorComDesempenhoBom(){
        Desempenho desempenho = new Bom();
        Menor rank = new Menor(10);
        rank.setDesempenho(desempenho);
        assertEquals(10, rank.calcularPontos());
    }

}
