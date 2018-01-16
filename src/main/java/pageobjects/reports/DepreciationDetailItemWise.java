package pageobjects.reports;

import automationframework.supportmethods.UIMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericReports;

import java.io.IOException;

public class DepreciationDetailItemWise extends GenericReports {
    @FindBy(linkText = "Depreciation Detail Item Wise")
    private WebElement link;
    @FindBy(id = "Depreciation Detail Item Wise")
    private WebElement frame;

    public DepreciationDetailItemWise(WebDriver d) {
        page = this.getClass().getSimpleName();
        pack = gm.getPackage(this.getClass().getPackage().getName());
        file = gm.getFilePath(page, pack);
        PageFactory.initElements(d, this);
    }

    public void openDepreciationDetailItemWise() throws IOException {
        ehandler.openFrame(new UIMap().getReportsMenu(), link, frame);
    }
}
