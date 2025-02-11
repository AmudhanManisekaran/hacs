/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

public class Instructor extends Person {
	Instructor() {
		type = 1;// type=1 :instructor
	}

	public void CreateCourseMenu(Course theCourse, int theLevel) {
		if (theLevel == 0)/// 0: Highlevel defined in CourseSeletDlg.
		{
			theCourseMenu = new HighLevelCourseMenu();
		} else/// 1: LowLevel
		{
			theCourseMenu = new HighLevelCourseMenu();
		}
	}

	public boolean ShowMenu() {
		super.ShowMenu();
		showAddButton();
		showViewButtons();
		showComboxes();
		showRadios();
		show();
		return ifLogout();
	}
}