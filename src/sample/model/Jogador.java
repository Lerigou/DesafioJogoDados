package sample.model;

public class Jogador {

    private String nome;
    private boolean vencer;
    private int pontos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVencer() {
        return vencer;
    }

    public void setVencer(boolean vencer) {
        this.vencer = vencer;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }


    @Override
    public String toString() {
        return "Jogador = " + nome +
                ", venceu: " + (vencer ? "Sim" : "não") +
                ", pontos: " + pontos;
    }
}
