package TestMySQLDAO;

import static org.junit.Assert.assertEquals;

import java.sql.Date;

import org.junit.jupiter.api.Test;
import ClasseDAO_SQL.MySQLRevueDAO;
import objetMetier.Abonnement;
import objetMetier.Revue;

public class TestDAOMySQLRevue {
	
	@Test
	public void testadd() {
		Revue r = new Revue(0,"test","test",0,"test",0);
		MySQLRevueDAO.getInstance().delete(r);
		assertEquals(true,MySQLRevueDAO.getInstance().create(r));
		MySQLRevueDAO.getInstance().delete(r);
	}
	
	@Test
	public void testUpdate() {
		Revue r = new Revue(0,"test","test",0,"test",0);
		MySQLRevueDAO.getInstance().create(r);
		assertEquals(true,MySQLRevueDAO.getInstance().update(r));
		MySQLRevueDAO.getInstance().delete(r);
	}
	
	@Test
	public void testDelete() {
		Revue r = new Revue(0,"test","test",0,"test",0);
		MySQLRevueDAO.getInstance().create(r);
		assertEquals(true,MySQLRevueDAO.getInstance().delete(r));
	}
	
	@Test
	public void testGetById() {
		Revue r = new Revue(0,"test","test",0,"test",0);
		MySQLRevueDAO.getInstance().delete(r);
		MySQLRevueDAO.getInstance().create(r);
		assertEquals(r,MySQLRevueDAO.getInstance().getById(r.getId_revue()));
		assertEquals(r,MySQLRevueDAO.getInstance().getById(r.getId_periodicite()));
	}
	

}