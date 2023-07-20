package com.cydeoCRM.step_definitions;

import com.cydeoCRM.pages.EmployeePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.util.concurrent.FastThreadLocalThread;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

public class EmployeeStepDefs {

    EmployeePage employeePage = new EmployeePage();

    @When("user navigate to the Employee page")
    public void user_navigate_to_the_employee_page() throws InterruptedException {

        employeePage.menu.click();
        Thread.sleep(3000);
        employeePage.employees.click();
        Thread.sleep(3000);

    }

    @Then("user should verify Company Structure is displayed")
    public void user_should_verify_company_structure_is_displayed() {

        employeePage.CompanyStructure.isDisplayed();
        String expectedTittle = "Company Structure";
        String tittle = employeePage.CompanyStructure.getText();
        System.out.println(tittle);
        Assert.assertTrue(tittle.equalsIgnoreCase(expectedTittle));
    }


    @Then("user should verify there is {string} option for HR")
    public void user_should_verify_there_is_option_for_hr(String string) {
        employeePage.AddDepartment.isDisplayed();
        String expectedTittleForHrUsers = "ADD DEPARTMENT";
        String actualTittleForHrUsers = employeePage.AddDepartment.getText();
        System.out.println(actualTittleForHrUsers);
        Assert.assertTrue(actualTittleForHrUsers.equalsIgnoreCase(expectedTittleForHrUsers));

    }

    @Then("user should verify there is no {string} option")
    public void user_should_verify_there_is_no_option(String string) {

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
