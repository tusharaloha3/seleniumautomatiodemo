package login;

import com.javaPractice.P_Interface;

public class ICICI implements P_Interface{

	@Override
	public void viewAccountBalance() {
		System.out.println("View Account Balance");
		
	}

	@Override
	public void transferFuns() {
		System.out.println("Transfer Funds");
		
	}

	@Override
	public void openFixDeposite() {
		System.out.println("Open Fix Deposite");
		
	}

}
