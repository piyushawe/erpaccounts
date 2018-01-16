package pageobjects.reports;

import automationframework.supportmethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class ReconciliationStatement extends GenericReports {
    @FindBy(linkText = "Reconciliation Statement")
    private WebElement link;
    @FindBy(id = "Reconciliation Statement")
    private WebElement frame;

    public ReconciliationStatement(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openReconciliationStatement() throws IOException {
        ehandler.moveToElement(new UIMap().getReportsMenu());
        ehandler.openFrame(new UIMap().getLedgerReports(), link, frame);
    }

    public void selectBank(int bank) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("bank"), bank);
    }

    public void selectChequeStatus(int cstatus) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("chequestatus"), cstatus);
    }

    public void selectOrderBy(int orderby) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("orderby"), orderby);
    }
}