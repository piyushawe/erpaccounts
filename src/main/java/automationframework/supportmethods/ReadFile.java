package automationframework.supportmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static supportclasses.GenericBaseClass.file;
import static webdriver.AppDriver.driver;

public class ReadFile implements GetLocators{
    private Properties properties = new Properties();

    private FileInputStream readFile(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    public String readProperty(File file, String key) throws IOException {
        String value = null;
        if (file.exists()) {
            properties.load(readFile(file));
            value = properties.getProperty(key);
        }
        return value;
    }

    public WebElement getElement(String element) throws IOException {

        String locator = readProperty(file, element + "type");
        String value = readProperty(file, element);
        WebElement webelement = null;

        if (locator.equalsIgnoreCase(ID))
            webelement = driver.findElement(By.id(value));
        if (locator.equalsIgnoreCase(NAME))
            webelement = driver.findElement(By.name(value));
        if (locator.equalsIgnoreCase(XPATH))
            webelement = driver.findElement(By.xpath(value));
        if (locator.equalsIgnoreCase(LINKTEXT))
            webelement = driver.findElement(By.linkText(value));
        if (locator.equalsIgnoreCase(TAGNAME))
            webelement = driver.findElement(By.tagName(value));
        if (locator.equalsIgnoreCase(CSSSELECTOR))
            webelement = driver.findElement(By.cssSelector(value));
        if (locator.equalsIgnoreCase(CLASSNAME))
            webelement = driver.findElement(By.className(value));

        return webelement;
    }

    public List<WebElement> getElements(String element) throws IOException {

        String locator = readProperty(file, element + "type");
        String value = readProperty(file, element);
        List<WebElement> webelement = null;

        if (locator.equals(ID))
            webelement = driver.findElements(By.id(value));
        if (locator.equals(NAME))
            webelement = driver.findElements(By.name(value));
        if (locator.equals(XPATH))
            webelement = driver.findElements(By.xpath(value));
        if (locator.equalsIgnoreCase(LINKTEXT))
            webelement = driver.findElements(By.linkText(value));
        if (locator.equalsIgnoreCase(TAGNAME))
            webelement = driver.findElements(By.tagName(value));
        if (locator.equalsIgnoreCase(CSSSELECTOR))
            webelement = driver.findElements(By.cssSelector(value));
        if (locator.equalsIgnoreCase(CLASSNAME))
            webelement = driver.findElements(By.className(value));

        return webelement;
    }

    //get all elements of a list or a table
    public List<WebElement> getElements(File file, WebElement ele, String element) throws IOException {
        String value = readProperty(file, element);
        List<WebElement> webelement = null;
        webelement = ele.findElements(By.tagName(value));
        return webelement;
    }
}