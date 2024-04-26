package elevage;

class Canard extends Volaille{
    private static double prixAuKilo = 1.2;
    private static double poidsAbattage = 1.5 ;

    //----------------------------------------------------
    Canard(double p, int i){
        super (p, i);
    }

    //----------------------------------------------------
    // Retourner le prix de CE canard
    double getPrix(){
        return poids *prixAuKilo;
    }

    //----------------------------------------------------
    boolean assezGrosse(){
        return poids >= poidsAbattage;
    }

    //----------------------------------------------------
    static void changerPoidsAbattage(double x){
        poidsAbattage = x;
    }

    //----------------------------------------------------
    // Changer le prix au kilo du jour pour TOUS LES CANARDS
    static void changerPrix(double x){
        prixAuKilo = x;
    }

}








