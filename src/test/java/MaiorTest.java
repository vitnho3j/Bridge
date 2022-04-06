import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaiorTest {

    @Test
    public void deveRetornarPontosComRankMaiorComDesempenhoRuim(){

        Desempenho desempenho = new Ruim();
        Rank rank = new Maior(25);
        rank.setDesempenho(desempenho);
        assertEquals(25, rank.calcularPontos());

    }

    @Test
    public void deveRetornarPontosComRankMaiorComDesempenhoMedio(){
        Desempenho desempenho = new Medio();
        Rank rank = new Maior(25);
        rank.setDesempenho(desempenho);
        assertEquals(30, rank.calcularPontos());
    }

    @Test
    public void deveRetornarPontosComRankMaiorComDesempenhoBom(){
        Desempenho desempenho = new Bom();
        Rank rank = new Maior(25);
        rank.setDesempenho(desempenho);
        assertEquals(35, rank.calcularPontos());
    }

}
