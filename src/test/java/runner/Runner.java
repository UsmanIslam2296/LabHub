package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "/Users/zebaislam/eclipse-workspace/LabHub/src/main/java/features",
                 glue= "step_definitions",
                 plugin= {"pretty", "html: target/cucumber_report"},
                 monochrome= true)

public class Runner {

 
	
	
}
