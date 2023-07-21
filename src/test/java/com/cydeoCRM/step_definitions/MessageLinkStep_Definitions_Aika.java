package com.cydeoCRM.step_definitions;

import com.cydeoCRM.pages.LoginPage;
import com.cydeoCRM.pages.MessageLinkPage;
import com.cydeoCRM.utilities.BrowserUtils;
import com.cydeoCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MessageLinkStep_Definitions_Aika {


    LoginPage login = new LoginPage();
    MessageLinkPage page = new MessageLinkPage();
    @Given("user clicks to Send message ...")
    public void userHrClicksToSendMessage() {
        page.MessageLink.click();
    }
    @Then("user {string} enters message")
    public void user_enters_message(String message) {
        Driver.getDriver().switchTo().frame(page.messageFrame);
        page.inputMessage.sendKeys(message);
        Driver.getDriver().switchTo().defaultContent();
    }
    @Then("user clicks SEND button")
    public void user_clicks_send_button() {
        BrowserUtils.sleep(2);
        page.sendButton.click();
        BrowserUtils.sleep(2);
    }
    @Then("user should be able to see the message {string} that user sent before")
    public void user_should_be_able_to_see_the_message_that_user_sent_before(String sentMessage) {
        Assert.assertTrue(page.list.isDisplayed());
    }
    @Then("user does not enters message")
    public void user_does_not_enters_message() {
    }
    @Then("user should be able to see the error message The message title is not specified")
    public void user_should_be_able_to_see_the_error_message_The_message_title_is_not_specified() {
        Assert.assertTrue(page.Title_ErrorMessage.isDisplayed());
    }

    @Then("user should be able to see the error message Please specify at least one person.")
    public void user_should_be_able_to_see_the_error_message_Please_specify_at_least_one_person() {
        Assert.assertTrue(page.Recipient_ErrorMessage.isDisplayed());
    }
    @Then("user delete default recipient {string}")
    public void user_delete_default_recipient(String string) {
        page.deleteButton.click();
    }
    @Then("user does not choose recipient")
    public void user_does_not_choose_recipient() {
    }
    @Then("user should be able to see default recipient All employees")
    public void user_should_be_able_to_see_default_recipient() {
        BrowserUtils.sleep(2);

        System.out.println(page.AllEmployees.isDisplayed());


    }
    @Then("user clicks cancel button")
    public void user_clicks_cancel_button() {
        page.CancelButton.click();
        Assert.assertTrue(page.MessageText.isDisplayed());
    }


}
