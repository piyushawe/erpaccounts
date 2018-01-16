package pageobjects.reports;

import automationframework.supportmethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class TrialBalanceNew extends GenericReports {
    @FindBy(linkText = "Trial Balance New")
    private WebElement link;
    @FindBy(id = "Trial Balance New")
    private WebElement frame;

    public TrialBalanceNew(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openTrialBalanceNew() throws IOException {
        ehandler.openFrame(new UIMap().getReportsMenu(), link, frame);
    }

    public void clickWithoutZeroAmount() throws IOException {
        ehandler.click(readFile.getElement("withoutzeroamount"));
    }

    public void clickClosingWithoutZeroAmount() throws IOException {
        ehandler.click(readFile.getElement("closingwithoutzeroamount"));
    }
}