package TestListeMemoireDAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import ClasseDAO_ListeMemoire.ListeMemoirePeriodiciteDAO;
import objetMetier.Periodicite;

public class TestDAOListeMemoirePeriodicite {
	
	@Test
	public void testadd() {
		Periodicite P = new Periodicite(0,"test");
		assertEquals(true,ListeMemoirePeriodiciteDAO.getInstance().create(P));
		ListeMemoirePeriodiciteDAO.getInstance().delete(P);
	}
	
	@Test
	public void testUpdate() {
		ListeMemoirePeriodiciteDAO.getInstance().create(new Periodicite(0,"test"));
		assertEquals(true,ListeMemoirePeriodiciteDAO.getInstance().update(new Periodicite(0,"test")));
		ListeMemoirePeriodiciteDAO.getInstance().delete(new Periodicite(0,"test"));
	}
	
	@Test
	public void testDelete() {
		ListeMemoirePeriodiciteDAO.getInstance().create(new Periodicite(0,"test"));
		assertTrue(ListeMemoirePeriodiciteDAO.getInstance().delete(new Periodicite(0,"test")));
	}
	
	@Test
	public void testGetById() {
		Periodicite P = new Periodicite(0,"test");
		ListeMemoirePeriodiciteDAO.getInstance().create(P);
		assertEquals(P,ListeMemoirePeriodiciteDAO.getInstance().getById(P.getId_periodicite()));
	}
	

}