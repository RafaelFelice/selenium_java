package tests;

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
                .digitarEmail("rafaelfelice92@gmail.com")
                .digitarSenha("rafael10")
                .clicarEntrarLogin()
                .capturarTextoHome("EsteESeuSistemaParaAdministrar");
    }

    @Test
    public void testCadastrarUsuario01() {
        new LoginPage(navegador)
                .clicarCadastrese()
                .capturarTexto("cadastro")
                .digitarNome("Rafael de Felice")
                .digitarEmail("rafaelfelice@gmail.com")
                .digitarSenha("rafael10")
                .clicarCadastrarComoAdm()
                .clicarEntrar();
    }

}
