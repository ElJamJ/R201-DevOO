interface SalarieARisque {
    int PRIME_RISQUE = 250; // final est ajoute automatiquement

    // Necessaire si on veut pouvoir utiliser le polymorphisme
    // et appeler cette methode sur un tableau d'employe a risque
    double calculerSalaire();
}