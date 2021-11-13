package logintest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature",
glue="src\\test\\java\\logintest" ,monochrome=true, plugin = {"pretty","html:target/reports"})
public class Testrunner {

}
