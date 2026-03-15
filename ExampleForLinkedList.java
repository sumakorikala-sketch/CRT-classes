import java.util.LinkedList;

class Employee
{
	private String empName;
	private String empDesignation;
	private String empEmail;
	public Employee(String empName, String empDesignation, String empEmail) {
		super();
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empEmail = empEmail;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empDesignation=" + empDesignation + ", empEmail=" + empEmail + "]";
	}
	
	
}

public class ExampleForLinkedList { 
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("suma","Student","suma@gmail.com");
		Employee e2 = new Employee("thanu","Student","thanu@gmail.com");
		Employee e3 = new Employee("keerthi","Student","keerthi@gmail.com");
		
		LinkedList<Employee> ll = new LinkedList<Employee>();
		ll.add(e1);
		ll.add(e2);
		ll.add(e3);
		
		for(Object Obj : ll)
		{
			System.out.println(Obj);
		}


		
	}

}
	
