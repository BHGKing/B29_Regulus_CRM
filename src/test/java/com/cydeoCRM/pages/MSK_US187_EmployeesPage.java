package com.cydeoCRM.pages;

import com.cydeoCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MSK_US187_EmployeesPage extends LoginPage {

    public MSK_US187_EmployeesPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
@FindBy(xpath="//a[@title='Employees']")
public WebElement employeesModule;



@FindBy(xpath="//div[@id='top_menu_id_company']")
    public List<WebElement> modules;

@FindBy(xpath="//span[@id='pagetitle']")
    public WebElement pageTitle;

}
