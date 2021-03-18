package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createCrhome() {
        System.setProperty("Webdriver.chrome.driver","C:\\Users\\lucas\\Desktop\\ProjetoServeRest.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Navegando para a págnina Teste ServeRest
        navegador.get("https://serverest.netlify.app/login");

        return navegador;
    }
}
