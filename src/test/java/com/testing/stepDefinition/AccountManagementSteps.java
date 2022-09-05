package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomepagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AccountManagementSteps {

    WebDriver driver = Hooks.driver;
    @Given("I am on create an account page")
    public void iAmOnCreateAnAccountPage() {

        HomepagePO homepagePO = new HomepagePO(driver);
        homepagePO.clickCreateAccountLink();

    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String Firstname, String Lastname, String Email, String Password, String ConfirmPassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(Firstname);
        createAccountPagePO.enterLastName(Lastname);
        createAccountPagePO.enterEmail(Email);
        createAccountPagePO.enterPassword(Password);
        createAccountPagePO.enterConfirmPassword(ConfirmPassword);

    }

    @And("I Click on create an account")
    public void iClickOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAccountButton();
    }

    @Then("My account page is displayed")
    public void myAccountPageIsDisplayed() {
    }
}
