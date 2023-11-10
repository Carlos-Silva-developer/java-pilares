package fundamentos.tipos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class TiposClasses {

    private String string;
    private Integer integer;
    private Float aFloat;
    private Double aDouble;
    // lista não aceita tipos primitivos
    private List<Integer> listaDeInts;
    private List<String> ListaDePalavras;
    // arrays aceitam tipos primitivos
    private Integer[] arrayDeInteger;


}
