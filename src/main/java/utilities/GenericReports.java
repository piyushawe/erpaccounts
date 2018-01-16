package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import supportclasses.GenericBaseClass;

import java.io.IOException;

public abstract class GenericReports extends GenericBaseClass {
    @FindBy(xpath = "//input[@value='Show']")
    private WebElement show;

    protected WebElement element;
    protected WebElement clear;
    protected WebElement values;
    protected WebElement close;

    private void getLedgerGroupElements() throws IOException {
        element = readFile.getElement("ledgergroup");
        clear = readFile.getElement("ledgergroupclear");
        values = readFile.getElement("ledgergroupvalueslist");
        close = readFile.getElement("ledgergroupclose");
    }

    public void selectLedgerGroup() throws IOException {
        getLedgerGroupElements();
        ehandler.selectValue(element, clear, values, close);
    }

    private void getAccountElements() throws IOException {
        element = readFile.getElement("account");
        clear = readFile.getElement("accountclear");
        values = readFile.getElement("accountvalueslist");
        close = readFile.getElement("accountclose");
    }

    public void selectAccount() throws IOException {
        getAccountElements();
        ehandler.selectValue(element, clear, values, close);
    }

    public void selectFromDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement("fromdate"), mm, yy, dd);
    }

    public void selectToDate(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement("todate"), mm, yy, dd);
    }

    public void clickConsolidatedReport() throws IOException {
        ehandler.click(readFile.getElement("consolidatedreport"));
    }

    public void clickStudentWise() throws IOException {
        ehandler.click(readFile.getElement("studentwise"));
    }

    public void clickButton(String value) throws IOException {
        ehandler.clickRadioButton(readFile.getElements("radiobuttongroup"), value);
    }

    public void clickShow() {
        ehandler.click(show);
    }
}