public abstract class AbstractEmployee implements Employee {
    protected String name;
    protected double salary;

    public AbstractEmployee(String nom, double salaire){
        this.name = nom;
        this.salary = salaire;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public double getSalary(){
        return salary;
    }
}
