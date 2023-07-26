package com.cydeoCRM.step_definitions;

import com.cydeoCRM.pages.LoginPage;
import com.cydeoCRM.pages.Maiyada_US186_MessagePage;
import com.cydeoCRM.utilities.BrowserUtils;
import com.cydeoCRM.utilities.ConfigurationReader;
import com.cydeoCRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Maiyada_US186_messageStepDefs {

    Maiyada_US186_MessagePage messagePage = new Maiyada_US186_MessagePage();
    @Given("User is on the CRM login page")
    public void userIsOnTheCRMLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User enter username and password")
    public void userEnterUsernameAndPassword() {
        messagePage.userName.sendKeys(ConfigurationReader.getProperty("hr_username"));
        messagePage.password.sendKeys(ConfigurationReader.getProperty("hr_password"));
    }

    @Then("User should be able to login")
    public void userShouldBeAbleToLogin() {
        messagePage.submit.click();
    }

    @Given("the user is on the homepage")
    public void theUserIsOnTheHomepage() {
        BrowserUtils.verifyTitleContains("Portal");
    }

    @And("User click on the Message button")
    public void userClickOnTheMessageButton() {
        messagePage.messageBtn.click();
    }

    @And("User click on the link button")
    public void userClickOnTheLinkButton() {
        messagePage.linkBtn.click();
    }

    @Then("the user should be able to add the link and associate it with the text")
    public void theUserShouldBeAbleToAddTheLinkAndAssociateItWithTheText() {
        messagePage.linkTxt.sendKeys("Google");
        messagePage.linkUrl.sendKeys("https://www.google.com/");
        messagePage.saveBtn.click();
        messagePage.sendBtn.click();
    }

    @Given("the user clicks on the link")
    public void theUserClicksOnTheLink() {
        messagePage.feed.click();
    }

    @Then("the user should be able to navigate to the correct URL")
    public void theUserShouldBeAbleToNavigateToTheCorrectURL() {
        BrowserUtils.switchToWindow("Google");
       BrowserUtils.verifyTitleContains("Google");
    }

    @Given("the link is opened")
    public void theLinkIsOpened() {
        messagePage.feed.click();
    }

    @Then("user should be able to see it open in a new tab")
    public void userShouldBeAbleToSeeItOpenInANewTab() {

        BrowserUtils.switchToWindow("Google");

      BrowserUtils.verifyTitleContains("Google");
    }

}