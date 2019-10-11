package TestMySQLDAO;

import static org.junit.Assert.assertEquals;

import java.sql.Date;

import org.junit.jupiter.api.Test;
import ClasseDAO_SQL.MySQLAbonnementDAO;
import objetMetier.Abonnement;

public class TestDAOMySQLAbonnement {
	
	@Test
	public void testadd() {
		Abonnement a =new Abonnement(0,0,Date.valueOf("2012-05-30"),Date.valueOf("2012-06-30"));
		MySQLAbonnementDAO.getInstance().delete(a);
		assertEquals(true,MySQLAbonnementDAO.getInstance().create(a));
		MySQLAbonnementDAO.getInstance().delete(a);
	}
	
	@Test
	public void testUpdate() {
		Abonnement a =new Abonnement(0,0,Date.valueOf("2012-07-23"),Date.valueOf("2012-08-30"));
		MySQLAbonnementDAO.getInstance().create(a);
		assertEquals(true,MySQLAbonnementDAO.getInstance().update(a));
		MySQLAbonnementDAO.getInstance().delete(a);
	}
	
	@Test
	public void testDelete() {
		Abonnement a =new Abonnement(0,0,Date.valueOf("2014-09-02"),Date.valueOf("2015-09-02"));
		MySQLAbonnementDAO.getInstance().create(a);
		assertEquals(true,MySQLAbonnementDAO.getInstance().delete(a));
	}
	
	@Test
	public void testGetById() {
		Abonnement a =new Abonnement(0,0,Date.valueOf("2014-12-02"),Date.valueOf("2014-12-05"));
		MySQLAbonnementDAO.getInstance().delete(a);
		MySQLAbonnementDAO.getInstance().create(a);
		assertEquals(a,MySQLAbonnementDAO.getInstance().getById(a.getId_client()));
		assertEquals(a,MySQLAbonnementDAO.getInstance().getById(a.getId_revue()));
	}
	

}
