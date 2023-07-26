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
import org.junit.Assert;
import org.openqa.selenium.By;

public class Jose_US185_UploadFilesAndPicturesStepDefs{

    Jose_UploadFilesAndPictures Jose_UploadFilesAndPictures = new Jose_UploadFilesAndPictures();

    /*
    String projectPath = ConfigurationReader.getProperty("projectPath");;
    String filePath;
    String fullPath;
     */

    @Given("user is on the login page of the CRM application")
    public void user_is_on_the_login_page_of_the_crm_application() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

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

    // @Then("the user selects {string} which file to upload")
    @Then("the user selects the upload files and images button")
    public void the_user_selects_the_upload_files_and_images_button(/*String file*/) {

        String projectPath = System.getProperty("user.dir");

        String filePathDOCX = "src/test/resources/filesToUpload/test.docx";

        String fullPathDOCX = projectPath + "/" + filePathDOCX;

        Jose_UploadFilesAndPictures.fileUploader.sendKeys(fullPathDOCX);

        /*
        switch (file) {
            case "pdf":
                filePath = ConfigurationReader.getProperty("PDFfilePath");
                fullPath = projectPath + "/" + filePath;
                Jose_UploadFilesAndPictures.fileUploader.sendKeys(fullPath);
                BrowserUtils.sleep(2);
                break;
            case "txt":
                filePath = ConfigurationReader.getProperty("TXTfilePath");
                fullPath = projectPath + "/" + filePath;
                Jose_UploadFilesAndPictures.fileUploader.sendKeys(fullPath);
                BrowserUtils.sleep(2);
                break;
            case "jpeg":
                filePath = ConfigurationReader.getProperty("JPEGfilePath");
                fullPath = projectPath + "/" + filePath;
                Jose_UploadFilesAndPictures.fileUploader.sendKeys(fullPath);
                BrowserUtils.sleep(2);
                break;
            case "png":
                filePath = ConfigurationReader.getProperty("PNGfilePath");
                fullPath = projectPath + "/" + filePath;
                Jose_UploadFilesAndPictures.fileUploader.sendKeys(fullPath);
                BrowserUtils.sleep(2);
                break;
            case "docx":
                filePath = ConfigurationReader.getProperty("DOCXfilePath");
                fullPath = projectPath + "/" + filePath;
                Jose_UploadFilesAndPictures.fileUploader.sendKeys(fullPath);
                BrowserUtils.sleep(2);
                break;

        }

         */

    }

    @Then("verify if the user sees the file uploaded")
    public void verify_if_the_user_sees_the_file_uploaded() {

        BrowserUtils.sleep(2);

        BrowserUtils.verifyElementDisplayed(Jose_UploadFilesAndPictures.fileUploaded);

    }

    @Then("the user selects insert in text button")
    public void the_user_selects_insert_in_text_button() {

        BrowserUtils.sleep(1);

        Jose_UploadFilesAndPictures.insertInText.click();

    }

    @Then("the user selects to remove the uploaded file or image")
    public void the_user_selects_to_remove_the_uploaded_file_or_image() {

        BrowserUtils.sleep(1);
        Jose_UploadFilesAndPictures.deleteFileButton.click();

    }

    @Then("verify the file is removed")
    public void verify_the_file_is_removed() {

        if (Jose_UploadFilesAndPictures.deleteFileButton.isDisplayed()){
            System.err.println("Failed!! File was NOT deleted");
        } else {
            System.out.println("Success!! File was deleted");
        }

    }

    /*
    @Then("verify if the user sees the file in message box")
    public void verify_if_the_user_sees_the_file_in_message_box() {

        System.out.println(Jose_UploadFilesAndPictures.textInMessage.getText());

        BrowserUtils.verifyElementDisplayed(Jose_UploadFilesAndPictures.textInMessage);

        if (Jose_UploadFilesAndPictures.textInMessage.getText().equalsIgnoreCase("test.docx")){
            System.out.println("Success!! File is displayed in message");
        } else {
            System.err.println("Failed!! File is NOT displayed in message");
        }

    }
     */
}
