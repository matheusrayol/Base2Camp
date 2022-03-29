package com.matheusrayol;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GlobalParameters {
    public static String BROWSER_DEFAULT;
    public static String EXECUTION;
    public static int TIMEOUT_DEFAULT;
    public static String URL_DEFAULT;
    public static String DOWNLOAD_PATH_DEFAULT;
    public static String USERNAME_DEFAULT;
    public static String PASSWORD_DEFAULT;

    private final Properties properties;

    public GlobalParameters() {
        properties = new Properties();
        InputStream input;

        try {
            input = new FileInputStream("globalParameters.properties");
            properties.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BROWSER_DEFAULT = properties.getProperty("browser.default");
        EXECUTION = properties.getProperty("execution");
        TIMEOUT_DEFAULT = Integer.parseInt(properties.getProperty("timeout.default"));
        URL_DEFAULT = properties.getProperty("url.default");
        DOWNLOAD_PATH_DEFAULT = properties.getProperty("download.default.path");
        USERNAME_DEFAULT = properties.getProperty("username.default");
        PASSWORD_DEFAULT = properties.getProperty("password.default");
    }
}
