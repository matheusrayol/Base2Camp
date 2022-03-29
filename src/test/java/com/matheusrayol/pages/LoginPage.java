package com.matheusrayol.pages;

import com.matheusrayol.bases.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {
    // Mapeando os elementos da página de login
    By usernameField = By.xpath("//input[@name='username']");
    By passwordField = By.xpath("//input[@name='password']");
    By loginButton = By.xpath("//input[@type='submit']");
    By errorMessage = By.xpath("//font[@color='red']");

    // Ações da página de login
    public void preencherUsuario(String usuario) {
        sendKeys(usernameField, usuario);
    }

    public void preencherSenha(String senha) {
        sendKeys(passwordField, senha);
    }

    public void clicarBotaoLogin() {
        click(loginButton);
    }

    public String retornaMensagemErroLogin() {
        return getText(errorMessage);
    }
}