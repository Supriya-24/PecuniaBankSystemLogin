package com.capgemini.pecuniabank.login.junit;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import com.capgemini.pecuniabank.login.servicelayer.LoginService;
import com.capgemini.pecuniabank.login.servicelayer.LoginServiceImpl;
class JunitTestCase 
{
	LoginService ls=new LoginServiceImpl();
	@Test
	public void testAddPositive() {
		Assert.assertEquals(true,ls.validateUsers("123","anurag"));
	}
	@Test
	public void testAddNegative() {
		Assert.assertNotNull(false);
	}
}
