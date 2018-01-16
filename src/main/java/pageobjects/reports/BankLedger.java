package pageobjects.reports;

import automationframework.supportmethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class BankLedger extends GenericReports {
    @FindBy(linkText = "Bank Ledger")
    private WebElement link;
    @FindBy(id = "Bank Ledger")
    private WebElement frame;

    public BankLedger(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openBankLedger() throws IOException {
        ehandler.openFrame(new UIMap().getReportsMenu(), link, frame);
    }

    public void selectBankAccount(int account) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("bankaccount"), account);
    }
}
