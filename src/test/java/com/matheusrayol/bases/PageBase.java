package com.matheusrayol.bases;

import com.matheusrayol.GlobalParameters;
import com.matheusrayol.utils.DriverUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.lang3.time.StopWatch;
import java.time.Duration;

public class PageBase {
    // Variáveis globais
    protected WebDriverWait wait;
    protected WebDriver driver;
    protected JavascriptExecutor javaScriptExecutor;

    // Constructor
    public PageBase() {
        wait = new WebDriverWait(DriverUtils.INSTANCE, Duration.ofSeconds(GlobalParameters.TIMEOUT_DEFAULT));
        driver = DriverUtils.INSTANCE;
        javaScriptExecutor = (JavascriptExecutor) driver;
    }

    // Ações personalizadas
    private void waitForPageToLoad() {
        StopWatch timeOut = new StopWatch();
        timeOut.start();

        while (timeOut.getTime() <= GlobalParameters.TIMEOUT_DEFAULT) {
            String documentState = javaScriptExecutor.executeScript("return document.readyState").toString();
            if (documentState.equals("complete")) {
                timeOut.stop();
                break;
            }
        }
    }

    protected WebElement waitForElement(By locator) {
        waitForPageToLoad();
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement element = driver.findElement(locator);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    protected void click(By locator) {
        waitForElement(locator).click();
    }

    protected void sendKeys(By locator, String text) {
        waitForElement(locator).sendKeys(text);
    }

    protected String getText(By locator) {
        return waitForElement(locator).getText();
    }

    protected void selectComboBox(By locator, String text) {
        Select comboBox = new Select(waitForElement(locator));
        comboBox.selectByVisibleText(text);
    }
}