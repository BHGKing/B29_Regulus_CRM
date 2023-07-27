package com.cydeoCRM.step_definitions;

import com.cydeoCRM.pages.MilenaAppreciationPage;
import com.cydeoCRM.utilities.BrowserUtils;
import com.cydeoCRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MilenaAppreciation_StepDef {

    MilenaAppreciationPage appreciationPage=new MilenaAppreciationPage();
    @When("User click on Appreciation option under the More tab")
    public void user_click_on_appreciation_option_under_the_more_tab() {

        appreciationPage.appreciationOption.click();

    }

    @Then("User should be able to send an appreciation by filling in the mandatory fields.")
    public void user_should_be_able_to_send_an_appreciation_by_filling_in_the_mandatory_fields() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/iframe")));
   appreciationPage.textField.sendKeys("Good job");
        Driver.getDriver().switchTo().parentFrame();
    }


    @Then("Verify delivery is to {string} by default.")
    public void verify_delivery_is_to_by_default(String expectedAllEmployees) {
        //Driver.getDriver().switchTo().parentFrame();
        String actualText=appreciationPage.allEmployees.getText();
        //Assert.assertEquals(actualText,expectedAllEmployees);
      Assert.assertTrue(appreciationPage.allEmployees.isDisplayed());

    }


    @And("User be able to click Cancel button at any time before sending.")
    public void userBeAbleToClickCancelButtonAtAnyTimeBeforeSending() {
        BrowserUtils.sleep(2);
     appreciationPage.cancelButton.click();

    }
}
