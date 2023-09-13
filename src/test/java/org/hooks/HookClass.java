package org.hooks;

import java.io.File;
import java.io.IOException;

import org.base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class HookClass extends BaseClass{
	
	@Before
	public void startup() {
		setupInitiative("edge", "https://www.facebook.com/");
	}
	@BeforeStep
	public void waits() {
		implicitwait();
	}
	@After
	public void cleanup() {
		driver.close();
	}
	@AfterStep
	public void takesnap() throws IOException {
		screenshot(new File("C:\\Users\\vlviv\\eclipse pro\\FaceBook\\"
				+ "target\\fb.png"));
	}
}
