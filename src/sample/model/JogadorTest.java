import org.junit.jupiter.api.Test;
import sample.model.Jogador;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    public void testeJogador(){
        Jogador jogador1 = new Jogador();
        jogador1.setNome("Marcinha");
        jogador1.setVencer(true);
        jogador1.setPontos(7);

        System.out.println(jogador1);
    }

}