package com.cydeoCRM.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"

        },
        features = "src/test/resources/features",
        glue = "com/cydeoCRM/step_definitions",
        dryRun = false,
        tags = "@B29G44-229",
        publish = true //generating a report with public link
)
public class CukesRunner {}


