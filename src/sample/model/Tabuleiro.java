package sample.model;

public class Tabuleiro {

    private List<Jogador> jogadores;
    private Dado d1, d2;

    public Tabuleiro(){
        jogadores = new ArrayList<Jogador>();
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();

        jogador1.setNome("Paulo");
        jogador2.setNome("Bruno");
        jogadores.add(jogador1);
        jogadores.add(jogador2);
    }

    public void jogar(){
        for (int i = 0; i < jogadores.size(); i++){
            d1.lancar();
            d2.lancar();
            int pontos = d1.getFace()+d2.getFace();
            jogadores.get(i).setPontos(pontos);

            jogadores.get(i).setVencer(pontos == 7);
        }
    }

    public void mostrarResultado(){

        System.out.println("Resultado: ");

        for (int i = 0; i < jogadores.size(); i++){

            System.out.println(jogadores.get(i).toString());
        }
    }

}
