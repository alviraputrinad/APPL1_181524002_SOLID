package Model;

import java.util.Scanner;

import Interface.ISecurityUI;

public class ScannerUI implements ISecurityUI {
	
	public Scanner sc;

	@Override
	public String requestKeyCard() {
		System.out.println("Slide your key card");
		return sc.nextLine();
	}

	@Override
	public int RequestPinCode() {
		System.out.println("Slide your key card");
		return sc.nextInt();
		
	}

}
