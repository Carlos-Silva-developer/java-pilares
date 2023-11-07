package fundamentos.tipos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class TiposPrimitivos {


    private int anInt;
    private boolean aBoolean;
    private float aFloat;
    private char aChar;
    private double aDouble;


    @Override
    public String toString() {
        return  "int, é um numero inteiro: " + anInt +
                "\nboolean, é verdadeiro ou falso: " + aBoolean +
                "\nfloat, é um numero com casas decimais, parecido com double: " + aFloat +
                "\nchar, é um caracter único: " + aChar +
                "\ndouble, é similar ao float porém comporta numeros maiores e mais casas após a vírgula: " + aDouble;
    }
}
