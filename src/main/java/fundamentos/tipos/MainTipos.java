package fundamentos.tipos;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MainTipos {
    public static void main(String[] args) {

        TiposPrimitivos tiposPrimitivos = new TiposPrimitivos();
        TiposClasses tiposClasses = new TiposClasses();

        List<Integer> listaInt = new ArrayList<>();
        listaInt.add(1);
        listaInt.add(10);
        listaInt.add(15);
        listaInt.add(365);
        listaInt.add(14444);

        List<String> listString = new ArrayList<>();
        listString.add("Hello ");
        listString.add("World");
        listString.add("!!");

        Integer[] numeros = new Array();


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


        System.out.println(tiposPrimitivos);
    }
}
