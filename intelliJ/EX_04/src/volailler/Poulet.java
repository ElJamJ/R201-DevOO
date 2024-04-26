Poulet.java
package elevage;

class Poulet extends Volaille{

    private static double prixAuKilo = 1.0;
    private static double poidsAbattage = 1.2;

    //----------------------------------------------------
    Poulet(double p, int i){
        super (p,i);
    }

    //----------------------------------------------------
    double getPrix(){
        return poids *prixAuKilo ;
    }

    //----------------------------------------------------
    boolean assezGrosse(){
        return poids >= poidsAbattage;
    }
    //----------------------------------------------------
    public static void main (String args []) {
        // Démarrer avec un élevage vide
        // Fixer le prix en euro par kilo pour les poulets
        // => On peut modifier une variable static même si on n'a pas crée d'instance de cette classe
        prixAuKilo = 2 ;
        Poulet p = new Poulet (1.2, 131);
    }

    //----------------------------------------------------
    static void changerPrix(double x){
        prixAuKilo = x;
    }
    //----------------------------------------------------
    static void changerPoidsAbattage(double x){
        poidsAbattage = x;
    }
}