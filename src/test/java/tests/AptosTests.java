package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.CadastrarProdutosPage;
import pages.HomePage;
import pages.LoginPage;
import suporte.Web;

public class AptosTests {
    private WebDriver navegador;


    @Before
    public void setUp() {
        navegador = Web.createCrhome();
    }

    @Test
    public void testLogin() {
        new LoginPage(navegador)
                .digitarEmail("rafaelfelice@gmail.com")
                .digitarSenha("rafael10")
                .clicarEntrarLogin()
                .capturarTextoHome("Este é seu sistema para administrar seu ecommerce.");
    }

    @Test
    public void testCadastrarUsuario01() {
        new LoginPage(navegador)
                .clicarCadastrese()
                .digitarNome("Rafael de Felice")
                .digitarEmail("rafaelfelice@gmail.com")
                .digitarSenha("rafael10")
                .clicarCadastrarComoAdm()
                .clicarEntrar();
    }

    @After
    public void tearDown(){
        navegador.quit();
    }


}
