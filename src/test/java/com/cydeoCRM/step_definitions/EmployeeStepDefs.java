package com.cydeoCRM.step_definitions;

import com.cydeoCRM.pages.EmployeePage;
import com.cydeoCRM.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.util.concurrent.FastThreadLocalThread;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployeeStepDefs {

    EmployeePage employeePage = new EmployeePage();

    @When("user navigate to the Employee page")
    public void user_navigate_to_the_employee_page() throws InterruptedException {
        //wait until element clickable, then click on Employee menu
        BrowserUtils.waitForClickablility(employeePage.menu,3);
        employeePage.menu.click();

        //wait until Employee button is clickable, then click on it
        BrowserUtils.waitForClickablility(employeePage.employees,3);
        employeePage.employees.click();
        Thread.sleep(3000);

    }

    @Then("user should verify Company Structure is displayed")
    public void user_should_verify_company_structure_is_displayed() {

        //verify company structure displayed by using isDisplayed method
        employeePage.CompanyStructure.isDisplayed();

        // or verify by using assertTrue method
        String expectedTittle = "Company Structure";
        String tittle = employeePage.CompanyStructure.getText();
        System.out.println(tittle);
        Assert.assertTrue(tittle.equalsIgnoreCase(expectedTittle));
    }


    @Then("user should verify there is {string} option for HR")
    public void user_should_verify_there_is_option_for_hr(String string) {

        //verify add department displayed for HR user by using isDisplayed method
        employeePage.CompanyStructure.isDisplayed();

        //or verify by using assertTrue method
        employeePage.AddDepartment.isDisplayed();
        String expectedTittleForHrUsers = "ADD DEPARTMENT";
        String actualTittleForHrUsers = employeePage.AddDepartment.getText();
        System.out.println(actualTittleForHrUsers);
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
