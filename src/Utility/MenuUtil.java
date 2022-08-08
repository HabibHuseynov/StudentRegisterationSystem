package Utility;

import java.util.Scanner;

public class MenuUtil {
	public static Menu showMenu() {

		Menu.showAllMenu();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please select menu");
		int selectedMenu = scan.nextInt();
		
		return Menu.find(selectedMenu);
	}
	
	public static void processMenu(Menu menu) {
		menu.process();
		showMenu();
	}

}
