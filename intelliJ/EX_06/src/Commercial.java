abstract class Commercial extends Employe {
    protected double chiffreDaffaires;

    public Commercial(String prenom, String nom, int age, int date double chiffreDaffaires){
        super(prenom, nom, age, date);
        this.chiffreDaffaires = chiffreDaffaires;
    }

    public double getChiffreDaffaires(){
        return chiffreDaffaires;
    }
    // On peut implémenter la méthode calculerSalaire
    // dès la classe Commercial
    // car on suppose que le salaire se calcule de la même manière
    // pour tous les commerciaux
    // (Une autre solution aurait été de laisser
    // cette méthode calculerSalaire() abstraite à ce niveau
    // et de l'implémenter dans chaque sous-classe de Commercial
    // comme pour Technicien par exemple)
    public double calculerSalaire() {
        return getPourcentage()/100 * chiffreAffaire + getBonus();
    }

    // On définit 2 méthodes abstraites pour pourcentage et bonus
    // car on ne connait pas encore leur valeur au niveau de Commercial :
    // Elles seront définies dans chaque sous classe de Commercial
    abstract int getPourcentage();
    abstract int getBonus();

}
