package fundamentos.condicionais;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Switchs {

    public String selecionarComSwitch(int numero) {
        return switch (numero) {
            case 0 -> "zero";
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "tres";
            case 4 -> "quatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "sete";
            case 8 -> "oito";
            default -> "Só sabemos contar até 8";
        };
    }
}
