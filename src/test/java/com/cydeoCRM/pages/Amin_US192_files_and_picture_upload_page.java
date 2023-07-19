package com.cydeoCRM.pages;

import com.cydeoCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amin_US192_files_and_picture_upload_page {
    public Amin_US192_files_and_picture_upload_page(){
         PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@id=\"feed-add-post-form-link-text\"]")
    public WebElement More_module;
    @FindBy(xpath = "//span/span[.=\"Appreciation\"]")
    public WebElement Apprecition;
    @FindBy(xpath = "//span[@bx-press=\"pressOut\"]")
    public  WebElement File_upload_icon;
}
