package pilares.heranca;

import pilares.abstracao.Animal;

public class Gato extends Animal {
    public Gato(String nome, Integer numeroDePatas, String raca, Float altura) {
        super(nome, numeroDePatas, raca, altura);
    }

    public String miar() {
        return "Miaaaaaau!!";
    }
}
