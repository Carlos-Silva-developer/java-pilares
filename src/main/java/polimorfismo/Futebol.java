package polimorfismo;

public class Futebol implements Espetaculo{

    public static final Float VALOR_INGRSSO = 180f;
    @Override
    public Float calcularLucro(Integer pagantes) {
        Float retorno = (pagantes * VALOR_INGRSSO) * 0.67f;
        return retorno;
    }
}
