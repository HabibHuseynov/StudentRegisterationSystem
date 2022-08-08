package Service.menu;

import Bean.Config;
import Bean.Teacher;
import Service.menu.inter.MenuShowTeacherServiceInter;

public class MenuShowTeacherService implements MenuShowTeacherServiceInter {

	@Override
	public void process() {
		Teacher[] allTeacher = Config.instance().getTeachers();
		for(int i=0;i<allTeacher.length;i++) {
			System.out.println(allTeacher[i]);
			
		}
		
	}

}
