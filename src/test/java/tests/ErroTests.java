package tests;

import com.sun.deploy.perf.PerfRollup;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suporte.Web;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErroTests {
    private WebDriver navegador;


    @Before
    public void setUp() {
        navegador = Web.createCrhome();
    }

    @Test
    public void testSenhaInvalida() {
        new LoginPage(navegador)
                .digitarEmail("rafaelfelice@gmail.com")
                .digitarSenhaErro("a")
                .clicarEntrarErro()
                .textoSenhaInvalida("SenhaInvalida");
    }



}
