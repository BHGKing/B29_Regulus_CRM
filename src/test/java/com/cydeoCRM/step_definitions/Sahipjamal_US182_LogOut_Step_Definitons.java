package com.cydeoCRM.step_definitions;

import com.cydeoCRM.pages.Sahipjamal_US182_LogOutPage;
import com.cydeoCRM.utilities.BrowserUtils;
import com.cydeoCRM.utilities.ConfigurationReader;
import com.cydeoCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Sahipjamal_US182_LogOut_Step_Definitons {
    Sahipjamal_US182_LogOutPage logOutPage = new Sahipjamal_US182_LogOutPage();

    @Given("User on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User enter email and password")
    public void user_enter_email_and_password() {
        logOutPage.userName.sendKeys(ConfigurationReader.getProperty("hr_username"));
        logOutPage.password.sendKeys(ConfigurationReader.getProperty("hr_password"));
    }

    @When("the user clicks on their profile name or avatar icon")
    public void the_user_clicks_on_their_profile_name_or_avatar_icon() {
       logOutPage.profile.click();
    }

    @Then("the user should see the following options:")
    public void the_user_should_see_the_following_options(List<String> allProfileOptions) {
      List<String> allOptions = new ArrayList<>();

     for(WebElement eachOpt: logOutPage.allOptions){
         allOptions.add(eachOpt.getText());
     }

     Assert.assertEquals(allProfileOptions,allOptions);

    }

    @When("the user clicks on the Log out button")
    public void the_user_clicks_on_the_button() {
        logOutPage.profile.click();
        logOutPage.logoutButton.click();
    }

    @Then("the user should be redirected to the login or splash screen")
    public void the_user_should_be_redirected_to_the_login_or_splash_screen() {
        BrowserUtils.verifyTitleContains("Authorization");
    }
}
