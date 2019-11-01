import java.util.*;
import java.text.DateFormat;

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

public class Assignment {

  String AssName;
  Date DueDate=new Date();
  SolutionList theSolutionList=new SolutionList();
  Solution SuggestSolution=new Solution();



  public Assignment() {
  }

  ////add the theSolution to the Solutionlist
  void AddSolution(Solution theSolution)
  {
    theSolutionList.add(theSolution);
  }

  SolutionIterator GetSolutionIterator()
  {
    return new SolutionIterator(theSolutionList);
  }

  public String toString()
  {
    return AssName;
  }

  String getDueDateString()
  {
    DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.SHORT);
    return  dateFormat.format(DueDate);
  }

  void accept(NodeVisitor visitor)
  {
    visitor.visitAssignment(this);
  }
}