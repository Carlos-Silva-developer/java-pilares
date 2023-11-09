package fundamentos.repeticao;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
public class Fors {

    String[] nomes;
    List<String> listaDeNomes;

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    public void setListaDeNomes(List<String> listaDeNomes) {
        this.listaDeNomes = listaDeNomes;
    }

    public void listarNomesComFor() {
        for (int i = 0; i<nomes.length; i++)
            System.out.println(nomes[i]);
    }

    public void listarNomesComEnhancedFor() {
        for(String nome : listaDeNomes)
            System.out.println(nome);
    }

}
