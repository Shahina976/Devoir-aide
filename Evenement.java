public class Evenement {

	public Date dateEvenement;
	public String lieu;
	public String metier;
	
	
	public Evenement(Date dateEvenement, String lieu, String metier) {
		this.dateEvenement = dateEvenement;
		this.lieu = lieu;
		this.metier = metier;
	}
	public Date getDateEvenement() {
		return dateEvenement;
	}
	public void setDateEvenement(Date dateEvenement) {
		this.dateEvenement = dateEvenement;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getMetier() {
		return metier;
	}
	public void setMetier(String metier) {
		this.metier = metier;
	}
	
	public void afficher() {
		System.out.println("dateEvenement : " + dateEvenement + "lieu : " + lieu + "métier : " + metier); 
	}
	
}

