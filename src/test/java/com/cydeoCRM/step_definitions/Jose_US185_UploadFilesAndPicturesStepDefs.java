package com.cydeoCRM.step_definitions;

import com.cydeoCRM.pages.Jose_UploadFilesAndPictures;
import com.cydeoCRM.pages.PollPage;
import com.cydeoCRM.utilities.BrowserUtils;
import com.cydeoCRM.utilities.ConfigurationReader;
import com.cydeoCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.velocity.runtime.directive.contrib.For;

public class Jose_US185_UploadFilesAndPicturesStepDefs{

    Jose_UploadFilesAndPictures Jose_UploadFilesAndPictures = new Jose_UploadFilesAndPictures();

    @Given("user is on the login page of the CRM application")
    public void user_is_on_the_login_page_of_the_crm_application() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Given("the user enters username and password for hr")
    public void the_user_enters_username_and_password_for_hr() {

        Jose_UploadFilesAndPictures.userName.sendKeys(ConfigurationReader.getProperty("hr_username"));
        Jose_UploadFilesAndPictures.password.sendKeys(ConfigurationReader.getProperty("hr_password"));

    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {

        Jose_UploadFilesAndPictures.submit.click();

    }

    @Then("the user is on the home page")
    public void the_user_is_on_the_home_page() {

        BrowserUtils.verifyTitleContains("Portal");

    }

    @Then("the user selects the message dropdown button")
    public void the_user_selects_the_message_dropdown_button() {

        Jose_UploadFilesAndPictures.messageButton.click();

    }

    @Then("the user selects the picture button")
    public void the_user_selects_the_picture_button() {

        Jose_UploadFilesAndPictures.pictureButton.click();

    }

    @Then("the user selects the upload files and images button")
    public void the_user_selects_the_upload_files_and_images_button() {

        String projectPath = System.getProperty("user.dir");

        String filePathDOCX = "src/test/resources/filesToUpload/test.docx";

        String fullPathDOCX = projectPath + "/" + filePathDOCX;

        Jose_UploadFilesAndPictures.fileUploader.sendKeys(fullPathDOCX);


    }


}
