package photos;

import login.Login;

public class AddPhotos {
	
	//public Access Modifier
	//•	Classes/variables/methods specified with 'public' access modifier can be accessed by the classes outside the package after importing the classes.

	public static void addphotos() {
		Login l=new Login();
		System.out.println(l.uname);
		System.out.println(l.pass);
		l.login1();
		//l.name // we cannot access default variable outside the package.
	}

	public static void main(String[] args) {
		addphotos();
	}
}
