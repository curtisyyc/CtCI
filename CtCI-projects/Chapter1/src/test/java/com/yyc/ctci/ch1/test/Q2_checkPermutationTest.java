package com.yyc.ctci.ch1.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.yyc.ctci.ch1.Q2_checkPermutation;

public class Q2_checkPermutationTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void checkPermutationTest() {
		Assert.assertTrue(Q2_checkPermutation.isPermutation("abcde", "acbed"));
		Assert.assertFalse(Q2_checkPermutation.isPermutation("abcde", "acbedxs"));
		Assert.assertFalse(Q2_checkPermutation.isPermutation("abcde", "acbfx"));
	}

}
