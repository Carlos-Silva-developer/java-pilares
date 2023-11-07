package encapsulamento;

import abstracao.Pessoa;
import lombok.Getter;

@Getter
public class ContaBancaria {

    private Pessoa titular;
    private Integer numeroDaConta;
    private Float saldo;


    protected ContaBancaria(Pessoa titular, Integer numeroDaConta) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0f;
    }

    protected ContaBancaria(Pessoa titular, Integer numeroDaConta, Float saldo) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    protected void setSaldo(Float valor) {
        this.saldo += valor;
    }


    @Override
    public String toString() {
        return "Conta: " +
                "\nTitular: " + titular +
                "\nConta: " + numeroDaConta +
                "\nSaldo: "+ saldo;
    }
}
