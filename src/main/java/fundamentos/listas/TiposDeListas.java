package fundamentos.listas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

import static fundamentos.listas.Status.*;


public class TiposDeListas {

    public static void main(String[] args) {
        List<String> nomes;
        Set<Integer> numeros;
        Map<Integer, String> listaChaveada;
        Map<Convidado, Integer> convidados;

        convidados = new HashMap<>();
        convidados.put(new Convidado("Carlos", CONFIRMADO), 1);
        convidados.put(new Convidado("Josiane", RECUSADO), 2);
        convidados.put(new Convidado("Josiane"), 3);


        for(Convidado convidado : convidados.keySet()) {
            if (convidado.getStatus() == CONFIRMADO)
                System.out.println(convidado);
        }

//         arrayList usa como base um array de objetos
        nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Carlos");
        System.out.println("::: LIST ::: \n"+nomes);

        // sets não aceitam valores iguais, logo ao adicionar um novamente ele sobrepõe ou ignora
        numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(1);
        numeros.add(3);
        numeros.add(127);
        System.out.println(numeros);

        //Map usam listas com chave valor, neste caso a chave é um numero e o valor um texto mas ambos podem ser qualquer classe
        listaChaveada = new HashMap<>();
        listaChaveada.put(1, "Carlos");
        listaChaveada.put(2, "Tobias");
        System.out.println(listaChaveada);
    }

}

