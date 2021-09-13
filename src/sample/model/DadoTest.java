package sample.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DadoTest {

    @Test
    public void testeDado(){
    Dado dado = new Dado();
    dado.lancar();
    int face = dado.getFace();

    if ( face >= 1 && face <= 6 ){
        System.out.println("valor sorteado pelo dado: " + face);
    } else {
        fail("Erro ao sortear valor!");
    }
    }

}