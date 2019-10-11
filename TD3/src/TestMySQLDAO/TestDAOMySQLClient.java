package TestMySQLDAO;
//test
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import ClasseDAO_SQL.MySQLClientDAO;
import objetMetier.Client;

public class TestDAOMySQLClient {
	
	@Test
	public void testadd() {
		MySQLClientDAO.getInstance().delete(new Client(0,"test","test","test","test","test","test","test"));
		assertEquals(true,MySQLClientDAO.getInstance().create(new Client(0,"test","test","test","test","test","test","test")));
		MySQLClientDAO.getInstance().delete(new Client(0,"test","test","test","test","test","test","test"));
	}
	
	
	@Test
	public void testUpdate() {
		MySQLClientDAO.getInstance().create(new Client(0,"test","test","test","test","test","test","test"));
		assertEquals(true,MySQLClientDAO.getInstance().update(new Client(0,"tset","tset","tset","tset","tset","tset","tset")));
		MySQLClientDAO.getInstance().delete(new Client(0,"test","test","test","test","test","test","test"));
	}
	
	@Test
	public void testDelete() {
		MySQLClientDAO.getInstance().create(new Client(0,"test","test","test","test","test","test","test"));
		assertEquals(true,MySQLClientDAO.getInstance().delete(new Client(0,"test","test","test","test","test","test","test")));
	}
	


	@Test
	public void testGetById() {
		Client C = new Client(0,"test","test","test","test","test","test","test");
		MySQLClientDAO.getInstance().delete(C);
		MySQLClientDAO.getInstance().create(C);
		assertEquals(C,MySQLClientDAO.getInstance().getById(C.getId_client()));
	}
	

}
