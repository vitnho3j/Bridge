public class Maior extends Rank{

    public Maior(int pontos){
        super(pontos);
    }

    public int calcularPontos() {
        return this.pontos + this.desempenho.PontosAdicionais();
    }

}
