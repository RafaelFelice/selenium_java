package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class CadastrarProdutosPage extends BasePage {
    public CadastrarProdutosPage(WebDriver navegador) {
        super(navegador);
    }

    private final By INPUT_NAME = By.name("name");
    private final By INPUT_PRECO = By.name("price");
    private final By INPUT_DESCRICAO = By.id("exampleFormControlTextarea1");
    private final By INPUT_QNTD = By.name("quantity");
    private final By BTN_CADASTRAR_PROD = By.xpath("//button[text()='Cadastrar']");
    private final By MENSAGEM_PRODUTO = By.cssSelector("h1");


    public CadastrarProdutosPage digitarName(String kitVasco){
        navegador.findElement(INPUT_NAME).sendKeys(kitVasco);
        return this;
    }

    public CadastrarProdutosPage digitarPreco(String preço){
        navegador.findElement(INPUT_PRECO).sendKeys(preço);
        return this;
    }

    public CadastrarProdutosPage digitarDescricao(String descriçao){
        navegador.findElement(INPUT_DESCRICAO).sendKeys(descriçao);
        return this;
    }

    public CadastrarProdutosPage digitarQuantidade(String quantidade){
        navegador.findElement(INPUT_QNTD).sendKeys(quantidade);
        return this;
    }

    public CadastrarProdutosPage clicarCadastrarProduto(){
        navegador.findElement(BTN_CADASTRAR_PROD).click();
        return this;
    }

    public ListarProdutosPage capturarTextoProd(String listaDosProdutos) {
        WebElement mensagemPop = navegador.findElement(MENSAGEM_PRODUTO);
        String mensagem = mensagemPop.getText();
        assertEquals(mensagem, listaDosProdutos);
        return new ListarProdutosPage(navegador);
    }


}
