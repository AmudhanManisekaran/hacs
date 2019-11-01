import java.util.*;

/**
 * Title: HACS Description: CSE870 Homework 3: Implementing Design Patterns
 * Copyright: Copyright (c) 2002 Company: Department of Computer Science and
 * Engineering, Michigan State University
 * 
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 * @author amudhan
 * @version 3.0
 *
 * update to Java 8
 */

public class Solution {
	String theAuthor = "";
	String SolutionFileName = "";
	Date theSubmitData = new Date();
	int theGrade;
	private boolean reported = false;

	Solution() {
	}

	@Override
	public String toString() {
		String string;
		string = theAuthor + "  " + SolutionFileName + " Grade=" + getGradeInt() + "  ";
		if (isReported())
			string += "reported";
		else
			string += "not reported";

		return (string);
	}

	String getGradeString() {
		if (isReported())
			return "" + theGrade;
		else
			return "-1";
	}

	int getGradeInt() {
		return theGrade;
	}

	void setReported() {
		this.reported = true;
	}

	private boolean isReported() {
		return reported;
	}
}