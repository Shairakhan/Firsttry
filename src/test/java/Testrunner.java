import io.cucumber.core.gherkin.Feature;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions
(
        features = {"src/test/java/featurefile/Login.feature"},
        //glue = {"steps"},//This is written when individual step defination is created for
        // individual feature file so step defination is put under package so package name has to be put under
        //the bracket
        plugin = {"pretty","html:target/report.html"}
       // glue ={"steps"}

)
public class Testrunner
{


}
