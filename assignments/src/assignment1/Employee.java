package assignment1;
public class Employee {
	private String name;
	private int id;
	private static int emp_count = 0;

	public  Employee(String name,int id) {
		this.name=name;
		this.id=id;
		emp_count++;
	}
	public void displaydetails() {
        System.out.println("Employee id is: " + id);
        System.out.println("Name of the employee: " + name);
    }
  public static void displayEmployeeCount() {
      System.out.println("Total Employees Hired: " + emp_count);
  }
  public static void main(String[] args) {
      Employee e1 = new Employee("Jim",100);
      Employee e2 = new Employee("bill",101);
      Employee e3 = new Employee("jack",102);
      System.out.println("Employee Details");
      e1.displaydetails();
      System.out.println();
      e2.displaydetails();
      System.out.println();
      e3.displaydetails();
      System.out.println();
      System.out.println("Employee Count:");
      Employee.displayEmployeeCount();
  }
}
