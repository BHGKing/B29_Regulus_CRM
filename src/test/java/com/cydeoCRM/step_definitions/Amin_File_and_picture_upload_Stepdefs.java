package com.cydeoCRM.step_definitions;

import com.cydeoCRM.pages.Amin_US192_files_and_picture_upload_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Amin_File_and_picture_upload_Stepdefs {
    Amin_US192_files_and_picture_upload_page aminUs192FilesAndPictureUploadPage=new Amin_US192_files_and_picture_upload_page();
    @Given("user is on the  the home page")
    public void userIsOnTheTheHomePage() {

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

    @Then("user choose file from local directory")
    public void userChooseFileFromLocalDirectory() {
    }

    @Then("user able to upload Supported file formats .pdf, .txt, .jpeg, .png, .docx")
    public void userAbleToUploadSupportedFileFormatsPdfTxtJpegPngDocx() {
    }
}
