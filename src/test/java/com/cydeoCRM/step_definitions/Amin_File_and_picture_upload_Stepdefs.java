package com.cydeoCRM.step_definitions;

import com.cydeoCRM.pages.Amin_US192_files_and_picture_upload_page;
import com.cydeoCRM.pages.LoginPage;
import com.cydeoCRM.utilities.BrowserUtils;
import com.cydeoCRM.utilities.ConfigurationReader;
import com.cydeoCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Amin_File_and_picture_upload_Stepdefs {
    Amin_US192_files_and_picture_upload_page aminUs192FilesAndPictureUploadPage = new Amin_US192_files_and_picture_upload_page();
    LoginPage loginPage = new LoginPage();
    String projectPath= ConfigurationReader.getProperty("projectPath");;
    String filePath;
    String fullPath;

    @Given("user is on the  the home page")
    public void userIsOnTheTheHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("hr_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("hr_password"));
        loginPage.submit.click();
        BrowserUtils.verifyTitleContains("Portal");

    }

    @Then("user click on the more module of the home page")
    public void userClickOnTheMoreModuleOfTheHomePage() {
        aminUs192FilesAndPictureUploadPage.More_module.click();
    }

    @Then("user Select the Apprecition")
    public void userSelectTheApprecition() {
        aminUs192FilesAndPictureUploadPage.Apprecition.click();
    }

    @Then("user click on the files upload icon")
    public void userClickOnTheFilesUploadIcon() {
        aminUs192FilesAndPictureUploadPage.File_upload_icon.click();
    }


    @Then("user choose {string} file from local directory")
    public void userChooseFileFromLocalDirectory(String file) {
        switch (file) {
            case "pdf":
                filePath = ConfigurationReader.getProperty("PDFfilePath");
                fullPath = projectPath + "/" + filePath;
                aminUs192FilesAndPictureUploadPage.Files_and_picture_upload.sendKeys(fullPath);
                BrowserUtils.sleep(2);
                break;
            case "txt":
                filePath = ConfigurationReader.getProperty("TXTfilePath");
                fullPath = projectPath + "/" + filePath;
                aminUs192FilesAndPictureUploadPage.Files_and_picture_upload.sendKeys(fullPath);
                BrowserUtils.sleep(2);
                break;
            case "jpeg":
                filePath = ConfigurationReader.getProperty("JPEGfilePath");
                fullPath = projectPath + "/" + filePath;
                aminUs192FilesAndPictureUploadPage.Files_and_picture_upload.sendKeys(fullPath);
                BrowserUtils.sleep(2);
                break;
            case "png":
                filePath = ConfigurationReader.getProperty("PNGfilePath");
                fullPath = projectPath + "/" + filePath;
                aminUs192FilesAndPictureUploadPage.Files_and_picture_upload.sendKeys(fullPath);
                BrowserUtils.sleep(2);
                break;
            case "docx":
                filePath = ConfigurationReader.getProperty("DOCXfilePath");
                fullPath = projectPath + "/" + filePath;
                aminUs192FilesAndPictureUploadPage.Files_and_picture_upload.sendKeys(fullPath);
                BrowserUtils.sleep(2);
                break;

        }
    }

    @Then("user able to upload {string} file")
    public void userAbleToUploadFile(String arg0) {
        Assert.assertTrue(aminUs192FilesAndPictureUploadPage.fileType.getText().endsWith("." + arg0));
    }

    @Then("user click on text area")
    public void userClickOnTextArea() {
     aminUs192FilesAndPictureUploadPage.textBodyBeforWritng.click();
    }


    @Then("user choose file from local repository")
    public void userChooseFileFromLocalRepository() {
        filePath = ConfigurationReader.getProperty("PDFfilePath");
        fullPath = projectPath + "/" + filePath;
        aminUs192FilesAndPictureUploadPage.Files_and_picture_upload.sendKeys(fullPath);
        BrowserUtils.sleep(2);
    }
    @Then("user insert file into text area")
    public void userInsertFileIntoTextArea() {
        aminUs192FilesAndPictureUploadPage.inserFileBTN.click();
        BrowserUtils.sleep(2);
    }
    @Then("user choose image")
    public void userChooseImage() {
        filePath = ConfigurationReader.getProperty("PNGfilePath");
        fullPath = projectPath + "/" + filePath;
        aminUs192FilesAndPictureUploadPage.Files_and_picture_upload.sendKeys(fullPath);
        BrowserUtils.sleep(2);
        
    }

    @Then("user insert image into text area")
    public void userInsertImageIntoTextArea() {
        aminUs192FilesAndPictureUploadPage.inserFileBTN.click();
        BrowserUtils.sleep(2);
    }

    @Then("user remove image before sending")
    public void userRemoveImageBeforeSending() {
        aminUs192FilesAndPictureUploadPage.deleteBTN.click();
    }

}
