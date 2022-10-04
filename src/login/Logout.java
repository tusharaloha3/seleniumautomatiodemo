package login;

public class Logout {
	
	public void logout() {
		Login l=new Login();
		//l.username; // we cannot access private variables outside the class.
		//l.login; // we cannot access private method outside the class.
		System.out.println(l.uname);
		System.out.println(l.pass);
		l.login1();
		System.out.println(l.name);
		l.login2();
	}

}
