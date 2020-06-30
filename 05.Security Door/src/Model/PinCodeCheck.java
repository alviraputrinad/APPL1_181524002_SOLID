package Model;

import Interface.ISecurityUI;

public class PinCodeCheck extends SecurityCheck {
	private ISecurityUI securityUI;
	
	public PinCodeCheck(ISecurityUI securityUI) {
		this.securityUI = securityUI;
	}
	
	private Boolean IsValid(int pin) {
		return true;
	}
	
	@Override
	public Boolean ValidateUser() {
		int pin = securityUI.RequestPinCode();
		if (IsValid(pin)) {
			return true;
		}
		return false;
	}

}
