package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class HomePage extends BasePage {
    public HomePage(WebDriver navegador) {
        super(navegador);
    }

    private final LoginPage login = new LoginPage(navegador);

    public HomePage capturarTextoHome(String sistemaParaAdministrador){
        WebElement mensagemPop = navegador.findElement(login.MENSAGEM_HOME_PAGE);
        String mensagem = mensagemPop.getText();
        assertEquals(mensagem, sistemaParaAdministrador);

        return this;
    }

    public CadastrarProdutosPage clicarEmCadastrar(){
        navegador.findElement(login.BTN_CADASTRAR).click();
        return new CadastrarProdutosPage(navegador);
    }



}
