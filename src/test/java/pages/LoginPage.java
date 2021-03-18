package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver navegador) {
        super(navegador);
    }

    public CadastrarUsuariosPage clicarCadastrese() {
        navegador.findElement(By.linkText("Cadastre-se")).click();
        return new CadastrarUsuariosPage(navegador);
    }

    public LoginPage digitarEmail(String email){
        navegador.findElement(By.name("email")).sendKeys("rafaelfelice@gmail.com");
        return this;
    }

    public LoginPage digitarSenha(String senha){
        navegador.findElement(By.name("password")).sendKeys("rafael10");
        return this;
    }

    public HomePage clicarEntrarLogin(){
        navegador.findElement(By.xpath("//button[text()='Entrar']")).click();
        return new HomePage(navegador);
    }

    public HomePage capturarTextoHome(String EsteESeuSistemaParaAdministrarSeuEcommerce){
        WebElement mensagemPop = navegador.findElement(By.xpath("//p[text()='Este é seu sistema para administrar seu ecommerce.']"));
        String mensagem = mensagemPop.getText();
        assertEquals("Este é seu sistema para administrar seu ecommerce.", mensagem);

        return new HomePage(navegador);
    }

    public LoginPage digitarSenhaErro(String senha_Erro){
        navegador.findElement(By.name("password")).sendKeys("a");
        return this;
    }

    public LoginPage clicarEntrarErro(){
        navegador.findElement(By.xpath("//button[text()='Entrar']")).click();
        return this;
    }


    public LoginPage textoSenhaInvalida(String SenhaInvalida){
        WebElement mensagemPop = navegador.findElement(By.xpath("//b"));
        String mensagem = mensagemPop.getText();
        assertEquals("Email e/ou senha inválidos", mensagem);

        return this;
    }



}
