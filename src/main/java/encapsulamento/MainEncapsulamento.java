package encapsulamento;

import abstracao.Pessoa;

import java.time.LocalDate;

public class MainEncapsulamento {

    public static void main(String[] args) {

        Pessoa carlos = new Pessoa("Carlos", LocalDate.of(1986,5,6));
        Pessoa maria = new Pessoa("Maria", LocalDate.of(1947,3,27));

        ContaBancaria contaCarlos = new ContaBancaria(carlos, 1, 1000f);
        ContaBancaria contaMaria = new ContaBancaria(maria, 2, 1000f);

        Pagamento pagamento = new Pagamento(contaCarlos, contaMaria);

        pagamento.pagar(300.5f);

        System.out.println(contaCarlos);
        System.out.println("=============");
        System.out.println(contaMaria);
    }
}
