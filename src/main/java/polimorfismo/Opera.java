package polimorfismo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Opera implements Espetaculo {

    public static final Float VALOR_INGRSSO = 180f;
    @Override
    public Float calcularLucro(Integer pagantes) {
        return pagantes * VALOR_INGRSSO;
    }
}
