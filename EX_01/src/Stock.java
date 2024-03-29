//
//public class Stock {
//
//	private static final String Array = null;
//
//	public static void main(String[] args) {
//
//		//---------------------------------------
//		// Déclarer les constantes
//		//---------------------------------------
//		final int NB_ARTICLES=3;
//
//		//---------------------------------------
//		// Déclarer les tableaux
//		//---------------------------------------
//		char codeArticle [];
//
//		double prix [];
//
//		//---------------------------------------
//		// Allouer les tableaux avec une taille max définie en constante
//		//---------------------------------------
//		codeArticle = new char [NB_ARTICLES];
//
//		prix = new double [NB_ARTICLES];
//
//		//---------------------------------------
//		// Mettre des valeurs dans les cases
//		//---------------------------------------
//		codeArticle[0]= 'A';
//		codeArticle[1]='B';
//		codeArticle[2]= 'C';
//		prix[0]= 10.5;
//		prix[1]= 2.5;
//		prix[2]= 21.5;
//
//		//---------------------------------------
//		// Parcours des deux tableaux avec deux boucles foreach
//		//---------------------------------------
//		for (char valeur : codeArticle)
//			System.out.print ("	"+valeur);
//
//		System.out.println();
//
//		for (double valeur : prix)
//			System.out.print ("	"+valeur);
//
//
//		//---------------------------------------
//		// Parcours des deux tableaux en parallèle avec une boucle while et un booleen
//		//---------------------------------------
//		System.out.println("\n");
//
//		boolean fini = false ; 
//		int i = 0 ; 
//		System.out.println ("\n Parcours du tableau avec un booleen et une boucle while : \n");
//		while (! fini) {
//			System.out.print ("	| "+codeArticle[i]+" |");
//			i++ ; 
//			fini = i == codeArticle.length ; // taille maximum
//		}
//
//		System.out.println();
//		boolean end = false ; 
//		int j = 0 ; 
//		while (! end) {
//			System.out.print ("	| "+prix[j]+"|");
//			j++ ; 
//			end = j == prix.length ; // taille maximum
//		}
//
//
//		//---------------------------------------
//		// Parcours des deux tableaux en parallèle avec une boucle for “classique” (pas une boucle for each)
//		//---------------------------------------
//		System.out.println("\n");
//
//		System.out.println("Parcours du tableau avec une boucle for classique\n");
//		for (int k = 0 ; k < codeArticle.length ; k++)
//			System.out.print ("	| "+codeArticle[k]+" |");
//		
//		System.out.println();
//		
//		for (int k = 0 ; k < prix.length ; k++)
//			System.out.print ("	| "+prix[k]+"|");
//	}
//
//}

public class Stock {
	

	public static void main(String[] args) {	
		//---------------------------------------
	// Déclarer les constantes
		//---------------------------------------
		int NB_ARTICLES = 3;

		//---------------------------------------
		// Déclarer les tableaux
		//---------------------------------------
		char codeArticles [];
		double prix [];
		
		//---------------------------------------
		// Allouer les tableaux avec une taille max définie en constante
		//---------------------------------------
		codeArticles = new char [NB_ARTICLES];
		
		prix = new double [NB_ARTICLES];
			
		//---------------------------------------
		// Mettre des valeurs dans les cases
		//---------------------------------------
		codeArticles[0] = 'A';
		codeArticles[1] = 'B';
		codeArticles[2] = 'C';
		
		prix[0] = 10.5;
		prix[1] = 2.5;
		prix[2] = 21.5;
		//---------------------------------------
		// Parcours des deux tableaux avec deux boucles foreach
		//---------------------------------------
		
		for (char valeur : codeArticles)
			System.out.print ("	"+valeur);
		
		System.out.println();
		
		for (double valeur : prix)
			System.out.print("	"+valeur);
		
		//---------------------------------------
		// Parcours des deux tableaux en parallèle avec une boucle while et un booleen
		//---------------------------------------

		System.out.println("\n");
		
				boolean fini = false ; 
				int i = 0 ;
				int j = 0;
				System.out.println ("\n Parcours du tableau avec un booleen et une boucle while : \n");
				while (! fini) {
					System.out.print ("	| "+codeArticles[i]+" |");
					System.out.print(" | "+prix[j]+" |");
					System.out.println();
					i++ ; 
					j++ ;
					fini = i == NB_ARTICLES  ; // taille maximum
				}

		//---------------------------------------
		// Parcours des deux tableaux en parallèle avec une boucle for “classique” (pas une boucle for each)
		//---------------------------------------
		
				System.out.println("\n");
				
					System.out.println("Parcours du tableau avec une boucle for classique\n");
					for (int k = 0 ; k < codeArticles.length ; k++)
						System.out.print ("	| "+codeArticles[k]+" |");
						
					System.out.println();
						
					for (int k = 0 ; k < prix.length ; k++)
						System.out.print ("	| "+prix[k]+"|");
	}
}

