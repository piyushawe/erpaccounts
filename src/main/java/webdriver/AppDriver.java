package webdriver;

import automationframework.supportmethods.BrowserFactory;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class AppDriver {
    public static WebDriver driver;

    public static WebDriver getCurrentDriver() throws IOException {
        BrowserFactory bfactory = new BrowserFactory();
        if (driver == null)
            driver = bfactory.getBrowser("chrome");
        return driver;
    }
}
