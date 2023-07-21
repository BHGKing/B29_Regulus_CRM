package com.cydeoCRM.pages;

import com.cydeoCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MilenaAppreciationPage {
    public MilenaAppreciationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//span[.='Appreciation'])[2]")
    public WebElement appreciationOption;

@FindBy (xpath = "//body[@style='min-height: 184px;']")
    public WebElement textField;

@FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/ol/li[1]/div[2]/span[1]")
    public WebElement allEmployees;

@FindBy (xpath = "(//button[.='Cancel'])[3]")
    public WebElement cancelButton;


}
