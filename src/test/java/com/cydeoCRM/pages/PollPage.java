package com.cydeoCRM.pages;

import com.cydeoCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PollPage {

    public PollPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy(xpath = "//span[.='Poll']")
    public WebElement pollButton;

    @FindBy(xpath ="//span[@data-type='groups']" )
    public WebElement AllEmployeesButton;


    @FindBy(xpath = "//input[@id='multi_0']")
    public WebElement AllowMultipleChoicesCheckbox;


@FindBy(xpath = "//iframe[@class='bx-editor-iframe'][1]")
    public WebElement TextBoxIframe;


@FindBy(xpath = "//body[@style='min-height: 184px;']")
    public WebElement TextBoxForTitle;


@FindBy(xpath = "//input[@id='answer_0__0_']")
    public WebElement firstAnswerBox;


    @FindBy(xpath = "//input[@id='answer_0__1_']")
    public WebElement firstAnswerBox2;

@FindBy(xpath = "//input[@id='question_0']")
    public WebElement QuestionBox;

@FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

@FindBy(xpath = "(//div[@class='bx-vote-question-title'])[1]")
    public WebElement elementOfTextAfterPollCreated;


@FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement MessageTitleError;

@FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement xButtonOnAllEmployeesButton;


@FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement OnePersonErrorCode;

@FindBy(xpath = "//span[.='The question text is not specified.']")
    public WebElement QuestionNotGivenError;


@FindBy(xpath ="//span[@class='feed-add-info-text']" )
    public WebElement TheQuestionHasNoAnswerError;
}
