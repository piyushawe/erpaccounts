package automationframework.supportmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import supportclasses.GenericBaseClass;

import java.io.IOException;

import static webdriver.AppDriver.driver;

public class BrowserFactory extends GenericBaseClass {

    public WebDriver getBrowser(String browser) throws IOException {

        switch (browser) {
            case "chrome":
                System.setProperty(readFile.readProperty(fileConfig, "chromedriver"), readFile.readProperty(fileConfig, "chromedriverpath"));
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty(readFile.readProperty(fileConfig, "firefoxdriver"), readFile.readProperty(fileConfig, "firefoxdriverpath"));
                driver = new FirefoxDriver();
                break;
            case "ie":
                System.setProperty(readFile.readProperty(fileConfig, "iedriver"), readFile.readProperty(fileConfig, "iedriverpath"));
                driver = new InternetExplorerDriver();
                break;
            default:
                logger.info(readFile.readProperty(fileMsg, "browsernotdefined"));
        }
        return driver;
    }
}