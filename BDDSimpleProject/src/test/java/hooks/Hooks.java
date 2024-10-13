package hooks;

import java.io.IOException;

import basePack.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks
{
	@Before
	public void initializeDriver() throws IOException
	{
		BaseClass.testSetup();
	}
	
	@After
	public void CloseDriver()
	{
		BaseClass.tearDown();
	}


}
