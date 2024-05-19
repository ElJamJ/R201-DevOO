public class Company {
    private Employee[] staff;
    private int count;

    public Company(int size){
        staff = new Employee[size];
        count = 0;
    }
    public void addEmployee(Employee employee){
        if (count< staff.length){
            staff[count++] = employee;
        }else{
            System.out.println("No more space to add employees! ");
        }

    }

    public void displayStaff() {
        for (Employee emp : staff) {
            if (emp != null) {
                System.out.println(emp.getName() + " earns " + emp.getSalary());
                emp.work();
            } else {
                System.out.println("Empty position");
            }
        }
    }

    public double calculateTotalSalary() {
        double total = 0;
        for (Employee emp : staff) {
            if (emp != null) {
                total += emp.getSalary();
            }
        }
        return total;
    }
}
