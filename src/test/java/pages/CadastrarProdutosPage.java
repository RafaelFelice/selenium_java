package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class CadastrarProdutosPage extends BasePage {
    public CadastrarProdutosPage(WebDriver navegador) {
        super(navegador);
    }

    public CadastrarProdutosPage digitarName(String KitVasco){
        navegador.findElement(By.name("name")).sendKeys("Kit Vasco");
        return this;
    }

    public CadastrarProdutosPage digitarPreco(String Preço){
        navegador.findElement(By.name("price")).sendKeys("400.00");
        return this;
    }

    public CadastrarProdutosPage digitarDescricao(String Descriçao){
        navegador.findElement(By.id("exampleFormControlTextarea1")).sendKeys("Casaco e calça");
        return this;
    }

    public CadastrarProdutosPage digitarQuantidade(String Quantidade){
        navegador.findElement(By.name("quantity")).sendKeys("100");
        return this;
    }

    public CadastrarProdutosPage clicarCadastrarProduto(){
        navegador.findElement(By.xpath("//button[text()='Cadastrar']")).click();
        return this;
    }

    public ListarProdutosPage capturarTextoProd(String ListaDosProdutos) {
        WebElement mensagemPop = navegador.findElement(By.cssSelector("h1"));
        String mensagem = mensagemPop.getText();
        assertEquals("Lista dos Produtos", mensagem);
        return new ListarProdutosPage(navegador);
    }


}
