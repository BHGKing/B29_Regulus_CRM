package com.cydeoCRM.step_definitions;

import com.cydeoCRM.pages.BasePage;
import com.cydeoCRM.pages.LoginPage;
import com.cydeoCRM.pages.PollPage;
import com.cydeoCRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class pollCreation_stepDefinitions extends BasePage {

    PollPage pollPage = new PollPage();

    @Given("user is on the home page.")
    public void user_is_on_the_home_page() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("helpdesk1@cydeo.com","UserUser");



    }
    @When("user clicks on poll tab at the top.")
    public void user_clicks_on_poll_tab_at_the_top()  {
        pollPage.pollButton.click();

    }
    @Then("user should see delivery to all employees by default.")
    public void userShouldSeeDeliveryToAllEmployeesByDefault() {

        Assert.assertTrue(pollPage.AllEmployeesButton.isDisplayed());
    }




    @Then("user should be able to provide the answers and click send.")
    public void userShouldBeAbleToProvideTheAnswersAndClickSend() {
        pollPage.firstAnswerBox.sendKeys("option1");
        pollPage.firstAnswerBox2.sendKeys("option2");
        pollPage.sendButton.click();


    }













    @Then("user should be able to select the allow multiple choices checkbox.")
    public void userShouldBeAbleToSelectTheAllowMultipleChoicesCheckbox() {
         pollPage.AllowMultipleChoicesCheckbox.click();
         Assert.assertTrue(pollPage.AllowMultipleChoicesCheckbox.isSelected());
    }




    @Then("user should be able to click ask {string}")
    public void userShouldBeAbleToClickAsk(String question) throws InterruptedException {
        Driver.getDriver().switchTo().frame(pollPage.TextBoxIframe);
        pollPage.TextBoxForTitle.sendKeys(question);
        Driver.getDriver().switchTo().defaultContent();
        pollPage.QuestionBox.sendKeys(question);


    }

    @Then("user should be able to see {string} posted as a poll")
    public void userShouldBeAbleToSeePostedAsAPoll(String question) {

        Assert.assertTrue(pollPage.elementOfTextAfterPollCreated.getText().contains(question));


    }

    @Then("if user does no give any questionns or answers and tries to creat poll they should get The message title is not specified error.")
    public void ifUserDoesNoGiveAnyQuestionnsOrAnswersAndTriesToCreatPollTheyShouldGetTheMessageTitleIsNotSpecifiedError() {
        pollPage.sendButton.click();
        Assert.assertTrue(pollPage.MessageTitleError.isDisplayed());



    }


    @And("if user enters question and answer wihtout selecting who to deliver to, user should see Please specify at least one person. error.")
    public void ifUserEntersQuestionAndAnswerWihtoutSelectingWhoToDeliverToUserShouldSeePleaseSpecifyAtLeastOnePersonError() {

        pollPage.xButtonOnAllEmployeesButton.click();
        pollPage.sendButton.click();
        Assert.assertTrue(pollPage.OnePersonErrorCode.isDisplayed());

    }

    @And("if user only provides title and answer but not question user should see The question text is not specified.")
    public void ifUserOnlyProvidesTitleAndAnswerButNotQuestionUserShouldSeeTheQuestionTextIsNotSpecified() {
        Driver.getDriver().switchTo().frame(pollPage.TextBoxIframe);
        pollPage.TextBoxForTitle.sendKeys("hey");
        Driver.getDriver().switchTo().defaultContent();
        pollPage.firstAnswerBox.sendKeys("hello");
        pollPage.sendButton.click();
        Assert.assertTrue(pollPage.QuestionNotGivenError.isDisplayed());
        pollPage.firstAnswerBox.clear();
        Driver.getDriver().switchTo().frame(pollPage.TextBoxIframe);
        pollPage.TextBoxForTitle.clear();
        Driver.getDriver().switchTo().defaultContent();



    }

    @And("if user only provides the title and the question {string}, user should see The question what does the fox say has no answers. error.")
    public void ifUserOnlyProvidesTheTitleAndTheQuestionUserShouldSeeTheQuestionWhatDoesTheFoxSayHasNoAnswersError(String titleAndQuestion)  {
        Driver.getDriver().switchTo().frame(pollPage.TextBoxIframe);
        pollPage.TextBoxForTitle.sendKeys(titleAndQuestion);
        Driver.getDriver().switchTo().defaultContent();
        pollPage.QuestionBox.sendKeys(titleAndQuestion);
        pollPage.sendButton.click();
        Assert.assertTrue(pollPage.TheQuestionHasNoAnswerError.getText().equals("The question"+ titleAndQuestion+"has no answers."));

}

    @And("if user only provides the title and the question {string}, user should see The question {string} say has no answers. error.")
    public void ifUserOnlyProvidesTheTitleAndTheQuestionUserShouldSeeTheQuestionSayHasNoAnswersError(String question, String error) {
        Driver.getDriver().switchTo().frame(pollPage.TextBoxIframe);
        pollPage.TextBoxForTitle.sendKeys(question);
        Driver.getDriver().switchTo().defaultContent();
        pollPage.QuestionBox.sendKeys(question);
        pollPage.sendButton.click();

        Assert.assertTrue(pollPage.TheQuestionHasNoAnswerError.getText().equals("The question \""+error+"\" has no answers."));

    }
    }
