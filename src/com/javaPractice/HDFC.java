package com.javaPractice;

public class HDFC implements P_Interface{

	@Override
	public void viewAccountBalance() {
		System.out.println("HDFC Child class of P_Interface View Account Balance");
		
	}

	@Override
	public void transferFuns() {
		System.out.println("HDFC Child class of P_Interface Transfer Funds");
		 
	}

	@Override
	public void openFixDeposite() {
		System.out.println("HDFC Child class of P_Interface Open Fix Deposite");
		
	}
	
	public void calculateHDFCIntredt() {
		System.out.println("HDF Chlild class own method calculateHDFCIntrest");
	}
	
	//Object cannot be created for the Interface but we can create the object of the child class.
	//When the child class object assign to the parent Interface then only parent interface variables and method can be access.
	// P_Interface p = new HDFC(); here P_Interface is the parent Interface and HDFC is the child class.
	
	public static void main(String[] args) {
		P_Interface h=new HDFC();
		h.viewAccountBalance();
		h.transferFuns();
		h.openFixDeposite();
		//P_Interface.ACCOUNTTYPEONE;
		//P_Interface.ACCOUNTTYPETWO;
	}

} 
