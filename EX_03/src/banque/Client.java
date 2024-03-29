package banque;

public class Client {

	final static int NB_MAX_COMPTES = 10 ; 
	private Banque saBanque;
	private CompteCourant[] sesComptesCourants;
	private int nbComptes ;
	private int numClient;
	private String nomClient;
	private String adresseClient;
	
	public Client(int numero, String nom, String adresse) {
		this.numClient = numero;
		this.nomClient = nom;
		this.adresseClient = adresse;
		sesComptesCourants = new CompteCourant[NB_MAX_COMPTES];
	}
	
	public void ajouterCompte(CompteCourant compte) {
		sesComptesCourants[nbComptes] = compte ;
		nbComptes++ ;
		
		// (on en profitera pour mémoriser que le propriétaire de ce compte est justement ce client!)
		compte.setProprietaire(this);
	}
	
	public int getNumero() {
		return numClient;
	}

	public void setNumero(int numero) {
		this.numClient = numero;
	}

	public String getNom() {
		return nomClient;
	}

	public void setNom(String nom) {
		this.nomClient = nom;
	}

	public String getAdresse() {
		return adresseClient;
	}

	public void setAdresse(String adresse) {
		this.adresseClient = adresse;
	}

	public int getNbComptes() {
		return nbComptes;
	}

	public void setSaBanque(Banque banque) {
		this.saBanque = banque ;
	}


}