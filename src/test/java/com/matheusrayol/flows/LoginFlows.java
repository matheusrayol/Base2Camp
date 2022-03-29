package com.matheusrayol.flows;

import com.matheusrayol.pages.LoginPage;
import org.junit.Assert;

public class LoginFlows {
    // Objects e constructors
    LoginPage loginPage;

    public LoginFlows() {
        loginPage = new LoginPage();
    }

    // Flows
    public void efetuarLogin(String usuario, String senha) {
        loginPage.preencherUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarBotaoLogin();
    }
}
