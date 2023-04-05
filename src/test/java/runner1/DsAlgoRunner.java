package runner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:taget/rama.html"},monochrome=true,
features={"C:\\Rama\\workspace\\DsAlgo_FrameWork\\src\\test\\resources\\FeatureFiles"},
glue={"stepDefinition"})



public class DsAlgoRunner extends AbstractTestNGCucumberTests{

}
