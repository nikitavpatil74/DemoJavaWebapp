package com.javatechie.StringPalindrome;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	String input1 = "noon";
	App app = new App();
	boolean expected = true;

	@Test
	public void isPlaindromeTest() {
		assertEquals(expected, app.isPalindrome(input1));
	}

	@Test
	public void isNotPlaindromeTest() {
		assertEquals(false, app.isPalindrome("abc"));
	}

	@Test
	public void isPlaindromeSingleCharacterTest() {
		string input = "a";
		boolean expected = true;
		assertEquals(expected, app.isPalindrome(input));
	}


	@Test(expected = IllegalArgumentException.class)
	public void isNotPlaindromeExceptionTest() {
		assertEquals(false, app.isPalindrome(null));
	}

	@Test(expected = IllegalArgumentException.class)
	public void isPlaindromeNullInputTest() {
		assertEquals(false, app.isPalindrome(null));
	
		
	}
       
}
