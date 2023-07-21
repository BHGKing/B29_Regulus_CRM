package com.cydeoCRM.pages;

import com.cydeoCRM.utilities.BrowserUtils;
import com.cydeoCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageLinkPage extends LoginPage{

    public MessageLinkPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[text()='Message']")
    public WebElement MessageLink;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageFrame;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement inputMessage;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")

    public WebElement deleteButton;

    @FindBy(xpath = "//span[.='Send message …']")

    public WebElement MessageText;

    @FindBy(xpath = "//div[@id='log_internal_container']/div/div")

    public WebElement list;

    @FindBy(xpath= "//button[@id='blog-submit-button-save']")

    public WebElement sendButton;

    @FindBy(xpath="//span[.='Please specify at least one person.']")

    public WebElement Recipient_ErrorMessage;

    @FindBy(xpath = "//span[.='The message title is not specified']")

    public WebElement Title_ErrorMessage;

    @FindBy(xpath = "//span[.='All employees']")
    public WebElement AllEmployees;

    @FindBy(xpath="//button[@class='ui-btn ui-btn-lg ui-btn-link']")

    public WebElement CancelButton;
}
