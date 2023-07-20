package com.cydeoCRM.step_definitions;

import com.cydeoCRM.pages.US_Iqbal_Drive_193_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US_Iqbal_Drive_193_StepDefinitions {
    US_Iqbal_Drive_193_Page iqbalDrivePage = new US_Iqbal_Drive_193_Page();

    @When("user clicks on the Drive button")
    public void user_clicks_on_the_drive_button() {
        iqbalDrivePage.driveButton.click();
        //iqbalDrivePage.myDriveButton.click();
        //iqbalDrivePage.allMyDocumentsButton.click();
        // iqbalDrivePage.companyDriveButton.click();
        //iqbalDrivePage.salesMarketingButton.click();
        // iqbalDrivePage.topManagementDocButton.click();
        // iqbalDrivePage.driveCleanUpButton.click();
        // iqbalDrivePage.moreButton.click();
    }

    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModules) {

       // BrowserUtils.sleep(10);
        List<String> actualModules = new ArrayList<>();
        for (WebElement eachModule : iqbalDrivePage.DriveModule) {
            actualModules.add(eachModule.getText());
            // System.out.println("eachModule = " + eachModule);

        }

    }


}
