package Model;

import Interface.ISecurityUI;

public class KeyCardCheck extends SecurityCheck{

	private ISecurityUI securityUI;
	
	public KeyCardCheck(ISecurityUI securityUI) {
		this.securityUI = securityUI;
	}
	
	private Boolean IsValid(String code) {
		return true;
	}
	
	@Override
	public Boolean ValidateUser() {
		String code = securityUI.requestKeyCard();
		if (IsValid(code)) {
			return true;
		}
		return false;
	}
}
