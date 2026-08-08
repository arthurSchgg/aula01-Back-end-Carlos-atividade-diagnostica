package Desafio06;

import java.util.Scanner;

public class IndustrialRegistry {
    Peca peca = new Peca();
    PecaFragil pecaFragil = new PecaFragil();
    PecaPesada pecaPesada = new PecaPesada();
    
    public void calcPecaPadrao() {
        double calcfrete = 5 * peca.getWeight();
    }

    public void calcPecaFragil() {
        double calcFreteFragil = 8 * pecaFragil.getWeight() + 50;
    }

    public void calcPecaPesada() {
        double caclFretePesada = 12 * pecaPesada.getWeight();
    }
}
