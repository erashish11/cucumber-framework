package runner;

 
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = {"classpath: "},
        glue = {"stepdefinations."},
        plugin = {"json:target/cucumber.json", "html:target/site"}
)
public class RunnerTest {


}
