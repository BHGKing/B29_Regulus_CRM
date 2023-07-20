package com.cydeoCRM.pages;

import com.cydeoCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jose_UploadFilesAndPictures extends LoginPage {

    public Jose_UploadFilesAndPictures(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Message tab element
    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement messageButton;

    //Picture tab element
    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement pictureButton;

    //Upload tab element
    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement fileUploader;

    //Insert tab element
    @FindBy(xpath = "//span[@class='insert-btn']")
    public WebElement insertInText;

    //File uploaded element
    @FindBy(xpath = "//td[@class='files-name']")
    public WebElement fileUploaded;

    //Verify file has been uploaded element
    @FindBy(xpath = "//span[contains(@id, 'bxid')]")
    public WebElement textInMessage;


}
