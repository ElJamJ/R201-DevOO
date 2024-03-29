package banque;

public class Banque {

	final static int NB_MAX_COMPTES = 1000 ; 
	final static int NB_MAX_CLIENTS = 1000 ; 
	private String nomBanque;
	private Client[] client;
	private CompteCourant[] comptes;
	private int nbComptes;
	private int nbClients;

}