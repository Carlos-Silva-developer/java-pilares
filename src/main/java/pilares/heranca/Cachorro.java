package pilares.heranca;

import pilares.abstracao.Animal;
import lombok.Getter;

@Getter
public class Cachorro extends Animal {

    public Cachorro(String nome, Integer numeroDePatas, String raca, Float altura) {
        super(nome, numeroDePatas, raca, altura);
    }

    public String latir() {
        return "Au!Au!";
    }

}
