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
    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageButton;

    //Picture tab element
    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement pictureButton;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement fileUploader;





}
