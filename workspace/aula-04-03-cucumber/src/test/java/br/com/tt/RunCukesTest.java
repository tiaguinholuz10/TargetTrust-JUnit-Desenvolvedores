package br.com.tt;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {
    "html:target/cucumber-html-report",
    "json:target/cucumber-html-report" 
    }
)
public class RunCukesTest {

}
