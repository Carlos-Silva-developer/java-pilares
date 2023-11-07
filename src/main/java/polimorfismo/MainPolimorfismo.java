package polimorfismo;

public class MainPolimorfismo {
    public static void main(String[] args) {
        Opera opera = new Opera();
        Futebol futebol = new Futebol();

        System.out.println(futebol.calcularLucro(5000));
        System.out.println(opera.calcularLucro(250));

    }
}
