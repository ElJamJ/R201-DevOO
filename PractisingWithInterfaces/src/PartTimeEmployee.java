public class PartTimeEmployee extends AbstractEmployee {
    PartTimeEmployee(String name, double salary){
        super(name, salary);
    }

    @Override
    public void work(){
        System.out.println(name+ "is working part-time! ");
    }
}
