import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin="pretty",
		monochrome=true,
		dryRun=false
		//strict= true 
		)
public class Runner {

}
