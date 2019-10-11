package TestMySQLDAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import ClasseDAO_SQL.MySQLPeriodiciteDAO;
import objetMetier.Periodicite;

public class TestDAOMySQLPeriodicite {
	
	@Test
	public void testadd() {
		Periodicite P = new Periodicite(0,"test");
		MySQLPeriodiciteDAO.getInstance().delete(P);
		assertEquals(true,MySQLPeriodiciteDAO.getInstance().create(P));
		MySQLPeriodiciteDAO.getInstance().delete(P);
	}
	
	@Test
	public void testUpdate() {
		MySQLPeriodiciteDAO.getInstance().create(new Periodicite(0,"test"));
		assertEquals(true,MySQLPeriodiciteDAO.getInstance().update(new Periodicite(0,"test")));
		MySQLPeriodiciteDAO.getInstance().delete(new Periodicite(0,"test"));
	}
	
	@Test
	public void testDelete() {
		MySQLPeriodiciteDAO.getInstance().create(new Periodicite(0,"test"));
		assertTrue(MySQLPeriodiciteDAO.getInstance().delete(new Periodicite(0,"test")));
	}
	
	@Test
	public void testGetById() {
		Periodicite P = new Periodicite(0,"test");
		MySQLPeriodiciteDAO.getInstance().delete(P);
		MySQLPeriodiciteDAO.getInstance().create(P);
		assertEquals(P,MySQLPeriodiciteDAO.getInstance().getById(P.getId_periodicite()));
	}
	

}