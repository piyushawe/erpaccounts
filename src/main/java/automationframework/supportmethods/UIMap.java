package automationframework.supportmethods;

import org.openqa.selenium.WebElement;
import supportclasses.GenericBaseClass;

import java.io.IOException;
import java.util.List;

public class UIMap extends GenericBaseClass {
    public UIMap() throws IOException {
        page = this.getClass().getSimpleName();
        file = gm.getFilePath(page);
    }

    public WebElement getUsername() throws IOException {
        return readFile.getElement("username");
    }

    public WebElement getPassword() throws IOException {
        return readFile.getElement("password");
    }

    public WebElement getSignIn() throws IOException {
        return readFile.getElement("signin");
    }

    public WebElement getAccountLogo() throws IOException {
        return readFile.getElement("accountmanagerlogo");
    }

    public WebElement getAccountLogoo() throws IOException {
        return readFile.getElement("accountmanagerlogoo");
    }

    public WebElement getReportsMenu() throws IOException {
        return readFile.getElement("reportsmenu");
    }

    public WebElement getMonthPicker() throws IOException {
        return readFile.getElement("monthpicker");
    }

    public WebElement getYearPicker() throws IOException {
        return readFile.getElement("yearpicker");
    }

    public WebElement getDayPicker() throws IOException {
        return readFile.getElement("daypicker");
    }

    public List<WebElement> getCell() throws IOException {
        return readFile.getElements("cell");
    }

    public WebElement getLedgerReports() throws IOException {
        return readFile.getElement("ledgerreportssubmenu");
    }
}