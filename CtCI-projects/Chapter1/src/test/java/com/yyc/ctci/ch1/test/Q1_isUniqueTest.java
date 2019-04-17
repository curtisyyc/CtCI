package com.yyc.ctci.ch1.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yyc.ctci.ch1.*;

import org.junit.Assert;

public class Q1_isUniqueTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void hasUniqueCharTest() {
		Assert.assertTrue("\"abcde\" should has unique characters", Q1_isUnique.isUnique("abcde"));
		Assert.assertFalse("\"abccc\" should NOT has unique characters",Q1_isUnique.isUnique("abccc"));
	}

}
