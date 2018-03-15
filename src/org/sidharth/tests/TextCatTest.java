package org.sidharth.tests;

import org.sidharth.utils.textcat.TextCategorizer;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class TextCatTest {
	private static final String test = "We will help you in learning."
			+ "Please leave your comments and suggestions in comment section. "
			+ "We have provided search box you can serch there for answers ";

	@Test
	public void testTextCat() {
		String str = TextCatTest.test;
		str += str;
		System.out.println(str);
		long time = System.currentTimeMillis();
		TextCategorizer tc = new TextCategorizer();
		System.out.println(tc.categorize(str));
		AssertJUnit.assertEquals("english", tc.categorize(str));
		System.out.println("Time:" + (System.currentTimeMillis() - time));
	}

}
