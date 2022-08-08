package Service.menu;

import java.util.Scanner;

import Bean.Config;
import Service.menu.inter.MenuLoginServiceInter;

public class MenuLoginService implements MenuLoginServiceInter {

	@Override
	public void process() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Username :");
		String username=sc.nextLine();
		
		System.out.println("Password :");
		String password=sc.nextLine();
		
		if(!(username.equals("user") && password.equals("11111"))) {
			throw new IllegalArgumentException("user or password is invalid");
		}
		System.out.println("'''Great <------> you enter the system <------> '''");
		Config.setLoggedIn(true);
	}

}
