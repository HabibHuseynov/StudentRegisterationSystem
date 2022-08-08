package Utility;

import Bean.Config;
import Service.menu.MenuAddStudentService;
import Service.menu.MenuAddTeacherService;
import Service.menu.MenuLoginService;
import Service.menu.MenuRegisterService;
import Service.menu.MenuShowStudentService;
import Service.menu.MenuShowTeacherService;
import Service.menu.inter.MenuService;

public enum Menu {
	LOGIN(1,"Login", new MenuLoginService()),
	REGISTER(2,"Register", new MenuRegisterService()),
	ADD_TEACHER(3,"Add teacher", new MenuAddTeacherService()),
	ADD_STUDENT(4,"Add student", new MenuAddStudentService()),
	SHOW_ALL_TEACHER(5,"Show all teacher", new MenuShowTeacherService()), 
	SHOW_ALL_STUDENT(6,"Show all students", new MenuShowStudentService()),
	UNKNOWN;
	
	
	private String label;
	private MenuService service;
	private int number;
	
	Menu(){
		
	}
	
	Menu(int number,String label,MenuService service){
		this.number=number;
		this.label=label;
		this.service=service;
		
	}
	
	public String getLabel() {
		return this.label;
	}

	@Override
	public String toString() {
		return number +". "+label;
	}
	
	public void process() {
		service.process();
		
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public static Menu find(int number) {
		Menu[] menus= Menu.values();
		for(int i=0;i<menus.length;i++) {
			if(menus[i].getNumber()==number) {
				return menus[i];
			}
		}
		return Menu.UNKNOWN;
	}
	
	public static void showAllMenu() {
		Menu[] menus = Menu.values();
		
		for(int i=0;i<menus.length;i++) {
			if(menus[i]!=UNKNOWN) {
				if(menus[i]==LOGIN &&menus[i]==REGISTER ) {
					System.out.println(menus[i]);
				}
				
				else if(Config.isLoggedIn()) {
					System.out.println(menus[i]);
				}
			}
			
		}
	}
}
