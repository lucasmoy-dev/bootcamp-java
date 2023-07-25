package academy.atl.newsletters.validators;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class EmailValidatorTest {

    @Test
    public void elEmailTieneQueTenerArroba() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("sdskfjhsdfsdf");
        assertFalse(resultado);
    }

    @Test
    public void elEmailTieneQueTenerPunto() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("lucas@moy");
        assertFalse(resultado);
    }

    @Test
    public void queElArrobaNoSeaLaUltimaLetra() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("luca.smoy@");
        assertFalse(resultado);
    }

    @Test
    public void queNoTengaEspacios() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("luca moy@atl.com");
        assertFalse(resultado);
    }

    @Test
    public void queNoTengaMasDe255Caracteres() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("dfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdgdfhshsdhmoylucadfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdgdfhshsdhmoylucadfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdgdfhshsdhmoylucadfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdgdfhshsdhmoylucadfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdgdfhshsdhmoylucadfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdgdfhshsdhmoy@atl.com");
        assertFalse(resultado);
    }

}
