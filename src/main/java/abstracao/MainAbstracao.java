package abstracao;

import encapsulamento.ContaBancaria;
import heranca.Cachorro;

import java.time.LocalDate;

public class MainAbstracao {

    public static void main(String[] args) {
        Animal pet = new Cachorro("Zeus", 4, "PITBULL", 1.04f);
        Pessoa carlos = new Pessoa("Carlos", LocalDate.of(1986, 5, 6));

//        como o construtor é protected a classe não pode ser chamada de fora do pacote
//        ContaBancaria conta = new ContaBancaria(carlos, 5);

        System.out.println(pet);
        System.out.println("====================");
        System.out.println(carlos);
    }
}
