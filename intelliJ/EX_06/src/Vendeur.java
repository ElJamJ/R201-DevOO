class Vendeur extends Commercial {
    private final static int POURCENTAGE = 20 ;
    private final static int BONUS = 200 ;

    public Vendeur (String prenom, String nom, int age, int date, double chiffreDaiffaires){
        super(prenom, nom, age, date, chiffreDaffaires);
    }

    int getPourcentage() {
        return POURCENTAGE;
    }

    int getBonus() {
        return BONUS;
    }
}