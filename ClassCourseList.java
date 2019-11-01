import java.util.ArrayList;
import java.io.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0 update to Java 8
 * @author amudhan
 * @version 3.0
 */

class ClassCourseList extends ArrayList<Course> {

	ClassCourseList() {
	}

	//// initialize the list by reading from the file.
	void InitializeFromFile() {
		try {
			BufferedReader file;
			String strCourseName;
			file = new BufferedReader(new FileReader("CourseInfo.txt"));
			while ((strCourseName = file.readLine()) != null) {
				Course theCourse;
				theCourse = new Course(strCourseName);
//      theCourse.CourseName= strCourseName;
				add(theCourse);
			}
		} catch (Exception ignored) {
        }
	}

}