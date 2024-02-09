public class Table {

	int nombrePieds;
	String couleur;
	double prix;

static final String NOIR = "Noir";

	Table () {
		this.nombrePieds = 4;
		couleur = "Marron";
	}
	
	Table (int nbPieds) {
		this.nombrePieds = nbPieds;
		couleur = "Marron";
	}
	
	Table (int nbPieds, String color) {
		this.nombrePieds = nbPieds;
		this.couleur = NOIR;
	}

	public static void main (String args []) {
		Table t = new Table ();
		System.out.println (t.nombrePieds);
		System.out.println(t.couleur);
		System.out.println(t.prix);
		System.out.println();
		
		Table t2 = new Table (3);
		System.out.println(t2.nombrePieds);
		System.out.println(t2.couleur);
		System.out.println(t2.prix);
		System.out.println();
		
		Table t3 = new Table (6, Table.NOIR);
		System.out.println(t3.nombrePieds);
		System.out.println(t3.couleur);
		System.out.println(t3.prix);
		System.out.println();
	}
}