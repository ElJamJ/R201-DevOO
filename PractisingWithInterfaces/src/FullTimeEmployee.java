public class FullTimeEmployee extends AbstractEmployee{
    FullTimeEmployee(String name, double salary){
        super(name,salary);
    }

    @Override
    public void work(){
        System.out.println(name+ " is working full-time !");
    }
}
