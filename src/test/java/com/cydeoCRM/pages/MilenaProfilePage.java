package com.cydeoCRM.pages;

import com.cydeoCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MilenaProfilePage {
    public MilenaProfilePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//span[.='My Profile']")
public  WebElement MyProfile;


    @FindBy(xpath = "//div[@class='profile-menu-items']")
    public  WebElement options;

    @FindBy(xpath = "//a[@class='profile-menu-item profile-menu-item-active']")
    public WebElement generalOption;

    @FindBy (xpath = "//a[.='Drive\t\t\t\t\t\t']")
    public WebElement driveOption;

    @FindBy (xpath = "//a[.='Tasks\t\t\t\t\t\t']")
    public WebElement tasksOption;

    @FindBy (xpath = "//a[.='Calendar\t\t\t\t\t\t']")
    public WebElement calendarOption;

    @FindBy (xpath = "//a[.='Conversations\t\t\t\t\t\t']")
    public WebElement conversationOption;

    @FindBy(xpath = "(//a[.='helpdesk2@cydeo.com'])[2]")
    public WebElement emailAddress;

}
