package Models;

import java.util.ArrayList;

public class DetailPrinters {

	private ArrayList<Employee> employees;
	
	public DetailPrinters(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	public void printDetails() {
		for(Employee employee : this.employees) {
			System.out.println(employee);
		}
	}
}
