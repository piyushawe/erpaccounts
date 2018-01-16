package pageobjects.reports;

import automationframework.supportmethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class LedgerReportDetailNew extends GenericReports {
    @FindBy(linkText = "Ledger Report Detail New")
    private WebElement link;
    @FindBy(id = "Ledger Report Detail New")
    private WebElement frame;

    public LedgerReportDetailNew(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openLedgerReportDetailNew() throws IOException {
        ehandler.moveToElement(new UIMap().getReportsMenu());
        ehandler.openFrame(new UIMap().getLedgerReports(), link, frame);
    }

    public void clickWithoutRemark() throws IOException {
        ehandler.click(readFile.getElement("withoutremark"));
    }
}