package assesment;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\Assesment.feature",
                glue="Assesmenttest.java")

public class TestRunnerassement {

}
