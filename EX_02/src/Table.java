public class Table {
	int nbPied;
	String couleur;
	float prix;
	
	final static String NOIR = "Noir";
	final static int sizeOfTableVector = 4;
	
	Table(){
		nbPied = 4;
		couleur = "Marron";
	}
	
	Table(int nbPied){
		this.nbPied = nbPied;
		couleur = "Marron";
	}
	
	Table(int nbPied, String couleurT){
		this.nbPied = nbPied;
		couleur = couleurT;
	}
	
	public static void main(String[] args) {
		
		Table t1 = new Table();
		System.out.println("nbPied : " + t1.nbPied);
		System.out.println("Couleur : " + t1.couleur);
		System.out.println("nbPied : " + t1.prix);
		System.out.println();
		
		Table t2 = new Table(3);
    	System.out.println(t2.nbPied);
    	System.out.println(t2.couleur);
    	System.out.println(t2.prix);
    	System.out.println();
    	
    	Table t3 = new Table(6, Table.NOIR);
    	System.out.println (t3.nbPied);
    	System.out.println (t3.couleur);
    	System.out.println (t3.prix);
    	System.out.println ();
    	
    	Table t4;
    	t4 = t3;
    	t3.prix = 80;
    	System.out.println("Le prix de la table 3 est : " + t4.prix);
    	System.out.println();
    	
    	Table t[];
    	t = new Table [sizeOfTableVector];
    	t[0] = t1; t[1] = t2; t[3] = t3;
    	
    	float prixTotal = 0;
    	for(int i = 0; i<sizeOfTableVector; i++) {
    		if(t[i] != null) {
    			System.out.println("Voici le prix de la table " + i + " : " + t[i].prix);
        		prixTotal += t[i].prix;
    		}
    	}
    	System.out.println("Le prix de toutes les tables est : " + prixTotal);
    	
    	
    	
	} 
}