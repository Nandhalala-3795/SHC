package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseClass;

@Listeners(listeners.Listeners.class)
public class SampleTest extends BaseClass {

	@Test
	public void tc1() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	@Test
	public void tc2() {
		
	}
	
}


