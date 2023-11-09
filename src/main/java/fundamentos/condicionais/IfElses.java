package fundamentos.condicionais;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter @Setter
public class IfElses {

    private boolean luzAcesa;
    private List<Integer> numeros = new ArrayList<>();

    public String apertarBotao() {
        if (luzAcesa)
            return"A luz esta acesa!";
        else
            return "A luz Está apagada!";
    }

    public List<Integer> listarNumerosEmSequencia() {
        return numeros
                    .stream()
                    .sorted()
                    .collect(Collectors.toList());
    }
}
