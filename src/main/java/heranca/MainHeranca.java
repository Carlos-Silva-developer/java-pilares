package heranca;

import abstracao.Animal;

public class MainHeranca {
    public static void main(String[] args) {
        Gato gato = new Gato("Fred", 4, "Vira Lata", 0.41f);
        Cachorro cachorro = new Cachorro("Tobby", 4, "Labrador", 0.67f);

        System.out.println(gato);
        System.out.println(gato.miar());
        System.out.println(cachorro);
        System.out.println(cachorro.latir());
    }
}
