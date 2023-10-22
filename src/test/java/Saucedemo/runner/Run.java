package Saucedemo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Saucedemo/features",
        glue	= "Saucedemo.stepDef",
        plugin	= {"html:target/HTML_report.html"}
)

public class Run
{

}