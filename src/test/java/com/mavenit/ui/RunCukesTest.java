package com.mavenit.ui;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        tags = "@rk", // tags = ("~@wip")-- not include // tags ={"@basket,"@search"}
       // dryRun = true ,// check every step has step-definition
        strict = true , // it will make test fail if any error and display it red
        plugin = "json:target/cucumber.json" // to generate report, it should be in json or html format

)
public class RunCukesTest {
}
