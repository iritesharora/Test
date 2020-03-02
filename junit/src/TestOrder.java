
import java.sql.SQLException;

import junit.framework.Assert;

import org.junit.Test;

import test.BOException;
import test.Order;
import test.OrderBO;
import test.OrderBOImpl;
import test.OrderDaoImpl;
import test.Testwithmain;;
public class TestOrder {
 
   @Test
   public void TestOrder() throws SQLException, BOException
   {
	   OrderDaoImpl dao = new OrderDaoImpl();
		OrderBO bo = new OrderBOImpl(dao);
		
		Order o = new Order();
		boolean placeOrder = bo.placeOrder(o);
		Order order;
		
   }

 
}
