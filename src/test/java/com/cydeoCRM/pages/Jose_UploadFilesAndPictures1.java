package com.cydeoCRM.pages;

import com.cydeoCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jose_UploadFilesAndPictures1 {

    public Jose_UploadFilesAndPictures1(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@id=\"feed-add-post-form-link-text\"]")
    public WebElement More_module;
    @FindBy(xpath = "//span/span[.=\"Appreciation\"]")
    public WebElement Apprecition;
    @FindBy(xpath = "//span[@bx-press=\"pressOut\"]")
    public  WebElement File_upload_icon;
    @FindBy(xpath = "(//div[@class=\"diskuf-uploader\"]/input[@class=\"diskuf-fileUploader wd-test-file-light-inp \"])[1]")
    public WebElement Files_and_picture_upload;
    @FindBy(xpath = "//span[@class=\"f-wrap\"]")
    public WebElement fileType;
    @FindBy(xpath = "//div[@id=\"microoPostFormLHE_blogPostForm\"]")
    public WebElement textBodyBeforWritng;

    @FindBy(xpath = "//span[@bx-file-is-in-text=\"N\"]")
    public WebElement inserFileBTN;
    @FindBy(xpath = " //span[@class=\"del-but\"]")
    public WebElement deleteBTN;

}
