package com.cydeoCRM.pages;

import com.cydeoCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Sahipjamal_US182_LogOutPage extends LoginPage {

    public Sahipjamal_US182_LogOutPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement profile;

    @FindBy(className = "menu-popup-item-text")
    public List<WebElement> allOptions;

    @FindBy(xpath = "//span[normalize-space()='Log out']")
    public WebElement logoutButton;
}
