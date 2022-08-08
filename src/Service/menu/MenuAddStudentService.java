package Service.menu;

import java.util.Scanner;

import Bean.Config;
import Bean.Student;
import Service.menu.inter.MenuAddStudentServiceInter;

public class MenuAddStudentService implements MenuAddStudentServiceInter {

	@Override
	public void process() {
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		String surname=sc.nextLine();
		sc.close();
		Student s = new Student();
		s.setName(name);
		s.setSurname(surname);
		
		Config.instance().appendStudent(s);
		
		
	}

}
