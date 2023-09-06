package epsilon.WebDriver;

import org.testng.annotations.Test;

public class TestNGPractise {
	// we use @Test annotation for testing
	// if priority not mentioned then is is executed according to ascii value of the first letter of the method
	// if priority is given then lower the priority then the method is executed first
	// invocation is used to run the test as many number of times needed
	// data provider is used to load the data into test scripts, we use this to run the test annotations multiple times with different set of data for every run
	
	@Test(priority = 1,invocationCount = 3)
	public void createCustomer() {
		System.out.println("created");
	}
	
	@Test
	public void update() {
		System.out.println("updated");
	}
	
	@Test(priority = -2)
	public void delete() {
		System.out.println("deleted");
	}
	
}
