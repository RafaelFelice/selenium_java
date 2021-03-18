package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class CadastrarUsuariosPage extends BasePage {
    public CadastrarUsuariosPage(WebDriver navegador) {
        super(navegador);
    }

    private final LoginPage login = new LoginPage(navegador);

    private final By FORMULARIO = By.className("form");
    private final By INPUT_NAME = By.name("nome");
    private final By INPUT_EMAIL = By.name("email");
    private final By INPUT_PASS = By.name("password");
    private final By BTN_ENTRAR = By.cssSelector("button");
    private final By BTN_CADASTRAR_ADM = By.className("form-check-input");



    public CadastrarUsuariosPage digitarNome(String nome) {
        navegador.findElement(FORMULARIO).findElement(INPUT_NAME).sendKeys(nome);

        return this;
    }

    public CadastrarUsuariosPage digitarEmail(String email) {
        navegador.findElement(FORMULARIO).findElement(INPUT_EMAIL).sendKeys(email);

        return this;

    }

    public CadastrarUsuariosPage digitarSenha(String senha) {
        navegador.findElement(FORMULARIO).findElement(INPUT_PASS).sendKeys(senha);

        return this;
    }

    public CadastrarUsuariosPage clicarEntrar() {
        navegador.findElement(FORMULARIO).findElement(BTN_ENTRAR).click();

        return this;

    }

    public CadastrarUsuariosPage clicarCadastrarComoAdm() {
        navegador.findElement(FORMULARIO).findElement(BTN_CADASTRAR_ADM).click();

        return this;

    }

    public CadastrarUsuariosPage textoSenhaEmBranco(String senhaEmBranco){
        WebElement mensagemPop = navegador.findElement(login.RESULTADO_MENSAGEM);
        String mensagem = mensagemPop.getText();
        assertEquals(mensagem, senhaEmBranco);

        return this;
    }





}