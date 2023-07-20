package com.cydeoCRM.step_definitions;

import com.cydeoCRM.pages.MilenaLoginPage;
import com.cydeoCRM.pages.MilenaProfilePage;
import com.cydeoCRM.utilities.BrowserUtils;
import com.cydeoCRM.utilities.ConfigurationReader;
import com.cydeoCRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MilenaAccessStepDef {

    MilenaLoginPage loginPage=new MilenaLoginPage();
    MilenaProfilePage profilePage=new MilenaProfilePage();

   // @Given("the user is on the CRM login page")
   // public void theUserIsOnTheCRMLoginPage() {
    //    Driver.getDriver().get(ConfigurationReader.getProperty//("url"));
   // }

    @When("User enter bellow correct credentials")
    public void user_enter_bellow_correct_credentials(Map<String, String>credentials) {
        loginPage.username.sendKeys(credentials.get("username"));
        loginPage.password.sendKeys(credentials.get("password"));

    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        loginPage.logInButton.click();
        BrowserUtils.sleep(2);

    }
/*
    @When("user should be able to access the profile page")
    public void user_should_be_able_to_access_the_profile_page() {

    }


 */


    @And("user should be able to access the profile page")
    public void userShouldBeAbleToAccessTheProfilePage() {
      // BrowserUtils.verifyTitleContains("Portal");
    }

    @And("user click on his profile")
    public void userClickOnHisProfile() {
        loginPage.profileDropDown.click();

    }

    @And("user click on My Profile option")
    public void userClickOnMyProfileOption() {
        profilePage.MyProfile.click();

    }

    @Then("user should be able to see the following options on the profile page")
    public void user_should_be_able_to_see_the_following_options_on_the_profile_page(List<String>expectedOptions) {
        List<String> actualOptions=new ArrayList<>();
        for(WebElement each :profilePage.options ){
             actualOptions.add(each.getText());
         }
       // String actualOptions=profilePage.options.getText();
       Assert.assertEquals(actualOptions,expectedOptions);

    }

    @Then("Verify email address under the General tub")
    public void verifyEmailAddressUnderTheGeneralTub() {
     Assert.assertTrue( profilePage.emailAddress.isDisplayed());
    }

    @When("the user is on the profile page")
    public void theUserIsOnTheProfilePage() {
        loginPage.profileDropDown.click();
        profilePage.MyProfile.click();
    }


}
