package elevage;

class Elevage{

    final static int NBMAX = 100 ;
    Volaille[] volailles ;
    int nbBetes ;

    Elevage () {
        volailles = new Volaille[NBMAX] ;
    }

    //----------------------------------------------------
    void ajouter(Volaille v){
        volailles[nbBetes] = v;
        nbBetes++;
    }

    //----------------------------------------------------
    void ecrire(){
        for (int i=0; i<nbBetes; i++){
            System.out.println(
                    volailles[i].identite + " " +
                            volailles[i].poids + " " +
                            volailles[i].getPrix());
        }
    }

    //----------------------------------------------------
    void changePoids(int id, double np){
        // Trouver la volaille dont on veut changer le poids
        Volaille v = rechercher(id) ;

        if (v != null)
            // Changer le poids de la volaille
            v.changerPoids(np);
    }
    //----------------------------------------------------
    Volaille rechercher(int id){
        // Parcourir le tableau de volailles
        for(int i=0; i<nbBetes; i++){

            // Tester si cette volaille est celle que l'on recherche
            if(volailles[i].identite == id){
                return volailles[i];
            }
        }

        // Si on arrive ici c'est qu'on n'a pas trouvé de volaille avec cet identifiant
        return null ;
    }
    //----------------------------------------------------
    Volaille[] envoyerALAbattoir(){
        // Variable locale pour stocker au fur et à mesure les volailles à abattre
        Volaille[] res = new Volaille[NBMAX];
        int nb = 0;
        int i = 0;

        // Parcourir l'ensemble des volailles
        while (i < nbBetes){
            System.out.print("+");

            // Si la volaille est assez grosse, l'ajouter au tableau temporaire
            if (volailles[i].assezGrosse()){
                // Stocker dans un tableau temporaire
                // les volailles assez grosses
                res[nb] = volailles[i];
                nb++;

                // Retirer cette volaille de l'élevage
                volailles[i]=volailles[nbBetes-1];
                nbBetes--;
            }
            else i++;
        }
        return res;
    }

    //----------------------------------------------------
    double evaluerBetesAAbattre(){
        double res = 0;

        // Parcourir le tableau des volailles
        for (int i=0; i<nbBetes; i++){

            // Cumuler le prix des volailles qui sont assez grosses pour être abattues
            if (volailles[i].assezGrosse()){
                res = res+volailles[i].getPrix();
            }
        }
        return res;
    }

    //----------------------------------------------------
    public String afficherBetesAAbattre() {
        String s = "";

        // Parcourir le tableau de volaille
        for (int i=0; i<nbBetes; i++){
            // Si la volaille est assez grosse pour être abattue
            if (volailles[i].assezGrosse()){
                // Afficher ses attributs
                s = s + volailles[i].toString();
            }
        }

        return s;
    }
}