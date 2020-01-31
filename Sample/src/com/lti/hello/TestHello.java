package com.lti.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHello {

	@Test
	public void test() {
		boolean result;
		SampleClass sc=new SampleClass();
		result=sc.Add();
		assertEquals(true, result);
	}
}

