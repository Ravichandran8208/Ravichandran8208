package cucumberRunner;

import org.testng.annotations.Test;

import cucumberStepDefinition.EEBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\main\\java\\cucumberFeatureFile", glue="cucumberStepDefinition", monochrome=true,publish=true)

public class Runner extends EEBase{

}
