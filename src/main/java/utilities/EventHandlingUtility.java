package utilities;

import automationframework.supportmethods.ReadFile;
import automationframework.supportmethods.UIMap;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import webdriver.DriverMethods;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static webdriver.AppDriver.getCurrentDriver;

public class EventHandlingUtility {
    private File fileUI = new File("configuration\\UIMap.properties");
    private ReadFile readFile = new ReadFile();
    private DriverMethods dm = new DriverMethods();
    private String value = "";

    public void openFrame(WebElement menu, WebElement link, WebElement frame) throws IOException {
        moveToElement(menu);
        clickMenuItem(link);
        switchToFrame(frame);
    }

    public void moveToElement(WebElement menuItem) throws IOException {
        new Actions(getCurrentDriver()).moveToElement(menuItem).build().perform();
    }

    private void clickMenuItem(WebElement link) throws IOException {
        new Actions(getCurrentDriver()).moveToElement(link).click().perform();
    }

    private void switchToFrame(WebElement frame) throws IOException {
        getCurrentDriver().switchTo().frame(frame);
    }

    public void click(WebElement element) {
        element.click();
    }

    public void clearValue(WebElement element) {
        element.clear();
    }

    public void enterText(WebElement textfield, String text) {
        textfield.sendKeys(text);
    }

    void pressEnter(WebElement textfield) {
        textfield.sendKeys(Keys.ENTER);
    }

    public void enterText(WebElement textfield, int n) {
        for (int i = 0; i < n; i++) {
            textfield.sendKeys("a");
            value = value + "a";
        }
    }

    public void selectByVisibleText(WebElement element, String text) throws InterruptedException {
        new Select(element).selectByVisibleText(text);
        Thread.sleep(100);
    }

    public void selectByIndex(WebElement element, int index) throws InterruptedException {
        new Select(element).selectByIndex(index);
        Thread.sleep(100);
    }

    //click particular cell of table
    private void selectValueFromTable(WebElement table, String value) throws IOException {
        List<WebElement> cells = readFile.getElements("cell");
        for (WebElement cell : cells) {
            if (cell.getText().equals(value)) {
                cell.click();
                break;
            }
        }
    }

    public void selectDate(WebElement date, String mm, String yy, String dd) throws IOException, InterruptedException {
        click(date);
        dm.waitUntil(new UIMap().getMonthPicker(), 200);
        selectByVisibleText(new UIMap().getMonthPicker(), mm);
        dm.waitUntil(new UIMap().getYearPicker(), 20);
        selectByVisibleText(new UIMap().getYearPicker(), yy);
        dm.waitUntil(new UIMap().getDayPicker(), 200);
        selectValueFromTable(new UIMap().getDayPicker(), dd);
        Thread.sleep(500);
    }

    public void selectValue(WebElement element, WebElement clear, WebElement values, WebElement close) throws IOException {
        click(element);
        click(clear);
        List<WebElement> options = readFile.getElements(fileUI, values, "tablelist");
        if (options.isEmpty())
            System.out.println("No Value Present");
        else
            click(options.get(0));
        click(close);
    }

    public boolean isElementDisplayed(WebElement element) {
        if (element.isDisplayed())
            return true;
        else
            return false;
    }

    public void clickRadioButton(List<WebElement> elements, String value) {
        for (WebElement element : elements) {
            if (element.getAttribute("value").equals(value))
                element.click();
        }
    }
}