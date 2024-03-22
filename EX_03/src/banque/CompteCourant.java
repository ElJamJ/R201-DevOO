package banque;

public class CompteCourant {

	private int numCompte;
	private double solde;
	private double seuilDecouvert;

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

	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public double getSeuilDecouvert() {
		return seuilDecouvert;
	}

	public void setSeuilDecouvert(double seuilDecouvert) {
		this.seuilDecouvert = seuilDecouvert;
	}

}