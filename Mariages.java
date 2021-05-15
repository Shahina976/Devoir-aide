import java.util.ArrayList;

public class Mariages extends Evenements {
	
	public Personne personne1;
	public Personne personne2;
	public Date dateEvenement;

	ArrayList<Mariage> listMariage = new ArrayList<Mariage>();
	



	public Mariages(Personne personne1, Personne personne2, Date dateEvenement) {
		this.dateEvenement= dateEvenement;
		this.personne1 = personne1;
		this.personne2 = personne2;
		
	}

	public Personne getPersonne1() {
		return personne1;
	}



	public void setPersonne1(Personne personne1) {
		this.personne1 = personne1;
	}



	public Personne getPersonne2() {
		return personne2;
	}



	public void setPersonne2(Personne personne2) {
		this.personne2 = personne2;
	}

	
	

		
		
}


