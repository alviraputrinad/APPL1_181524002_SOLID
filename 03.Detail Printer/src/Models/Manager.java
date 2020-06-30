package Models;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Manager extends Employee {
	ArrayList<String> Document;

	public Manager(String name, ArrayList<String> documents) {
		super(name);
		this.Document = new ArrayList<String> (documents);
	}

	public void setDocuments(ArrayList<String> documents) {
		
		this.Document = documents; 
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + String.join("\n",this.Document);
	}
}
