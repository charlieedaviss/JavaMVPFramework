package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        // Link to tags documentation:
        // https://cucumber.io/docs/cucumber/api/?lang=java#tags

        // these are all parameters -> (features, glue, tags, plugins)
        // Features is which feature files you want to run
        features = "src//test//java//features",
        // glue is the package where  your Steps are implemented.
        glue = "stepdefs",
        // tags are essentially groups
        tags = "@Wip", // tags = "@Chirag or @Paulina or @Regression",
        // Plugin is usually for which type of reporting tool you want to use
        // html: is what type of plugin we want
        // after the : is where we want it, in this case
        // we have it saved in html-report folder
        plugin = {"html:html-report/report.html",
                // Below will create a json file report
                // it is saved in the Target folder.
                // json files are smaller
                "json:target/cucumber.json",},

        // dryRun = true will normall run ALL feature files unless there are specified Tags (I think)
        // It's a great way to see if there are any un-implemented steps in your feature files.
        dryRun = false)

public class TestRunner {

}
