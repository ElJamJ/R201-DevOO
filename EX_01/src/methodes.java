//
//import java.util.Random;
//
//public class methodes {
//	
//	static void echange(char firstChar, char secondChar) {
//		char auxChar = secondChar;
//		secondChar = firstChar;
//		System.out.println("Voici maintenant la valeur de la de secondChar : " + secondChar);
//		firstChar = auxChar;
//		System.out.println("Voici maintenant la valeur de la de firstChar : " + firstChar);
//	}
//	
//	static void modifierTab(float tab[], int indice) {
//		tab[indice] = 150.7f;
//		System.out.println("Voici la valeur la case d'indice " + indice + " pendant le traitement : " + tab[indice]);
//	}
//	
//	static void modifierTabR(double tab[]) {
//		tab = null;
//		System.out.println("Voici l'adresse pendant : " + tab);
//	}
//	
//	static void echangerDeuxFloat(float f1, float f2) {
//		float auxFloat = f2;
//		f2 = f1;
//		System.out.println("Voici maintenant la valeur de la de f2 : " + f2);
//		f1 = auxFloat;
//		System.out.println("Voici maintenant la valeur de la de firstChar : " + f1);
//	}
//	
//	static void echangerDeuxFloatDansTableau(float[] tabFloat) {
//		tabFloat[0] = 15.02f;
//		System.out.println("Voici la valeur la case d'indice 0  pendant le traitement : " + tabFloat[0]);
//	}
//	
//	public static void main(String[] args) {
//		char a = 'A'; char b = 'B';
//		System.out.println("Here are the values of the variable a : " + a + "   and the variable b : " + b);
//		echange(a,b);
//		System.out.println("Here are now the values of the variable a : " + a + "   and the variable b : " + b);
//	
//		Random randomNB = new Random();
//		int indice = randomNB.nextInt(2);
//		System.out.println("Le nombre aléatoire est : " + indice);
//	
//		float tableau[] = {151.7f, 152.7f, 158.2f}; 
//		System.out.println("Voici la valeur la case d'indice " + indice + " avant le traitement : " + tableau[indice]);
//		modifierTab(tableau,indice);
//		System.out.println("Voici la valeur la case d'indice " + indice + " après le traitement : " + tableau[indice]);
//	
//		
//		double tableauReel[] = {1,2,3};
//		System.out.println("Voici l'adresse avant : " + tableauReel);
//		modifierTabR(tableauReel);
//		System.out.println("Voici l'adresse après : " + tableauReel);
//		
//		System.out.println();
//		float f1 = 15.0f; float f2 = 16.0f;
//		System.out.println("Here are the values of the variable f1 : " + f1 + "   and the variable f2 : " + f2);
//		echangerDeuxFloat(f1,f2);
//		System.out.println("Here are now the values of the variable f1 : " + f1 + "   and the variable f2 : " + f2);
//		
//		System.out.println();
//		float tableauFloat[] = {1f,2f,3f};
//		System.out.println("Voici la valeur la case d'indice 0  avant le traitement : " + tableauFloat[0]);
//		echangerDeuxFloatDansTableau(tableauFloat);
//		System.out.println("Voici la valeur la case d'indice 0 après le traitement : " + tableauFloat[0]);
//		
//	}
//}

public class methodes {
	static void echanges (char A, char B) {
		char C;	//temporary stores the value of the first value 
		C = A;
		A = B;
		System.out.println("Here the new value of the first varaible A"+ A);
		B = C;
		System.out.println("Here the new value of the first varaible B"+ B);
	}
	
	static void floatArrayModf (float fltArray[]) {
		System.out.println(fltArray[0]);
		fltArray[0] = 150.7f;
		System.out.println(fltArray[0]);
	}
	
	static void realArrayModf (double rArray[]) {
		rArray = null;
		System.out.println(rArray);

	}
}