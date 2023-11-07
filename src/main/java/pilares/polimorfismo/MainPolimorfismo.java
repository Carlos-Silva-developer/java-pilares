package pilares.polimorfismo;

public class MainPolimorfismo {
    public static void main(String[] args) {
        Espetaculo opera = new Opera();
        Espetaculo futebol = new Futebol();

        System.out.println(futebol.calcularLucro(5000));
        System.out.println(opera.calcularLucro(250));

    }
}
