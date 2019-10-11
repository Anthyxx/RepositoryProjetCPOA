package objetMetier;
import java.sql.Date;

public class Abonnement {
	
	private int id_client;
	private int id_revue;
	private Date date_debut;
	private Date date_fin;
	
	
	public Abonnement(Client c, Revue r, Date date_debut, Date date_fin) {
		super();
		this.id_client = c.getId_client();
		this.id_revue = r.getId_revue();
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}


	public Abonnement(int int1, int int2, Date date, Date date2) {
		// TODO Stub du constructeur généré automatiquement
		super();
		this.id_client = int1;
		this.id_revue = int2;
		this.date_debut = date;
		this.date_fin = date2;
	}


	public int getId_client() {
		return id_client;
	}


	public void setId_client(int id_client) {
		this.id_client = id_client;
	}


	public int getId_revue() {
		return id_revue;
	}


	public void setId_revue(int id_revue) {
		this.id_revue = id_revue;
	}


	public Date getDate_debut() {
		return date_debut;
	}


	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}


	public Date getDate_fin() {
		return date_fin;
	}


	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}


	@Override
	public String toString() {
		return "Abonnement [id_client=" + id_client + ", id_revue=" + id_revue + ", date_debut=" + date_debut
				+ ", date_fin=" + date_fin + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Abonnement other = (Abonnement) obj;
		if (date_debut == null) {
			if (other.date_debut != null)
				return false;
		} else if (!date_debut.equals(other.date_debut))
			return false;
		if (date_fin == null) {
			if (other.date_fin != null)
				return false;
		} else if (!date_fin.equals(other.date_fin))
			return false;
		if (id_client != other.id_client)
			return false;
		if (id_revue != other.id_revue)
			return false;
		return true;
	}
	
	

}
