package abstracao;

import heranca.Cachorro;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    private String nome;
    private Animal animal;
    private LocalDate nascimento;

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.animal = new Cachorro("Ainda não Adotou", 0, "Raça a definir", 0.0f);
    }

    @Override
    public String toString() {
        return  "Pessoa " +
                "\nNome: " + nome +
                "\nNascimento: " + nascimento;
    }
}
