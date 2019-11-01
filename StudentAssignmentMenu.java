import javax.swing.*;
import java.awt.*;
import java.util.Date;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

public class StudentAssignmentMenu extends AssignmentMenu {

////  class AssignmentMenu
	private boolean boolSubmit = false;

    private JLabel lAssignmentName = new JLabel();
	private JLabel lDueDate = new JLabel();
	private JTextField tbSolution = new JTextField();
	private JLabel lSuggestedSolution = new JLabel();
	private JLabel lGrade = new JLabel();
	private JButton bSubmit = new JButton();
	private JButton bCancel = new JButton();

	private JLabel jLabel1 = new JLabel();
	private JLabel jLabel3 = new JLabel();
	private JLabel jLabel5 = new JLabel();
	private JLabel jLabel6 = new JLabel();
	private JLabel jLabel7 = new JLabel();

	StudentAssignmentMenu() {
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() {
		jLabel1.setText("Assignment : ");
		jLabel1.setBounds(new Rectangle(20, 36, 91, 18));
		this.getContentPane().setLayout(null);
		lAssignmentName.setText("jLabel2");
		lAssignmentName.setBounds(new Rectangle(258, 35, 282, 18));
		jLabel3.setText("Due Date");
		jLabel3.setBounds(new Rectangle(21, 81, 92, 18));
		lDueDate.setText("jLabel4");
		lDueDate.setBounds(new Rectangle(254, 82, 294, 18));
		jLabel5.setText("Solution");
		jLabel5.setBounds(new Rectangle(24, 128, 93, 18));
		tbSolution.setText("jTextField1");
		tbSolution.setBounds(new Rectangle(251, 127, 211, 22));
		jLabel6.setText("Suggested Solution");
		jLabel6.setBounds(new Rectangle(24, 174, 117, 18));
		jLabel7.setText("Grade");
		jLabel7.setBounds(new Rectangle(23, 224, 41, 18));
		lSuggestedSolution.setText("jLabel8");
		lSuggestedSolution.setBounds(new Rectangle(259, 169, 201, 18));
		lGrade.setText("jLabel9");
		lGrade.setBounds(new Rectangle(258, 226, 41, 18));
		bSubmit.setText("Submit");
		bSubmit.setBounds(new Rectangle(476, 124, 79, 29));
		bSubmit.addActionListener(e -> bSubmit_actionPerformed());
		bCancel.setText("Cancel");
		bCancel.setBounds(new Rectangle(475, 164, 79, 29));
		bCancel.addActionListener(e -> bCancel_actionPerformed());
		this.getContentPane().add(jLabel1, null);
		this.getContentPane().add(jLabel3, null);
		this.getContentPane().add(jLabel5, null);
		this.getContentPane().add(jLabel6, null);
		this.getContentPane().add(lAssignmentName, null);
		this.getContentPane().add(lDueDate, null);
		this.getContentPane().add(tbSolution, null);
		this.getContentPane().add(jLabel7, null);
		this.getContentPane().add(lSuggestedSolution, null);
		this.getContentPane().add(lGrade, null);
		this.getContentPane().add(bSubmit, null);
		this.getContentPane().add(bCancel, null);
	}

	/*
	 * check if the student has already had a solution or not. if not , create a new
	 * solution for the student. after showing the solution attatch the soluiton;
	 */
	public void ShowMenu(Assignment assignment, Person thePerson) {
        SolutionIterator theIter = assignment.GetSolutionIterator();
        Solution theSolution = (Solution) theIter.next(thePerson.UserName);
		if (theSolution == null) {
			tbSolution.setText("");
			lGrade.setText("-1");
		} else {
			tbSolution.setText(theSolution.SolutionFileName);
			lGrade.setText(theSolution.getGradeString());

		}

		lAssignmentName.setText(assignment.AssName);
		lDueDate.setText(assignment.DueDate.toString());
		lSuggestedSolution.setText(assignment.SuggestSolution.SolutionFileName);

		setVisible(true);

		if (boolSubmit) {
			if (theSolution == null) {
				theSolution = new Solution();
				assignment.AddSolution(theSolution);
			}
			theSolution.theAuthor = thePerson.UserName;
			theSolution.SolutionFileName = tbSolution.getText();
			theSolution.theSubmitData = new Date();
		}
	}

	private void bSubmit_actionPerformed() {
		boolSubmit = true;
		dispose();
	}

	private void bCancel_actionPerformed() {
		boolSubmit = false;
		dispose();
	}

}