package testNG_Demos;

import org.testng.annotations.Test;

import Utility.baseFunction;

public class TNG_FristScript extends baseFunction {

	// testNG doesnt have main method.

	@Test
	public void testA() {
		System.out.println("TestA");
	}

	@Test
	public void testB() {
		System.out.println("TestB");
	}

	@Test
	public void testC() {
		System.out.println("TestC");
	}

	@Test
	public void testD() {
		System.out.println("TestD");
	}

}
