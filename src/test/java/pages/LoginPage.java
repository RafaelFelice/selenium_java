package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver navegador) {
        super(navegador);
    }

    public final By BTN_CADASTRAR = By.linkText("Cadastre-se");
    private final By INPUT_EMAIL = By.name("email");
    private final By INPUT_PASS = By.name("password");
    private final By BTN_ENTRAR = By.xpath("//button[text()='Entrar']");
    public final By MENSAGEM_HOME_PAGE = By.xpath("//p[text()='Este é seu sistema para administrar seu ecommerce.']");
    public final By RESULTADO_MENSAGEM = By.xpath("//b");


    public CadastrarUsuariosPage clicarCadastrese() {
        navegador.findElement(BTN_CADASTRAR).click();
        return new CadastrarUsuariosPage(navegador);
    }

    public LoginPage digitarEmail(String email) {
        navegador.findElement(INPUT_EMAIL).sendKeys(email);
        return this;
    }

    public LoginPage digitarSenha(String senha) {
        navegador.findElement(INPUT_PASS).sendKeys(senha);
        return this;
    }

    public HomePage clicarEntrarLogin() {
        navegador.findElement(BTN_ENTRAR).click();
        return new HomePage(navegador);
    }

    public HomePage capturarTextoHome(String EsteESeuSistemaParaAdministrarSeuEcommerce) {
        WebElement mensagemPop = navegador.findElement(MENSAGEM_HOME_PAGE);
        String mensagem = mensagemPop.getText();
        assertEquals(mensagem, EsteESeuSistemaParaAdministrarSeuEcommerce);

        return new HomePage(navegador);
    }


    public LoginPage clicarEntrarErro() {
        navegador.findElement(BTN_ENTRAR).click();
        return this;
    }


    public LoginPage textoSenhaInvalida(String senhaInvalida) {
        WebElement mensagemPop = navegador.findElement(RESULTADO_MENSAGEM);
        String mensagem = mensagemPop.getText();
        assertEquals(mensagem, senhaInvalida);

        return this;
    }


}
