package TestListeMemoireDAO;

import static org.junit.Assert.assertEquals;

import java.sql.Date;

import org.junit.jupiter.api.Test;
import ClasseDAO_ListeMemoire.ListeMemoireAbonnementDAO;
import objetMetier.Abonnement;

public class TestDAOListeMemoireAbonnement {
	
	@Test
	public void testadd() {
		Abonnement a = new Abonnement(0,0,Date.valueOf("2012-05-30"),Date.valueOf("2012-06-30"));
		ListeMemoireAbonnementDAO.getInstance().delete(a);
		assertEquals(true,ListeMemoireAbonnementDAO.getInstance().create(a));
		ListeMemoireAbonnementDAO.getInstance().delete(a);
	}
	
	@Test
	public void testUpdate() {
		Abonnement a =new Abonnement(0,0,Date.valueOf("2012-07-23"),Date.valueOf("2012-08-30"));
		ListeMemoireAbonnementDAO.getInstance().create(a);
		assertEquals(true,ListeMemoireAbonnementDAO.getInstance().update(a));
		ListeMemoireAbonnementDAO.getInstance().delete(a);
	}
	
	@Test
	public void testDelete() {
		Abonnement a =new Abonnement(0,0,Date.valueOf("2014-09-02"),Date.valueOf("2015-09-02"));
		ListeMemoireAbonnementDAO.getInstance().create(a);
		assertEquals(true,ListeMemoireAbonnementDAO.getInstance().delete(a));
	}
	
	@Test
	public void testGetById() {
		Abonnement a =new Abonnement(0,0,Date.valueOf("2014-12-02"),Date.valueOf("2014-12-05"));
		ListeMemoireAbonnementDAO.getInstance().delete(a);
		ListeMemoireAbonnementDAO.getInstance().create(a);
		assertEquals(a,ListeMemoireAbonnementDAO.getInstance().getById(a.getId_client()));
		assertEquals(a,ListeMemoireAbonnementDAO.getInstance().getById(a.getId_revue()));
	}
	

}
