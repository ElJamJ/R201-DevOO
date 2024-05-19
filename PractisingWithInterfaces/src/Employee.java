public interface Employee {
    String getName();
    double getSalary();
    default void work(){
        System.out.println("This employee is working !");
    }
}
