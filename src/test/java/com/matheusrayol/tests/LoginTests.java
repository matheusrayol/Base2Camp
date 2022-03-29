package com.matheusrayol.tests;

import com.matheusrayol.GlobalParameters;
import com.matheusrayol.bases.TestBase;
import com.matheusrayol.flows.LoginFlows;
import com.matheusrayol.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTests extends TestBase {
    // Objects
    LoginPage loginPage;
    LoginFlows loginFlows;

    // Tests
    @Test
    public void loginComAcessoInvalido() {

        // Objects instantiation
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();

        // Parameters
        String usuario = "usuario.invalido";
        String senha = "123mudar";
        String mensagemEsperada = "Your account may be disabled or blocked or the username/password you entered is incorrect.";

        // Test
        loginFlows.efetuarLogin(usuario, senha);

        // Assertions
        Assert.assertTrue(loginPage.retornaMensagemErroLogin().contains(mensagemEsperada));
    }

    @Test
    public void loginComAcessoValido() {

        // Objects instantiation
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();

        // Parameters
        String usuario = GlobalParameters.USERNAME_DEFAULT;
        String senha = GlobalParameters.PASSWORD_DEFAULT;
        String mensagemEsperada = "Logged in as:";

        // Test
        loginFlows.efetuarLogin(usuario, senha);

        // Assertions
        Assert.assertTrue(loginPage.retornaMensagemSucessoLogin().contains(mensagemEsperada));
    }


}
