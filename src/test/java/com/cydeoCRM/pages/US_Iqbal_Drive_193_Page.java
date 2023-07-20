package com.cydeoCRM.pages;

import com.cydeoCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_Iqbal_Drive_193_Page {
    public US_Iqbal_Drive_193_Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
/*
    public void clickMenByText(String text){
        String locator =
    }
*/
    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[4]")
    public WebElement driveButton;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[1]")
    public WebElement myDriveButton;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[2]")
    public WebElement allMyDocumentsButton;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[3]")
    public WebElement companyDriveButton;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text'])[4]")
    public WebElement moreButton;
    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[5]")
    public WebElement salesMarketingButton;
    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[6]")
    public WebElement topManagementDocButton;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[7]")

    public WebElement driveCleanUpButton;
    @FindBy(xpath = "//div[@id='top_menu_id_docs']")
    public List <WebElement> allTopModules;


}
