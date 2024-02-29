import java.util.Scanner;

public class Magasin {
	final int NB_MAX;
	String nomMagasin;
	Table[] tables;
	int nbrTables;
	
	Magasin(String nomMagasin, int NB_MAX){
		this.nomMagasin = nomMagasin;
		this.NB_MAX = NB_MAX;
		tables = new Table[NB_MAX];	
	}
	
	void addTable(Table t) {
		tables[nbrTables] = t;
		nbrTables++;
	}
	
	public static void main(String[] args) {
		int numClient;
		String nomMagasin;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nSaisir un numero de Client : ");
		numClient = sc.nextInt();
		System.out.println("\nVoici votre numéro de client: "+ numClient);

		Magasin ikeaEvry;
		ikeaEvry = new Magasin("Yabicho", 9);
		Table t1;
		t1= new Table ();
		ikeaEvry.addTable(t1);
		
		System.out.println("nom du magasin: "+ikeaEvry.nomMagasin);
		System.out.println("nombre de tables chez "+ikeaEvry.nomMagasin+": "+ikeaEvry.nbrTables);
	}
}

