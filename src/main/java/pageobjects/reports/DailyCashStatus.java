package pageobjects.reports;

import automationframework.supportmethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class DailyCashStatus extends GenericReports {
    @FindBy(linkText = "Daily Cash Status") private WebElement link;
    @FindBy(id = "Daily Cash Status") private WebElement frame;

    public DailyCashStatus(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openDailyCashStatus() throws IOException {
        ehandler.openFrame(new UIMap().getReportsMenu(), link, frame);
    }

    public void selectCashAccount(int account) throws IOException, InterruptedException {
        ehandler.selectByIndex(readFile.getElement("cashaccount"), account);
    }
}
