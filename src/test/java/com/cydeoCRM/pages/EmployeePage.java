package com.cydeoCRM.pages;

import com.cydeoCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {

    public EmployeePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "sitemap-menu")
    public WebElement menu;

    @FindBy(xpath = "//a[text()='Employees']")
    public WebElement employees;

    @FindBy(xpath = "//*[@id='pagetitle']")
    public WebElement CompanyStructure;

    @FindBy(xpath = "//*[@class=\"webform-small-button-text\"]")
    public WebElement AddDepartment;

}