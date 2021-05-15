import java.util.ArrayList;
import java.util.List;

public class ActedeNaissance {
	public Personne personne;
	
	public Mariage mariage;
	public Deces deces;
	public Divorce divorce;
	
	public String nomCompletPere;
	public String nomCompletMere;

	private List<ActedeNaissance> listActe;


	
	public ActedeNaissance(Personne personne, Mariage mariage, Deces deces, Divorce divorce, String nomCompletPere,
			String nomCompletMere) {
		this.personne = personne;
		this.mariage = mariage;
		this.deces = deces;
		this.divorce = divorce;
		this.nomCompletPere = nomCompletPere;
		this.nomCompletMere = nomCompletMere;
		
	}

	
	 public void afficher() {
		 
	    	System.out.println("nom : " + personne.getNom() + "prenom : " + personne.getPrenom() +
	    			
	    			"nomUsage : " + personne.getNomUsage());
	    }
	 

	public Personne getPersonne() {
		return personne;
	}


	public void setPersonne(Personne personne) {
		this.personne = personne;
	}


	public Mariage getMariage() {
		return mariage;
	}


	public void setMariage(Mariage mariage) {
		this.mariage = mariage;
	}


	public Deces getDeces() {
		return deces;
	}


	public void setDeces(Deces deces) {
		this.deces = deces;
	}


	public Divorce getDivorce() {
		return divorce;
	}


	public void setDivorce(Divorce divorce) {
		this.divorce = divorce;
	}


	public String getNomCompletPere() {
		return nomCompletPere;
	}


	public void setNomCompletPere(String nomCompletPere) {
		this.nomCompletPere = nomCompletPere;
	}


	public String getNomCompletMere() {
		return nomCompletMere;
	}


	public void setNomCompletMere(String nomCompletMere) {
		this.nomCompletMere = nomCompletMere;
	}


	public List<ActedeNaissance> getListActe() {
		return listActe;
	}


	public void setListActe(List<ActedeNaissance> listActe) {
		this.listActe = listActe;
	}





	@Override
	public String toString() {
		return "ActedeNaissance [personne=" + personne + ", mariage=" + mariage + ", deces=" + deces + ", divorce="
				+ divorce + ", nomCompletPere=" + nomCompletPere + ", nomCompletMere=" + nomCompletMere + "]";
	}
	
	
	
	
}
