public abstract class Rank {

    protected Desempenho desempenho;

    protected int pontos;

    public Rank(int pontos){
        this.pontos = pontos;
    }

    public void setDesempenho(Desempenho desempenho){
        this.desempenho = desempenho;
    }

    public void setPontos(int pontos){
        this.pontos = pontos;
    }

    public abstract int calcularPontos();

}
