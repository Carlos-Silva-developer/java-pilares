package fundamentos.tipos;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MainTipos {
    public static void main(String[] args) {

        TiposPrimitivos tiposPrimitivos = new TiposPrimitivos();
        TiposClasses tiposClasses = new TiposClasses();
        Integer numeros[] = new Integer[1];

        List<Integer> listaInt = new ArrayList<>();
        listaInt.add(1);
        listaInt.add(10);
        listaInt.add(15);

        List<String> listString = new ArrayList<>();
        listString.add(1,"Hello ");
        listString.add(2,"World");
        listString.add(3,"!!");

        tiposPrimitivos.setAnInt(55);
        tiposPrimitivos.setABoolean(true);
        tiposPrimitivos.setAFloat(55.78f);
        tiposPrimitivos.setAChar('A');
        tiposPrimitivos.setADouble(5153.514887);

        tiposClasses.setString("String aqui");
        tiposClasses.setInteger(55);
        tiposClasses.setAFloat(55.748f);
        tiposClasses.setADouble(54854.85455884);
        tiposClasses.setListaDeInts(listaInt);
        tiposClasses.setListaDePalavras(listString);
        numeros[0] = 1655;

        System.out.println(tiposPrimitivos);
    }
}
