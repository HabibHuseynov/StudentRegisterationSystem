package Service.menu;

import Bean.Config;
import Bean.Student;
import Service.menu.inter.MenuShowStudentServiceInter;

public class MenuShowStudentService implements MenuShowStudentServiceInter {

	@Override
	public void process() {
		Student[] allStudent = Config.instance().getStudents();
		for(int i=0;i<allStudent.length;i++) {
			System.out.println(allStudent[i]);
			
		}
		
	}

}
