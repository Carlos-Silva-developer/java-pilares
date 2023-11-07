package abstracao;

public abstract class Animal {

    private String nome;
    private Integer numeroDePatas;

    private String raca;
    private boolean voador;
    private Float altura;

    public Animal(String nome, Integer numeroDePatas, String raca, Float altura) {
        this.nome = nome;
        this.numeroDePatas = numeroDePatas;
        this.raca = raca;
        this.voador = false;
        this.altura = altura;
    }

    public Animal(String nome, Integer numeroDePatas, boolean voador, Float altura) {
        this.nome = nome;
        this.numeroDePatas = numeroDePatas;
        this.voador = voador;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Animal " +
                "\nNome: " + nome +
                "\nRaça: " + raca;
    }

    public void sound() {
        System.out.println("Som feito pelo animal!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(Integer numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isVoador() {
        return voador;
    }

    public void setVoador(boolean voador) {
        this.voador = voador;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }
}
