package com.google.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt" ,
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"
        },

        features = "src/test/resources/features" ,
        glue = "com/google/steps",
        //format = {"pretty","html:test-output_1",
        //                "json:target/cucumber-reports/CucumberTestReport.json"},
        //        plugin = ("json:target/cucumber-reports/CucumberTestReport.json"),
                monochrome= true,
        dryRun = false,
        tags = "@smoke"
)
public class CukesRunner {

}




