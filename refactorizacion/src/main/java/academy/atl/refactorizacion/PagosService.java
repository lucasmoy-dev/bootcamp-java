package academy.atl.refactorizacion;

public class PagosService {

    private PaypalConnection paypalConnection;
    public PagosService(PaypalConnection paypalConnection) {
        this.paypalConnection = paypalConnection;
    }
    public void pagar(int monto, String metodoDePago) {
        if ("Paypal".equals(metodoDePago)) {
            paypalConnection.pagar(100);
        }
    }
}
