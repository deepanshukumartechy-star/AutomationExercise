package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features/",
        glue = {"stepDefinition"},
        plugin = {"com.aventstack.chaintest.plugins.ChainTestCucumberListener:"},
        monochrome = true,
        tags = "@SmokeTestt"
)

public class TestSuiteRunner  extends AbstractTestNGCucumberTests {

}
