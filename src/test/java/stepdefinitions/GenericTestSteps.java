package stepdefinitions;

import automationframework.supportmethods.ReadFile;
import automationframework.supportmethods.UIMap;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.EventHandlingUtility;
import webdriver.DriverMethods;

import java.io.File;

public class GenericTestSteps {
    private File file = new File("configuration\\UIMap.properties");
    ReadFile readfile = new ReadFile();
    DriverMethods dm = new DriverMethods();
    EventHandlingUtility event = new EventHandlingUtility();

    @Given("^for url$")
    public void for_url() throws Throwable {
        dm.getUrl(readfile.readProperty(file, "url"));
    }

    @When("^user enter username and password$")
    public void user_enter_username_and_password() throws Throwable {
        event.enterText(new UIMap().getUsername(), readfile.readProperty(file, "login"));
        event.enterText(new UIMap().getPassword(), readfile.readProperty(file, "pwd"));
    }

    @When("^click sign in to open erp home page$")
    public void click_sign_in_to_open_erp_home_page() throws Throwable {
        event.click(new UIMap().getSignIn());
    }

    @Then("^user click account manager logo$")
    public void user_click_account_manager_logo() throws Throwable {
        try {
            if (event.isElementDisplayed(new UIMap().getAccountLogo()))
                event.click(new UIMap().getAccountLogo());
        } catch (Exception e) {
            if (event.isElementDisplayed(new UIMap().getAccountLogoo()))
                event.click(new UIMap().getAccountLogoo());
            dm.switchToWindow(1);
        }
    }
}