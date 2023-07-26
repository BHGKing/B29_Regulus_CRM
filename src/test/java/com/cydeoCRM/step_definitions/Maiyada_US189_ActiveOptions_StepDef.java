package com.cydeoCRM.step_definitions;

import com.cydeoCRM.pages.Maiyada_US189_activeOptionsPage;
import com.cydeoCRM.utilities.BrowserUtils;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Maiyada_US189_ActiveOptions_StepDef {

    Maiyada_US189_activeOptionsPage activeOptionsPage = new Maiyada_US189_activeOptionsPage();

    @Then("user should be able to see the following options on the Activity Stream")
    public void user_should_be_able_to_see_the_following_options_on_the_activity_stream(List<String>expectedActiveOptions) {

        List<String> actualActiveOpt = new ArrayList<>();
        for (WebElement eachOpt : activeOptionsPage.allOptions) {

            actualActiveOpt.add(eachOpt.getText());
        }

        Assert.assertEquals(expectedActiveOptions,actualActiveOpt);
        }
    @Given("User click on More tab")
    public void user_click_On_More_tab() {

        activeOptionsPage.moreTab.click();
    }


    @Then("User should be able to see the following options")
    public void user_should_be_able_to_see_the_following_options(List<String> expectedMoreOpt) {

        List<String> actualMoreOpt = new ArrayList<>();
        for (WebElement eachOpt : activeOptionsPage.moreOptions) {

            actualMoreOpt.add(eachOpt.getText());
        }

        BrowserUtils.sleep(2);

        Assert.assertEquals(expectedMoreOpt,actualMoreOpt);









        }



        }


































