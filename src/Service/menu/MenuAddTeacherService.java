package Service.menu;

import java.util.Scanner;

import Bean.Config;
import Bean.Teacher;
import Service.menu.inter.MenuAddStudentServiceInter;

public class MenuAddTeacherService  implements MenuAddStudentServiceInter {

	@Override
	public void process() {
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		String surname=sc.nextLine();
		sc.close();
		
		Teacher t = new Teacher();
		t.setName(name);
		t.setSurname(surname);
		
		Config.instance().appendTeacher(t);
		
	}

}
