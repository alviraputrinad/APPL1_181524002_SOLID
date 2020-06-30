package Models;

public class Employee {
	
	public String Name;
	
	public Employee(String name) {
		
		this.Name = name;
	}
	
	public String getName() {
		
		return this.Name;
	}
	
	private void setName(String name) {
		
		this.Name = name;
	}
	@Override
	public String toString() {
		return this.Name; 
	}

	
}
