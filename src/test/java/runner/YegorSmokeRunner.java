package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // Features is the path of your features package.
        features = "src/test/java/features",
        // Glue is the name of the package that contains the step defs.
        glue = "stepdefs",
        tags = "@Smoke",
        //
        // Passing a report plugin ("pretty in this case"), and then
        // putting that report into the specified directory
        plugin = {"pretty", "html:target/cucumber-smoke-report.html"}
)
public class YegorSmokeRunner {
}
