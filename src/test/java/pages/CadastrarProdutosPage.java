package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class CadastrarProdutosPage extends BasePage {
    public CadastrarProdutosPage(WebDriver navegador) {
        super(navegador);
    }

    public CadastrarProdutosPage digitarName(String kitVasco){
        navegador.findElement(By.name("name")).sendKeys(kitVasco);
        return this;
    }

    public CadastrarProdutosPage digitarPreco(String preço){
        navegador.findElement(By.name("price")).sendKeys(preço);
        return this;
    }

    public CadastrarProdutosPage digitarDescricao(String descriçao){
        navegador.findElement(By.id("exampleFormControlTextarea1")).sendKeys(descriçao);
        return this;
    }

    public CadastrarProdutosPage digitarQuantidade(String quantidade){
        navegador.findElement(By.name("quantity")).sendKeys(quantidade);
        return this;
    }

    public CadastrarProdutosPage clicarCadastrarProduto(){
        navegador.findElement(By.xpath("//button[text()='Cadastrar']")).click();
        return this;
    }

    public ListarProdutosPage capturarTextoProd(String listaDosProdutos) {
        WebElement mensagemPop = navegador.findElement(By.cssSelector("h1"));
        String mensagem = mensagemPop.getText();
        assertEquals(mensagem, listaDosProdutos);
        return new ListarProdutosPage(navegador);
    }


}
