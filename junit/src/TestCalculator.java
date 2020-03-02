import org.junit.Test;

import junit.framework.Assert;
import test.Calculator;

class TestCalculator {
 @Test
 public void TestCalculator()
 {
	 Calculator c=new Calculator();
	 int a=c.add(4,4);
	 Assert.assertEquals(8, a);
 }
}
