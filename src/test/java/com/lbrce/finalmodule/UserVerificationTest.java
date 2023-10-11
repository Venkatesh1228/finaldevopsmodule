package com.lbrce.finalmodule;
import org.testng.Assert;
import org.testng.annotations.Test;
public class UserVerificationTest {
		UserVerification uv=new UserVerification();
		@Test
		public void testcases1()
		{
			Assert.assertEquals(true,uv.check("usha","usha@2020"));
		}
		@Test
		public void testcases2()
		{
			Assert.assertEquals(false,uv.check("usha","usha@2020"));
		}
		@Test
		public void testcases3()
		{
			Assert.assertEquals(false,uv.check("usha1","usha@2020"));
		}
}
