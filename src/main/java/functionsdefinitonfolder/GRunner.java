package functionsdefinitonfolder;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@CucumberOptions(features = "src//main//resources//featuresfolder",glue ="functionsdefinitonfolder",monochrome = true,dryRun = false)
@RunWith(Cucumber.class)
public class GRunner
{
	




}