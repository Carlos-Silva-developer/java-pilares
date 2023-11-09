package fundamentos.condicionais;


import java.util.*;

public class MainCondicionais {
    public static void main(String[] args) {
        IfElses luz = new IfElses();

        luz.setLuzAcesa(true);
        System.out.println(luz.isLuzAcesa());

        luz.setLuzAcesa(false);
        System.out.println(luz.isLuzAcesa());



    }
}
