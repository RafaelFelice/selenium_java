package tests;

import com.sun.deploy.perf.PerfRollup;
import org.junit.After;
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
                .digitarSenha("a")
                .clicarEntrarErro()
                .textoSenhaInvalida("Email e/ou senha inválidos");
    }

    @Test
    public void testEmailInvalido() {
        new LoginPage(navegador)
                .digitarEmail("rafael@gmail.com")
                .digitarSenha("rafael10")
                .clicarEntrarErro()
                .textoSenhaInvalida("Email e/ou senha inválidos");
    }


    @Test
    public void testCadastroSenhaEmBranco(){
        new LoginPage(navegador)
                .clicarCadastrese()
                .digitarNome("Rafael de Felice")
                .digitarEmail("rafaelfelice@gmail.com")
                .digitarSenha("")
                .clicarCadastrarComoAdm()
                .clicarEntrar()
                .textoSenhaEmBranco("password não pode ficar em branco");
    }


    @After
    public void tearDown(){
        navegador.quit();
    }


}
