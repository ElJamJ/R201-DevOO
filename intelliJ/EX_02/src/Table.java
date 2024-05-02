public class Table {
    int nbPied;
    String couleur;
    float prix;
    final static int sizeOfTableVector = 4;


    Table(){
        nbPied = 4;
        couleur = "Marron";
    }

    Table(int nbPieds){
        this.nbPied = nbPieds;
        couleur = "Marron";

    }

    Table(int nbPied, String couleurT){
        this.nbPied = nbPied;
        couleur = couleurT;
    }

    public static void main(String[] args){
        Table t1 = new Table();
        System.out.println("nbPied: "+ t1.nbPied);
        System.out.println("Color: " + t1.couleur);
        System.out.println("nbPied : " + t1.prix);
        System.out.println();

        Table t2 = new Table(3);
        System.out.println("nbPieds: " + t2.nbPied);
        System.out.println("Color: " + t2.couleur);
        System.out.println("price: " + t2.prix);
        System.out.println();

        Table t3 = new Table(6, "Noir");
        System.out.println("nbPieds: " + t3.nbPied);
        System.out.println("color: " + t3.couleur);
        System.out.println("price: " + t3.prix);
        System.out.println();

        Table t4;
        t4 = t3;
        t3.prix = 80;
        System.out.println("table 3 price: " + t4.prix);
        System.out.println();

        Table t[];
        t = new Table[sizeOfTableVector];
        t[0] = t1; t[1] = t2; t[2] = t3;

        float prixTotal = 0;
            for (int i = 0; i<sizeOfTableVector; i++) {
                if(t[i] != null){
                    System.out.println("Voici le prix de la table " + i + " : " + t[i].prix);
                    prixTotal += t[i].prix;
                }
            }
            System.out.println();
            System.out.println("Le prix de toutes les tables est : " + prixTotal);

    }
}
