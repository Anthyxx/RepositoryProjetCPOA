package TestListeMemoireDAO;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import ClasseDAO_ListeMemoire.ListeMemoireClientDAO;
import objetMetier.Client;

public class TestDAOListeMemoireClient {
	
	@Test
	public void testadd() {
		ListeMemoireClientDAO.getInstance().delete(new Client(0,"test","test","test","test","test","test","test"));
		assertEquals(true,ListeMemoireClientDAO.getInstance().create(new Client(0,"test","test","test","test","test","test","test")));
		ListeMemoireClientDAO.getInstance().delete(new Client(0,"test","test","test","test","test","test","test"));
	}
	
	@Test
	public void testUpdate() {
		ListeMemoireClientDAO.getInstance().create(new Client(0,"test","test","test","test","test","test","test"));
		assertEquals(true,ListeMemoireClientDAO.getInstance().update(new Client(0,"tset","tset","tset","tset","tset","tset","tset")));
		ListeMemoireClientDAO.getInstance().delete(new Client(0,"test","test","test","test","test","test","test"));
	}
	
	@Test
	public void testDelete() {
		ListeMemoireClientDAO.getInstance().create(new Client(0,"test","test","test","test","test","test","test"));
		assertEquals(true,ListeMemoireClientDAO.getInstance().delete(new Client(0,"test","test","test","test","test","test","test")));
	}
	
	@Test
	public void testGetById() {
		Client C = new Client(0,"test","test","test","test","test","test","test");
		ListeMemoireClientDAO.getInstance().delete(C);
		ListeMemoireClientDAO.getInstance().create(C);
		assertEquals(C,ListeMemoireClientDAO.getInstance().getById(C.getId_client()));
	}
	

}