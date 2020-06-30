package Program;

import Model.KeyCardCheck;
import Model.PinCodeCheck;
import Model.SecurityManager;
import Model.ScannerUI;

public class Program {
	public static void Main() 
    {
		ScannerUI scannerUi = new ScannerUI();
		KeyCardCheck keyCardCheck = new KeyCardCheck(scannerUi);
        PinCodeCheck pinCodeCheck = new PinCodeCheck(scannerUi);
        SecurityManager manager = new SecurityManager(keyCardCheck, pinCodeCheck);
        manager.check();
    }
}
