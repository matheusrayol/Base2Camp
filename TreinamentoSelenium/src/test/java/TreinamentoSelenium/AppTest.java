package TreinamentoSelenium;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    // Exemplos de assertTrue
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }

    @Test
    public void meuPrimeiroTeste() {
        String fruta = "Pera";

        Assert.assertTrue(fruta.equals("Pera"));
    }

    @Test
    public void meuSegundoTeste() {
        String carro = "Uno";

        Assert.assertTrue(carro.equals("Uno"));
    }

    // Exemplos de assertEquals
    @Test
    public void testeComAssertEquals() {
        String fruta = "Pera";

        Assert.assertEquals("Validação do valor na variável fruta", "Laranja", fruta);
    }

}
