package fundamentos.repeticao;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class WhilesAndDoWhiles {

    public void contarComWhile(int numero) {
        int cont = 0;
        while(cont < numero) {
            System.out.println(cont);
            cont++;
        }
    }

    public void contarComDoWhile(int numero) {
        int cont = 0;
        do {
            System.out.println(cont);
            cont++;
        } while(cont < numero);
    }

}
