import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IgualTest {

    @Test
    public void deveRetornarPontosComRankIgualComDesempenhoRuim(){
        Desempenho desempenho = new Ruim();
        Rank rank = new Igual(15);
        rank.setDesempenho(desempenho);
        assertEquals(15, rank.calcularPontos());
    }

    @Test
    public void deveRetornarPontosComRankIgualComDesempenhoMedio(){
        Desempenho desempenho = new Medio();
        Rank rank = new Igual(15);
        rank.setDesempenho(desempenho);
        assertEquals(20, rank.calcularPontos());
    }

    @Test
    public void deveRetornarPontosComRankIgualComDesempenhoBom(){
        Desempenho desempenho = new Bom();
        Rank rank = new Igual(15);
        rank.setDesempenho(desempenho);
        assertEquals(25, rank.calcularPontos());
    }

}
