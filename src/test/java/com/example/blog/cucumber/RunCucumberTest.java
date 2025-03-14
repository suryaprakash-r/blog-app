package com.example.blog.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"json:target/cucumber-reports/cucumber.json"},
    features = "src/test/resources/features",
    glue = "com.example.blog.cucumber"
)
public class RunCucumberTest {
}

