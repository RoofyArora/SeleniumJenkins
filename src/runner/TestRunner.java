package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="features", glue="stepdef", dryRun=false, plugin= {"pretty"})
public class TestRunner {

}
