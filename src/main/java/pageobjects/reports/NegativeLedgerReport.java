package pageobjects.reports;

import automationframework.supportmethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class NegativeLedgerReport extends GenericReports {
    @FindBy(linkText = "Negative Ledger Report")
    private WebElement link;
    @FindBy(id = "Negative Ledger Report")
    private WebElement frame;

    public NegativeLedgerReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openNegativeLedgerReport() throws IOException {
        ehandler.moveToElement(new UIMap().getReportsMenu());
        ehandler.openFrame(new UIMap().getLedgerReports(), link, frame);
    }

    public void selectFinancialYear(int fyear) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("financialyear"), fyear);
    }
}