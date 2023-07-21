package com.cydeoCRM.step_definitions;

import com.cydeoCRM.pages.Meryem_US188_EmployeePage;
import com.cydeoCRM.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

public class Meryem_US188_EmployeeStepDefs {

    Meryem_US188_EmployeePage employeePage = new Meryem_US188_EmployeePage();

    @When("user navigate to the Employee page")
    public void user_navigate_to_the_employee_page() throws InterruptedException {
        //wait until element clickable, then click on Employee menu
        BrowserUtils.waitForClickablility(employeePage.menu,3);
        employeePage.menu.click();

        //wait until Employee button is clickable, then click on it
        BrowserUtils.waitForClickablility(employeePage.employees,3);
        employeePage.employees.click();

    }

    @Then("user should verify Company Structure is displayed")
    public void user_should_verify_company_structure_is_displayed() {

        //verify company structure displayed by using isDisplayed method
        Assert.assertTrue(employeePage.CompanyStructure.isDisplayed());

        // or verify by using expected-actual text method
        String expectedTittle = "Company Structure";
        String tittle = employeePage.CompanyStructure.getText();
        Assert.assertTrue(tittle.equalsIgnoreCase(expectedTittle));
    }


    @Then("user should verify there is {string} option for HR")
    public void user_should_verify_there_is_option_for_hr(String string) {


        //or verify by using assertTrue method
        Assert.assertTrue(employeePage.AddDepartment.isDisplayed());

        //or verify by using expected-actual text method
        String expectedTittleForHrUsers = "ADD DEPARTMENT";
        String actualTittleForHrUsers = employeePage.AddDepartment.getText();
        Assert.assertTrue(actualTittleForHrUsers.equalsIgnoreCase(expectedTittleForHrUsers));

    }

    @Then("user should verify there is no {string} option")
    public void user_should_verify_there_is_no_option(String string) {

        //verify add department is NOT displayed for Helpdesk and Marketing user by try catch method

        boolean addDepartmentDoesNotExists = true;

        try {
           employeePage.AddDepartment.click();
        }

        catch (
                NoSuchElementException exception
        ) {

        }
        finally {
            Assert.assertEquals(addDepartmentDoesNotExists,true);
        }


    }
}
