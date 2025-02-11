import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

class CourseSelectDlg extends JDialog {
	private Course SelectedCourse;
	int nCourseLevel = 0;
	private boolean m_bLogout = false;
	private JComboBox<Course> CourseNameCom = new JComboBox<>();
	private JRadioButton HighLevelRadio = new JRadioButton();
	private JRadioButton LowLevelRadio = new JRadioButton();
	private JLabel jLabel1 = new JLabel();
	private JButton OKButton = new JButton();
	private ButtonGroup buttonGroup1 = new ButtonGroup();
	private JButton buttonLogout = new JButton();

	CourseSelectDlg() {
		try {
			jbInit();
			setSize(420, 238);
			setModal(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() {
		this.getContentPane().setLayout(null);
		CourseNameCom.setBounds(new Rectangle(155, 41, 203, 22));
		HighLevelRadio.setText("HighLevel");
		HighLevelRadio.setBounds(new Rectangle(50, 87, 103, 26));
		LowLevelRadio.setToolTipText("");
		LowLevelRadio.setSelected(true);
		LowLevelRadio.setText("LowLevel");
		LowLevelRadio.setBounds(new Rectangle(236, 88, 103, 26));
		jLabel1.setText("CourseName");
		jLabel1.setBounds(new Rectangle(39, 44, 85, 18));
		OKButton.setText("OK");
		OKButton.setBounds(new Rectangle(78, 139, 79, 29));
		OKButton.addActionListener(this::OKButton_actionPerformed);
		buttonLogout.setText("Logout");
		buttonLogout.setBounds(new Rectangle(224, 140, 73, 31));
		buttonLogout.addActionListener(this::buttonLogout_actionPerformed);
		this.getContentPane().add(CourseNameCom, null);
		this.getContentPane().add(jLabel1, null);
		this.getContentPane().add(HighLevelRadio, null);
		this.getContentPane().add(LowLevelRadio, null);
		this.getContentPane().add(OKButton, null);
		this.getContentPane().add(buttonLogout, null);
		buttonGroup1.add(HighLevelRadio);
		buttonGroup1.add(LowLevelRadio);
	}

	/*
	 * show the theCourseList in a combox Show the Course type selection button
	 * return the pointer pointing to the Course object return the Course Type
	 */

	Course ShowDlg(ClassCourseList courseList) {

		// 0 HighLevel presentation 1 LowLevel Experiment
		CourseIterator theIterator = new CourseIterator(courseList);
		Course theCourse;
		while ((theCourse = (Course) theIterator.next()) != null) /// end of the list
		{
			CourseNameCom.addItem(theCourse);
		}
		setVisible(true);
		return SelectedCourse;
	}

	private void OKButton_actionPerformed(ActionEvent e) {
		SelectedCourse = (Course) CourseNameCom.getSelectedItem();
		if (HighLevelRadio.isSelected())
			nCourseLevel = 0; // highlevel course: 0
		else
			nCourseLevel = 1; // lowlevel course: 1
		dispose();
	}

	boolean isLogout() {
		return m_bLogout;
	}

	private void buttonLogout_actionPerformed(ActionEvent e) {
		m_bLogout = true;
		dispose();
	}
}