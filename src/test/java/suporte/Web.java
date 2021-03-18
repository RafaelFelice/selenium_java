package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createCrhome() {
        WebDriver navegador = new ChromeDriver();

        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.manage().window().maximize();

        navegador.get("https://serverest.netlify.app/login");

        return navegador;
    }
}
