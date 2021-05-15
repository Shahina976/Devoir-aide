import java.util.*;  
public class Personne {
	Scanner clav = new Scanner(System.in);
	  public String nom;
	    public String nomUsage;
	    public String prenom;
	    public String lieuNaissance;
	    public int numeroId;
	    public String sexe;
	    public Date date;
	    
	    
	    public ArrayList<Mariage> mariage;
		public Deces decede ;
	    public ActedeNaissance actedenaissance;
	    
	    public Personne(String n, String nUsage, String p, String l, String s, Date d ) {	
	   	 this.nom=n;
	   	 this.nomUsage=nUsage;
	   	 this.prenom=p;
	   	 this.lieuNaissance=l;
	   	 this.sexe=s;
	   	 this.date=d;
	   	 mariage = new ArrayList<Mariage>();
	   	 decede = new Deces(this);
	    }
	    
	

	

	
  public Personne(){
  	
  }
  public int getIdentifiant() {				
  	return numeroId;
  }
  
  public void ajoutMariage(Mariage m) {		
  	mariage.add(m);
  }
  	
	  public <Mariage> Personne(int id, String n, String p){
	    	this.numeroId = id;
	    	this.nom = n;
	    	this.nomUsage = n;
	    	this.prenom = p;
	    	ArrayList<Mariage> mariage = new ArrayList<Mariage>();

		  
	  }
	  

	    public boolean estMarie() {					
	    	if (mariage.isEmpty()) { 
	    		return false;						
	    		}
	    	int i = mariage.size()-1;				//si l'emplacement est vide dans la liste des divorces à l'indice correspondant celui du dernier mariage dans la liste des marriages 
	    	if ((mariage.get(i).divorce==null)) { //et que la personne n'est pas veuve
	    		return true;						//alors le méthode retourne vrai
	    	} 
	    	else {return false;}					//en dehors de ces conditions, la méthode retourne faux
	    
	    }
	    
	    public boolean estDivorce() {
	    	if (mariage.isEmpty()) { 				
	    		return false;						
	    		}
	    	int i = mariage.size()-1;
	    	if (mariage.get(i).divorce==null) {		
	    		return false;						
	    	} else {
	    		return true;
	    		}					
	    }
		
		

	public Personne affichage() {
		if(nomUsage!=nom) {						
    		System.out.print("Nom : " +nom);
    		if(sexe=="f") {						
    			System.out.println(", épouse : " +nomUsage);
    		} else {
    			System.out.println(", époux : " +nomUsage);
    		}

    	} else { 
    		System.out.println("Nom : " +nom);	
    	}
    	System.out.println("Prenom : " +prenom);
    	System.out.println("Date de naissance : " +date);
    	System.out.println("Numéro Identifiant : "+numeroId);
    	System.out.println("sexe : " +sexe);
    	
    	if (estMarie()==true) {
    		int i = mariage.size()-1;
    		if(sexe=="f") {						
    			System.out.println("Etat civil : mariée" );
    	    } else {
    		System.out.println("Etat civil : marié" );
    	    
    	    }
    		System.out.println("Nom du conjoint : " +mariage.get(i).personne2.nom);
    	    System.out.println("Prénom du conjoint : " +mariage.get(i).personne2.prenom);
    		System.out.println("Numéro identifiant conjoint : " +mariage.get(i).personne2.numeroId);
    		
    	}else if (estDivorce()==true) {		
    		if(sexe=="f") {						
    			System.out.println("Etat civil : célibataire (divorcée)" );
    		} else {
    			System.out.println("Etat civil : célibataire (divorcé)" );
    		}	
    	}
		return null;
	}



	public Scanner getClav() {
		return clav;
	}



	public void setClav(Scanner clav) {
		this.clav = clav;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getNomUsage() {
		return nomUsage;
	}



	public void setNomUsage(String nomUsage) {
		this.nomUsage = nomUsage;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getLieuNaissance() {
		return lieuNaissance;
	}



	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}



	public int getNumeroId() {
		return numeroId;
	}



	public void setNumeroId(int numeroId) {
		this.numeroId = numeroId;
	}



	public String getSexe() {
		return sexe;
	}



	public void setSexe(String sexe) {
		this.sexe = sexe;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public ArrayList<Mariage> getMariage() {
		return mariage;
	}



	public void setMariage(ArrayList<Mariage> mariage) {
		this.mariage = mariage;
	}



	public Deces getDecede() {
		return decede;
	}



	public void setDecede(Deces decede) {
		this.decede = decede;
	}



	public void changeName(Personne x, String nouveauNom) {
    	x.nomUsage = nouveauNom;				
    }






	public ActedeNaissance getActedenaissance() {
		return actedenaissance;
	}






	public void setActedenaissance(ActedeNaissance actedenaissance) {
		this.actedenaissance = actedenaissance;
	}




	@Override
	public String toString() {
		return "Personne [clav=" + clav + ", nom=" + nom + ", nomUsage=" + nomUsage + ", prenom=" + prenom
				+ ", lieuNaissance=" + lieuNaissance + ", numeroId=" + numeroId + ", sexe=" + sexe + ", date=" + date
				+ ", mariage=" + mariage + ", decede=" + decede  + ", actedenaissance="
				+ actedenaissance + "]";
	}
    	


  }
  

