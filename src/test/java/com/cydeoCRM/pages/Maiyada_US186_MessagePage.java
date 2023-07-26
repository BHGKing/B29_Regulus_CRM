package com.cydeoCRM.pages;

import com.cydeoCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Maiyada_US186_MessagePage extends LoginPage {

  public   Maiyada_US186_MessagePage (){
      PageFactory.initElements(Driver.getDriver(), this);
  }



    @FindBy(xpath = "//span[contains(text(),'Message')]")
    public WebElement messageBtn;
    @FindBy(xpath = "//span[@title='Link']//i")
    public WebElement linkBtn;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement linkTxt;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkUrl;

    @FindBy(xpath = "//input[@id='undefined']")
    public WebElement saveBtn;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendBtn;

    @FindBy(xpath = "//a[text()='Google']")
    public WebElement feed;

}


