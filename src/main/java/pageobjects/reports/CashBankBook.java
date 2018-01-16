package pageobjects.reports;

import automationframework.supportmethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class CashBankBook extends GenericReports {
    @FindBy(linkText = "Cash/Bank Book")
    private WebElement link;
    @FindBy(id = "Cash/Bank Book")
    private WebElement frame;

    public CashBankBook(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openCashBankBook() throws IOException {
        ehandler.moveToElement(new UIMap().getReportsMenu());
        ehandler.openFrame(new UIMap().getLedgerReports(), link, frame);
    }

    public void clickDetail() throws IOException {
        ehandler.click(readFile.getElement("detail"));
    }
}