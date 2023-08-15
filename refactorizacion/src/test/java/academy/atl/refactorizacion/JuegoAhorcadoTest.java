package academy.atl.refactorizacion;

//import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class JuegoAhorcadoTest {

    @Test
    public void ocultarPalabra() {
        String[] palabras = {"programacion", "computadora", "java", "desarrollo", "tecnologia"};
        JuegoAhorcado juegoAhorcado = new JuegoAhorcado(6, palabras);

        char[] palabraOculta = juegoAhorcado.ocultarPalabra("QUESO");
        char[] palabraOcultaExpected = {'_','_','_','_','_'};
        for (int i = 0; i < palabraOcultaExpected.length; i++) {
            assertEquals(palabraOcultaExpected[i], palabraOculta[i]);
        }

    }

    @Mock
    private PaypalConnection paypalConnection;

    @Test
    public void probarPagosConPaypal() {
        doNothing().when(paypalConnection).pagar(any());

        PagosService pagos = new PagosService(paypalConnection);
        pagos.pagar(100, "Paypal");

        verify(paypalConnection, times(1)).pagar(100);
    }

}
