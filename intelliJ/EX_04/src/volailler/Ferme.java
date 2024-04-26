Ferme.java
package elevage;

public class Ferme {
    public static void main(String[] args){

        // PROBLEME : on peut créér une "volaille"
        // sans préciser si c'est un canard ou un poulet !!
        Volaille v = new Volaille (3, 2);

        // Creer et ajouter quelques animaux
        Elevage laFerme = new Elevage();
        for    (int i=0; i<15; i++){
            laFerme.ajouter(new Poulet(0.250,150+i));
        }

        for(int i=0; i<15; i++){
            laFerme.ajouter(new Canard(0.250,380+i));
        }

        for (int i=0; i<10; i++){
            laFerme.ajouter(new Poulet(0.250,700+i));
        }
        laFerme.ajouter(new Canard(0.750,825));


        // Changer le poids de quelques animaux
        for (int i=0; i<8; i++){
            laFerme.changePoids(155+i,1.3);
            laFerme.changePoids(382+i,1.55);
        }

        // Afficher l'état du volailler
        // Afficher l'état du volailler
        laFerme.ecrire();
        System.out.println("liste des animaux a abattre: ");
        System.out.println(laFerme.afficherBetesAAbattre());

        System.out.println("Valeur des animaux a abattre: ");
        System.out.println(laFerme.evaluerBetesAAbattre());
        laFerme.envoyerALAbattoir();
        laFerme.ecrire();

        System.out.println("Valeur des animaux a abattre: ");
        System.out.println(laFerme.evaluerBetesAAbattre());
    }

    //----------------------------------------------------
	/*public static void main (String args []) {
		// Créer un élevage
		Elevage ferme = new Elevage ();

		// Créer quelques poulets et quelques canards
		Poulet p1 = new Poulet(3, 10);
		Poulet p2 = new Poulet(1, 11);
		Canard c1 = new Canard (1, 12);
		Canard c2 = new Canard (2, 13);

		// Les ajouter à l'élevage
		ferme.ajouter(p1); 	ferme.ajouter(p2);
		ferme.ajouter(c1);	ferme.ajouter(c2);

		// Afficher la valeur totale des betes à abattre
		System.out.println("Valeur des animaux a abattre : " +
				ferme.evaluerBetesAAbattre() );
	}
	 */
    //----------------------------------------------------
}