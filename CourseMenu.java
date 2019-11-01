import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

abstract class CourseMenu extends JDialog
{
  Course theCourse;
  private boolean bLogout=true;

  JRadioButton AssignmentRadiao = new JRadioButton();
  JComboBox<Assignment> AssignmentCombox = new JComboBox<>();
  JButton AssignmentViewButton = new JButton();
  JButton AssignmentAddButton = new JButton();
  JRadioButton OptionRadio = new JRadioButton();
  JComboBox OptionCombo = new JComboBox();
  JButton OptionViewButton = new JButton();
  JButton OptionAddButton = new JButton();
  private JButton buttonChangeCourse = new JButton();
  private JButton buttonLogout = new JButton();

  CourseMenu()
  {

    try
    {
      jbInit();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    setModal(true);
    setSize(503,294);
  }

  private void jbInit() {
    buttonChangeCourse.setText("ChangeCourse");
    buttonChangeCourse.setBounds(new Rectangle(101, 211, 73, 37));
    buttonChangeCourse.addActionListener(this::buttonChangeCourse_actionPerformed);
    this.getContentPane().setLayout(null);
    this.setTitle("");
    buttonLogout.setText("Logout");
    buttonLogout.setBounds(new Rectangle(267, 215, 73, 37));
    buttonLogout.addActionListener(this::buttonLogout_actionPerformed);
    this.getContentPane().add(buttonChangeCourse, null);
    this.getContentPane().add(buttonLogout, null);
  }

  /* when the add button is pressed, call add assignment
  function of facade, after that refresh window
  */

  /* when the add button is pressed, call ViewAssignment
  function of facade, after that refresh window
  */

  abstract void ShowAddButtons();
  abstract void ShowViewButtons();
  abstract void ShowRadios();
  abstract void ShowComboxes();

  void AssignmentAddButton_actionPerformed()
  {
    Hacs.theFacade.AddAssignment(theCourse);
    refresh();
  }
  void AssignmentViewButton_actionPerformed()
  {
    Assignment theAss=(Assignment)AssignmentCombox.getSelectedItem() ;
    Hacs.theFacade.ViewAssignment(theAss);
  }
  void refresh()
  {
    AssignmentCombox.removeAllItems() ;
    for (Assignment assignment : theCourse.assignmentList) {
      AssignmentCombox.addItem(assignment);
    }
  }

  private void buttonChangeCourse_actionPerformed(ActionEvent e)
  {
    bLogout=false;
    dispose();
  }

  private void buttonLogout_actionPerformed(ActionEvent e)
  {
    bLogout=true;
    dispose();
  }
  boolean ifLogout()
  {
    return bLogout;
  }
}