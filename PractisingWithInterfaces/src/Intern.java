public class Intern extends AbstractEmployee{
    Intern(String name, double salary){
        super(name, salary);
    }

    @Override
    public void work(){
    System.out.println(name+ "is an intern working! ");
    }
}
