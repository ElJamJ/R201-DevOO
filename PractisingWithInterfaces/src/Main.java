public class Main {
    public static void main(String[] args) {
        Company myCompany = new Company(5);

        Employee emp1 = new FullTimeEmployee("John", 1500);
        Employee emp2 = new PartTimeEmployee("Alice", 15000);
        Employee emp3 = new Intern("Soph", 50000);

        myCompany.addEmployee(emp1);
        myCompany.addEmployee(emp2);
        myCompany.addEmployee(emp3);

        myCompany.displayStaff();

        double totalSalary = myCompany.calculateTotalSalary();
        System.out.println("Total Salary: "+ totalSalary);

    }
}