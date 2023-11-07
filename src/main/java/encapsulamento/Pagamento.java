package encapsulamento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Pagamento {

    private ContaBancaria pagador;
    private ContaBancaria recebedor;

    protected void pagar(Float valorPago) {
        pagador.setSaldo(-valorPago);
        recebedor.setSaldo(valorPago);
    }
}
