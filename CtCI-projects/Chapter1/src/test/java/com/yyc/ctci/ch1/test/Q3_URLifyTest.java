package com.yyc.ctci.ch1.test;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yyc.ctci.ch1.*;

public class Q3_URLifyTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void urlifyTest() {
		Assert.assertEquals("I'm%20good!", Q3_URLify.urlify("I'm good!    ", 9));
		Assert.assertEquals("Hello%20world", Q3_URLify.urlify("Hello world   ", 11));
	}

}
