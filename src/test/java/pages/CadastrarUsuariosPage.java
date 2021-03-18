package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class CadastrarUsuariosPage extends BasePage {
    public CadastrarUsuariosPage(WebDriver navegador) {
        super(navegador);
    }


    public CadastrarUsuariosPage digitarNome(String nome) {
        navegador.findElement(By.className("form")).findElement(By.name("nome")).sendKeys(nome);

        return this;
    }

    public CadastrarUsuariosPage digitarEmail(String email) {
        navegador.findElement(By.className("form")).findElement(By.name("email")).sendKeys(email);

        return this;

    }

    public CadastrarUsuariosPage digitarSenha(String senha) {
        navegador.findElement(By.className("form")).findElement(By.name("password")).sendKeys(senha);

        return this;
    }

    public CadastrarUsuariosPage clicarEntrar() {
        navegador.findElement(By.className("form")).findElement(By.cssSelector("button")).click();

        return this;

    }

    public CadastrarUsuariosPage clicarCadastrarComoAdm() {
        navegador.findElement(By.className("form")).findElement(By.className("form-check-input")).click();

        return this;

    }

    public CadastrarUsuariosPage textoSenhaEmBranco(String senhaEmBranco){
        WebElement mensagemPop = navegador.findElement(By.xpath("//b"));
        String mensagem = mensagemPop.getText();
        assertEquals(mensagem, senhaEmBranco);

        return this;
    }





}