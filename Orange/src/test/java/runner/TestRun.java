package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"./src/test/java/features/src.feature"},
		
		glue = {"process"},
		
		dryRun = false,
		
		plugin = {"pretty" , "/html:target/HTML-output"},
		
		
		monochrome = true
		
		
	
		
				
		
		)

@Test
public class TestRun extends AbstractTestNGCucumberTests{
	
	

}
