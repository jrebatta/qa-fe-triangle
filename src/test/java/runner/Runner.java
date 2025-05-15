package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps", "utils"},
        tags = "",
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "junit:target/cucumber-report.xml"
        },
        monochrome = true
)
public class Runner {
}