public abstract class FormeGeometrique {
    protected double x;
    protected double y;

    public FormeGeometrique(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //
    public abstract double getX();
    public abstract double getY();
    public abstract void setX(double x);
    public abstract void setY(double y);

    public abstract double perimetre();

    public abstract double surface();

    //Méthode pour déplacer la forme géométrique
    public void deplacer(double dx, double dy) {
        this.x = dx;
        this.y = dy;
    }

    //Méthode pour afficher les coordonnées de la forme géométrique
    public void afficher() {
        System.out.println("Position de la forme geometrique: (" + x + ", " + y + ")");
    }
}
