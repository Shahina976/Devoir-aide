import java.util.ArrayList;
public class Divorce extends Evenements{
	
	public Personne personne1;
	public Personne personne2;
	public Date dateDivorce;
	public Divorce divorce;
	
	ArrayList<Divorce>listDivorce=new ArrayList<Divorce>();
	
	public Divorce(Personne x, Personne y, Date date) {	
    	dateDivorce = date;	
    	personne1=x;
    	personne2=y;
    }
	
	public Divorce(){
		this.listDivorce = new ArrayList<Divorce>();
	}
	
	public void ajoutDivorce (Personne personne1, Personne personne2) {
		
	}
	
	public void retirerListe(int nId1, int nId2) {
		
	}
}




