package com.cydeoCRM.step_definitions;

import com.cydeoCRM.pages.MSK_US187_EmployeesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MSK_US187_EmployeesStepDefs {

    MSK_US187_EmployeesPage employeesPage= new MSK_US187_EmployeesPage();
    @Given("User click on the Employees module")
    public void user_click_on_the_employees_module() {
       employeesPage.employeesModule.click();

    }
    @Then("User should able to see following modules")
    public void user_should_able_to_see_following_modules(List<String> expectedModules) {

        List<String> actualModules= new ArrayList<>();

        for (WebElement eachModule : employeesPage.modules) {
            actualModules.add(eachModule.getText());
        }
        Assert.assertEquals(expectedModules,actualModules);

    }





    @Then("user sees {string} title on the page")
    public void user_sees_title_on_the_page(String expectedPageTitle) {
       String actualPageTitle= employeesPage.pageTitle.getText();
       Assert.assertEquals(expectedPageTitle,actualPageTitle);

    }






}
