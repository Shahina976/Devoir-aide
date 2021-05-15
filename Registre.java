import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registre {
	
	public static ArrayList<Personne> listPersonne = new ArrayList<Personne>();
	
	public void Registre() {				
							
		 this.listPersonne = new ArrayList<Personne>();
    }

	public Personne trouverPersonne (int id) {	
		Personne s;
		for (int j = 0; j < this.listPersonne.size(); j++) { 
			if (id == listPersonne.get(j).numeroId) {
				return listPersonne.get(j).affichage();
				
			}
			
		}
		return null;
		
	}
	
	
   	int newIdentifiant () {		
		int id=0;
		for (int i = 0; i<this.listPersonne.size(); i++) {
			id =id+listPersonne.size();
		}
			return id;		
	}


	
	void ajouterPersonne(Personne personne) {
		
		int taille= listPersonne.size();
		// créer un acte de naissance
		// le rattacher à personne 
		if (personne!=null) 	
		{	
			personne.setNumeroId(taille);
			this.listPersonne.add(personne);
			
		}
		
	}

    public void affichage() {	
    	Personne p;
    	for (int j = 0; j<listPersonne.size(); j++) {		
			p= listPersonne.get(j);				 
			System.out.println (p);
			
		}
    	int nbhabitant = listPersonne.size();				
		System.out.println("Le nombre d'habitants de la ville est "+nbhabitant);
		
}
  
	List<ActedeNaissance> listActe = new ArrayList<ActedeNaissance>();
	
	List<Mariage> listMariage = new ArrayList<Mariage>();
	
	List<Divorce> listDivorce = new ArrayList<Divorce>();
	
	List<Deces> listDeces = new ArrayList<Deces>();
	
	List<Naissance> Naissance = new ArrayList<Naissance>();
	
	public void ajouterDeces(Personne personne) {
		for (int i = 0; i< this.listDeces.size(); i++) {
			if (personne.getNumeroId() == listDeces.get(i).getNumeroId()) {
				this.listDeces.add(personne);
			}
		 
		}
	}
	
}



