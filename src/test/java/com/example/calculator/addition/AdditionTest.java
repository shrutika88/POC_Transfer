package com.example.calculator.addition;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class AdditionTest {
	
	Addition ad = new Addition();
	
	@Test
	public void testAdd(){
		Assert.assertEquals(9, ad.add(4,5));
	}
	
	
	
}
