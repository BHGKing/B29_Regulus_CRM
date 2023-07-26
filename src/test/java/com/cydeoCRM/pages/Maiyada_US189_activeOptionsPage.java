package com.cydeoCRM.pages;

import com.cydeoCRM.utilities.Driver;
import io.cucumber.java.de.Wenn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Maiyada_US189_activeOptionsPage extends LoginPage {

    public Maiyada_US189_activeOptionsPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//td/div/div[2]/div/div[1]/div/div/div[1]/div/span")
    public List<WebElement> allOptions;

    // "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[1]/div/span")

    @FindBy(id = "feed-add-post-form-link-more")
    public WebElement moreTab;

    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public List<WebElement> moreOptions;

    //xpath = "/html/body/div[7]/div[1]/div/div/span")
    // "//div[@class='menu-popup']")



}
