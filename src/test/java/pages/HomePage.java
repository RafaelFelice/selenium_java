package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class HomePage extends BasePage {
    public HomePage(WebDriver navegador) {
        super(navegador);
    }

    public HomePage capturarTextoHome(String EsteESeuSistemaParaAdministrarSeuEcommerce){
        WebElement mensagemPop = navegador.findElement(By.xpath("//p[text()='Este é seu sistema para administrar seu ecommerce.']"));
        String mensagem = mensagemPop.getText();
        assertEquals("Este é seu sistema para administrar seu ecommerce.", mensagem);

        return this;
    }

    public CadastrarProdutosPage clicarEmCadastrar(){
        navegador.findElement(By.linkText("Cadastrar")).click();
        return new CadastrarProdutosPage(navegador);
    }



}
