//import java.util.Scanner;
//
//public class AfficherSaisir {
//
//	public static void main(String[] args) {
//
//		System.out.printf ("\naffichage formaté : %3.3f", Math.PI);		// Affichage formaté de PI avec trois chiffres après la virgule
//		Scanner sc = new Scanner(System.in);	// Lecture du clavier
//		System.out.println("\nSaisir un nombre n: ");
//		int n = sc.nextInt();	//récuperer dans la variable n le contenu de ce qui est tapé au clavier
//		System.out.print("Nombre aléatoire entre 0 et "+n+": ");	//Affichage classique
//		System.out.printf("%3.1f", ( Math.random())*n);	//Affichage d'un nombre aléatoire entre 0 et n formaté à 1 chiffre après la virgule
//	}
//
//}

/*
import java.util.Scanner;

public class AfficherSaisir {
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.printf("\nAffichage formaté : %3.3f", Math.PI);
		Scanner sc = new Scanner(System.in);
		System.out.print("\nSaisir un nombre : ");
		int n = sc.nextInt();
		System.out.print("Nombre aléatoire entre 0 et "+n+": ");
		System.out.printf("%3.1f",(Math.random())*n);
	}
}
*/
import java.util.Scanner;
public class AfficherSaisir {

	public static void main(String[] args) {
		final double PI = 3.141593;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bonjour");
		System.out.printf("\nAffichage formaté : %3.3f", PI);
		System.out.println("\nEntrez un nombre");
		int n = sc.nextInt();

	}
}