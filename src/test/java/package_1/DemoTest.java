package package_1;

import org.testng.annotations.Test;

public class DemoTest {
	//gggggg
		@Test(groups= {"smoke"})
		public void demoTest1()
		{
			System.out.println("----Demo Test1----");
		}
		@Test(groups= {"smoke"})
		public void demoTest2()
		{
			System.out.println("----Demo Test2----");
		}
		@Test
		public void demoTest3()
		{
			System.out.println("----Demo Test3----");
		}

}
