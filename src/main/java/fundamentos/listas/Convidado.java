package fundamentos.listas;

import lombok.Getter;

import static fundamentos.listas.Status.*;

@Getter
public class Convidado {

    String nome;
    Status status;

    public Convidado(String nome) {
        this.nome = nome;
        this.status = PENDENTE;
    }

    public Convidado(String nome, Status status) {
        this.nome = nome;
        this.status = status;
    }

    public String confirmarConvite() {
        this.status = CONFIRMADO;
        return "Convite Confirmado";
    }

    public String recusarConvite() {
        this.status = RECUSADO;
        return "Convite Recusado!";
    }


    @Override
    public String toString() {
        return "Nome: " + nome +
                "\n:: status: " + status + "\n";
    }
}

