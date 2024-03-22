package banque;

public class CompteCourant {

	private static final double SEUIL_SECURITE = 1000;
	private int numCompte;
	private double solde;
	private Banque saBanque;
	private Client proprietaire;
	private double seuilDecouvert;

	
	public CompteCourant(int no, double nouveauSolde, double seuiDecouvert) {
		numCompte = no;
		this.seuilDecouvert = seuiDecouvert;
		setSolde (nouveauSolde); 

	}
	
	public void crediterSolde(double amountToAdd) {
		// TODO - implement CompteCourant.crediterSolde
		setSolde(getSolde()+amountToAdd);
		throw new UnsupportedOperationException();
	}

	public void debiterSolde(double amountToDebit) {
		// TODO - implement CompteCourant.debiterSolde
		setSolde(getSolde()-amountToDebit);
		throw new UnsupportedOperationException();
	}
	
	//-----------------------------------------
	// METHODES
	//-----------------------------------------
	void crediter (double montant) {
			solde = solde + montant ;
		}

		// méthode débiter qui vérifie que le solde (- le montant) est supérieur au seuil de découvert autorisé avant de débiter.
	void debiter (double montant) {
		if (solde - montant > -seuilDecouvert)
				solde = solde - montant ; 
	}

	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double newSolde) {
		this.solde = newSolde;
		if (newSolde > SEUIL_SECURITE)
			System.out.println ("ATTENTION tentative d’affectation suspecte d’un nouveau solde : compte no" + numCompte + " - tentative nouveau solde = "+ newSolde);
		else 
			solde = newSolde ; 
	}

	public double getSeuilDecouvert() {
		return seuilDecouvert;
	}

	public void setSeuilDecouvert(double seuilDecouvert) {
		this.seuilDecouvert = seuilDecouvert;
	}
	
	public Banque getSaBanque() {

		return saBanque;
	}
	public void setSaBanque(Banque saBanque) {
		this.saBanque = saBanque;
	}
	public Client getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}
	public int getNumero() {
		return numCompte;
	}
	public void setNumero(int numero) {
		this.numCompte = numero;
	}


	public double getSeuiDecouvertAutorise() {
		return seuilDecouvert;
	}
	public void setSeuiDecouvertAutorise(double seuiDecouvertAutorise) {
		this.seuilDecouvert = seuiDecouvertAutorise;
	}

}