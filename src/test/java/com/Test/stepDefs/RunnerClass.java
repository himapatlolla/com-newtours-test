package com.Test.stepDefs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Prashanth Reddy\\Desktop\\javaprojects\\MyToursProject\\src\\test\\java\\resources\\newTours.feature",
format = {"pretty", "html:target/cucumber.html"})
public class RunnerClass extends Hooks{
}
