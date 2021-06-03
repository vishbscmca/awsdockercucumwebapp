package com.awsdocker.awsdockercucumwebapp.bagbasics;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/bagbasics",
        plugin = {"pretty", "html:target/cucumber/bagbasics.html"},
        extraGlue = "com.awsdocker.awsdockercucumwebap.bagcommons")
public class BagCucumberIntegrationTest {
}
