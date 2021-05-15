import java.util.*;
public class Deces extends Evenements {
	public Date dateDeces;
	public int numeroId;
	public Personne personne;				
    ArrayList<Deces> listDeces = new ArrayList<Deces>();
    
    public Deces() {
    	
    }
    
    public Deces(Personne personne, Date date) {
    	this.personne = personne;
    	this.dateDeces = date;
    	this.numeroId = this.personne.getNumeroId();
    }
    
    
    
    public void afficher() {
    	super.afficher();
    	System.out.println("nom : " + personne.getNom() + "prenom : " + personne.getPrenom() +
    			
    			"nomUsage : " + personne.getNomUsage() + "dateDeces" + this.dateDeces);
    }


	public int getNumeroId() {
		return numeroId;
	}


	public void setNumeroId(int numeroId) {
		this.numeroId = numeroId;
	}
    
}


