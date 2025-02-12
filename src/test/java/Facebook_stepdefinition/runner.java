package Facebook_stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature_File/demo.feature" ,glue={"Facebook_stepdefinition"})
public class runner {

}
