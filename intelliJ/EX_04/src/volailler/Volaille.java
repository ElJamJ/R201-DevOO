Volaille.java
package elevage;

public class Volaille {

    protected double poids;
    protected int identite;

    //----------------------------------------------------
    Volaille(double p, int i){
        poids = p;
        identite = i;
    }
    //----------------------------------------------------
    void changerPoids(double np){
        poids = np;
    }
    //----------------------------------------------------
    // La méthode getPrix() de la classe Volaille sert juste
    // à rassurer le compilateur
    // afin qu'il accepte de compiler la méthode ecrire()
    //de la classe Elevage
    double getPrix(){
        return 0;
    }
    //----------------------------------------------------
    // La méthode getPrix() de la classe Volaille sert juste
    // à rassurer le compilateur
    // afin qu'il accepte de compiler la méthode ecrire()
    // de la classe Elevage
    boolean assezGrosse(){
        return false ;
    }
}