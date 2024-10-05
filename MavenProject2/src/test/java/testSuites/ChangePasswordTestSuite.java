package testSuites;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import basePack.BaseClass;
import testScripts.ChangePasswordTestScript;

@Listeners(basePack.ListenerClass.class)
public class ChangePasswordTestSuite extends BaseClass
{
	@Test
	public void tc123_ChnagePasswordTest() throws IOException
	{
		Assert.assertTrue(new ChangePasswordTestScript().performChangePassword(), "Test Case Failed : tc123_ChnagePasswordTest");
	}
	
	
	
	
	
}
