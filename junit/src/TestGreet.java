

import org.junit.Before;
import org.junit.Test;

import test.Calculator;
import test.Greeting;

import junit.framework.Assert;
import test.Calculator;

public class TestGreet {
	
	/*public void TestGreet()
	{
   Greeting g=new Greeting();
   String name="mark";
   String result=g.greet(name);
   System.out.println(result);
   Assert.assertEquals("welcome M",result);
	}*/
	/*@Test
	public void TestGreet2()
	{
		double pi=3.14;
		Assert.assertEquals(3.14,pi,5);
	}*/
	Calculator c;
	int a=0;
	@Before 
	public void set()
	{
		c=new Calculator();
	
	}
	@Test
	public void add()
	 {
		 
		 a=c.add(4,4,4);
		 Assert.assertEquals(12, a);
	 }
	
	@Test
	public void mul()
	{
		a=c.mul(2,2,2);
		Assert.assertEquals(8, a);
		
	}
	
	@Test
	public void sub()
	{
		a=c.sub(4,2);
		Assert.assertEquals(2, a);
		
	}
	
	@Test(expected=ArithmeticException.class)
	public void NotDivide()
	{
		a=c.div(2, 0);
	
	}
	
	
}
