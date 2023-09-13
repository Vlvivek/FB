package org.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\vlviv\\eclipse pro\\FaceBook"
		+ "\\FeatureFile\\FB.feature",glue = {"org.project","org.hooks"},
		dryRun = false)
public class RunnerClass {

}
 