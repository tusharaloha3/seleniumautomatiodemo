package photos;

import login.Login;

//protected Access Modifier
//•	protected means public to all the classes inside the same package and private to all the classes which are outside the package except child classes 
//•	Java classes cannot be specified with 'protected' access modifier.
//•	While accessing the protected variables/methods outside the packages using sub-classes, we don't have to create an object to access them as they are inherited variables and methods.

public class LoginChildClass extends Login{
	
	public void login4() {
		System.out.println(first);
		login3();
	}
	public static void main(String[] args) {
		LoginChildClass l=new LoginChildClass();
		l.login4();
	}
}
