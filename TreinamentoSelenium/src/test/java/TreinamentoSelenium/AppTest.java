package TreinamentoSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

    // Teste Hello World
    @Test
    public void testeHelloWorld() {
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com.br");

        driver.quit();
    }

    @Test
    public void localizarElementosLoginMantis() {
        String url = "https://mantis-prova.base2.com.br/login_page.php";
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);

        driver.findElement(By.name("username"));
        driver.findElement(By.name("password"));

        driver.findElement(By.className("button"));

        driver.quit();
    }

    @Test
    public void localizarElementosLoginMantisPorXpath() {
        String url = "https://mantis-prova.base2.com.br/login_page.php";
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//*[@name='username']"));
        driver.findElement(By.xpath("//*[@name='password']"));

        driver.findElement(By.xpath("//*[@class='button']"));

        driver.quit();
    }
}
