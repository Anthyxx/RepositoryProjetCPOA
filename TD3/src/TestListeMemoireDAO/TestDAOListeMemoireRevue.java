package TestListeMemoireDAO;

import static org.junit.Assert.assertEquals;

import java.sql.Date;

import org.junit.jupiter.api.Test;
import ClasseDAO_ListeMemoire.ListeMemoireRevueDAO;
import objetMetier.Abonnement;
import objetMetier.Revue;

public class TestDAOListeMemoireRevue {
	
	@Test
	public void testadd() {
		Revue r = new Revue(0,"test","test",0,"test",0);
		assertEquals(true,ListeMemoireRevueDAO.getInstance().create(r));
		ListeMemoireRevueDAO.getInstance().delete(r);
	}
	
	@Test
	public void testUpdate() {
		Revue r = new Revue(0,"test","test",0,"test",0);
		ListeMemoireRevueDAO.getInstance().create(r);
		assertEquals(true,ListeMemoireRevueDAO.getInstance().update(r));
		ListeMemoireRevueDAO.getInstance().delete(r);
	}
	
	@Test
	public void testDelete() {
		Revue r = new Revue(0,"test","test",0,"test",0);
		ListeMemoireRevueDAO.getInstance().create(r);
		assertEquals(true,ListeMemoireRevueDAO.getInstance().delete(r));
	}
	
	@Test
	public void testGetById() {
		Revue r = new Revue(0,"test","test",0,"test",0);
		ListeMemoireRevueDAO.getInstance().create(r);
		assertEquals(r,ListeMemoireRevueDAO.getInstance().getById(r.getId_revue()));
		assertEquals(r,ListeMemoireRevueDAO.getInstance().getById(r.getId_periodicite()));
	}
	

}