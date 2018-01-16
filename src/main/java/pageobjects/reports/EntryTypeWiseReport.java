package pageobjects.reports;

import automationframework.supportmethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class EntryTypeWiseReport extends GenericReports {
    @FindBy(linkText = "Entry Type Wise Report")
    private WebElement link;
    @FindBy(id = "Entry Type Wise Report")
    private WebElement frame;

    public EntryTypeWiseReport(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openEntryTypeWiseReport() throws IOException {
        ehandler.openFrame(new UIMap().getReportsMenu(), link, frame);
    }

    public void selectEntryType(int etype) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("entrytype"), etype);
    }
}