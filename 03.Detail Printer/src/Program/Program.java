package Program;

import java.util.ArrayList;

import Models.DetailPrinters;
import Models.Employee;
import Models.Manager;

public class Program {
	public static void Main()
    {
		Employee employee = new Employee("Name");
		Manager manager = new Manager("Manager name", new ArrayList<String>());
	
		ArrayList <Employee> employees = new ArrayList();
		employees.add(employee);
		employees.add(manager);
		
		DetailPrinters printer = new DetailPrinters(employees);
		printer.printDetails();
    }
    
}
