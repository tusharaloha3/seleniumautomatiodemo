package login;

public class Login {

//private Access Modifier
		//•	Java classes cannot be specified with 'private' access modifier.
		//•	variables/methods specified with 'private' access modifier can be accessed only with in the same class.
	
	//private variables
	private String username = "tusharpatil";
	private String password = "1234";

	//private method
	private void login() {
		System.out.println("Logged into the application using username: " + username + " and password: " + password);
	}

	public static void main(String[] args) {
		Login l = new Login();
		l.login();
		l.login1();
	}
	
//public Access Modifier
		//•	Classes/variables/methods specified with 'public' access modifier can be accessed directly by the classes which are in the same package.
		//•	Classes/variables/methods specified with 'public' access modifier can be accessed by the classes outside the package after importing the classes.

	// public variables
	public String uname="tushar";
	public String pass="1234";
	
	//public method
	public void login1() {
		System.out.println("Logged into the application using username: " + uname + " and password: " + pass);
	}
	
//default Access Modifier
	//•	When no modified is specified before classes/variables/methods, then we name it as default modifier.
	//•	default means public to all the classes inside the same package and private to the classes which are outside the package.
	// we can also make class default which can be public to all inside the same package and private outside the package.
	//default variable
	String name="Tushar";
	
	//default method
	void login2() {
		System.out.println("Logged into the application using username: " + name + " and password: " + name);
	}
//protected Access Modifier
	//•	protected means public to all the classes inside the same package and private to all the classes which are outside the package except child classes 
	//•	Java classes cannot be specified with 'protected' access modifier.
	//•	While accessing the protected variables/methods outside the packages using sub-classes, we don't have to create an object to access them as they are inherited variables and methods.

	//protected variable
	protected String first="Tushar";
	
	protected void login3() {
		System.out.println("Logged into the application using username: " + first + " and password: " + first);
	}
	
	
	
}
