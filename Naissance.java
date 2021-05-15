public class Naissance extends Evenements{
	public Personne mere;
	public Personne pere;
	public Personne enfant;
	public Date dateNaissance;
	
	
	public Naissance(Personne mere, Personne pere, Personne enfant, Date dateNaissance) {
		this.mere = mere;
		this.pere = pere;
		this.enfant = enfant;
		this.dateNaissance = dateNaissance;
		this.enfant.setDate(dateNaissance);
	}
	
	public void afficher() {
		System.out.println("nom : " + enfant.getNom() + "prenom : " + enfant.getPrenom() +
				"nomMere : " + mere.getNom() + "nomPere : " + pere.getNom());
	}
	
	
	public Personne getMere() {
		return mere;
	}
	public void setMere(Personne mere) {
		this.mere = mere;
	}
	public Personne getPere() {
		return pere;
	}
	public void setPere(Personne pere) {
		this.pere = pere;
	}
	public Personne getEnfant() {
		return enfant;
	}
	public void setEnfant(Personne enfant) {
		this.enfant = enfant;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	
	
	
	}
	