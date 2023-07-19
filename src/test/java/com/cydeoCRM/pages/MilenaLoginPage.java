package com.cydeoCRM.pages;

import com.cydeoCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MilenaLoginPage {

    public MilenaLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (xpath = "//div[@onclick='showUserMenu()']")
    public WebElement profileDropDown;
   @FindBy (xpath = "//input[@name='USER_LOGIN']")
    public WebElement username;

    @FindBy (xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement logInButton;



}
