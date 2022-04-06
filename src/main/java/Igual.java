public class Igual extends Rank{

    public Igual(int pontos){
        super(pontos);
    }

    public int calcularPontos() {
        return this.pontos + this.desempenho.PontosAdicionais();
    }

}
