package test;
import java.sql.SQLException;


public class OrderDaoImpl implements OrderDao {

	public int createOrder(Order order) throws SQLException, BOException {
		System.out.println("In OrderDaoImpl createOrder method");
		return 1;
	}

	public Order readOrder(int id) throws SQLException, BOException {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateOrder(int id, Order order) throws SQLException,
			BOException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteOrder(int id) throws SQLException, BOException {
		// TODO Auto-generated method stub
		return 0;
	}

}