package stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import supportclasses.GenericBaseClass;
import utilities.GenericUtility;

import java.io.IOException;

import static webdriver.AppDriver.driver;
import static webdriver.AppDriver.getCurrentDriver;

public class CucumberHooks extends GenericBaseClass {

    private GenericUtility utility = new GenericUtility();

    @Before
    public void getScenario(Scenario sc) {
        scenario = sc.getSourceTagNames();
        System.out.println("Scenario is: " + scenario);
    }

    @Before
    public void launchBrowser() throws IOException {
        driver = getCurrentDriver();
        dm.maximizeWindow();
    }

    @After
    public void afterScenario(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            utility.takeScreenshot();
        }
    }

    @After
    public void closeBrowser() {
        //driver.quit();
        driver = null;
    }
}