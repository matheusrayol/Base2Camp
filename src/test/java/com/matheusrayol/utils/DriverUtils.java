package com.matheusrayol.utils;

import com.matheusrayol.GlobalParameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverUtils {

    public static WebDriver INSTANCE = null;
    private static final String downloadPath = GlobalParameters.DOWNLOAD_PATH_DEFAULT;

    public static void createInstance() {
        String browser = GlobalParameters.BROWSER_DEFAULT;
        String execution = GlobalParameters.EXECUTION;

        if (INSTANCE == null) {

            if (execution.equals("local")) {

                if (browser.equals("chrome")) {
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("no-sandbox");
                    chromeOptions.addArguments("--allow-running-insecure-content");
                    chromeOptions.addArguments("--lang=pt-BR");
                    chromeOptions.addArguments("download.default_directory", downloadPath);
                    INSTANCE = new ChromeDriver(chromeOptions);

                } else if (browser.equals("chromeHeadless")) {
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("download.default_directory", downloadPath);
                    chromeOptions.addArguments("--headless");
                    INSTANCE = new ChromeDriver(chromeOptions);

                } else {
                    try {
                        throw new Exception("O navegador informado não existe ou não é suportado pela automação no momento.");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void quitInstance() {
        INSTANCE.quit();
        INSTANCE = null;
    }

}
