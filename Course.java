import java.util.*;

/**
 * Title:        HACS
 * Description:  CSE870 Homework 3:  Implementing Design Patterns
 * Copyright:    Copyright (c) 2002
 * Company:      Department of Computer Science and Engineering, Michigan State University
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 * @author amudhan
 * @version 3.0
 */

public class Course {
  private String CourseName;
  ArrayList<Assignment> assignmentList= new ArrayList<>();


  public Course(String strCourse) {
    this.CourseName = strCourse;

   //0 HighLeve presentation    1  LowLevel Experiment
    // this.AssList = NULL;
  }
  
  void AddAssignment(Assignment newAss)
  {
    assignmentList.add(newAss);
  }
  
  public String toString()
  {
    return CourseName;
  }
  
  void accept(NodeVisitor visitor)
  {
    visitor.visitCourse(this);
  }

}