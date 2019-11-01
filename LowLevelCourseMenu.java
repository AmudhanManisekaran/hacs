import java.awt.*;

class LowLevelCourseMenu extends CourseMenu {

	LowLevelCourseMenu() {
	}

    void ShowAddButtons() {
		AssignmentAddButton.addActionListener(e -> AssignmentAddButton_actionPerformed());
		AssignmentAddButton.setText("Add");
		AssignmentAddButton.setBounds(new Rectangle(389, 54, 79, 29));
		OptionAddButton.setText("Add");
		OptionAddButton.setBounds(new Rectangle(390, 125, 79, 29));
		this.getContentPane().add(AssignmentAddButton, null);
		this.getContentPane().add(OptionAddButton, null);
	}

	void ShowRadios() {
		AssignmentRadiao.setText("Assignment");
		AssignmentRadiao.setBounds(new Rectangle(21, 55, 103, 26));
		this.getContentPane().add(AssignmentRadiao, null);
		OptionRadio.setText("LowLevelExperiment");
		OptionRadio.setBounds(new Rectangle(21, 128, 103, 26));
		this.getContentPane().add(OptionRadio, null);
	}

	void ShowComboxes() {
		AssignmentCombox.setBounds(new Rectangle(140, 57, 126, 22));
		OptionCombo.setBounds(new Rectangle(137, 127, 126, 22));
		this.getContentPane().add(AssignmentCombox, null);
		this.getContentPane().add(OptionCombo, null);
		refresh();
	}

	void ShowViewButtons() {
		AssignmentViewButton.setText("View");
		AssignmentViewButton.setBounds(new Rectangle(290, 54, 79, 29));
		AssignmentViewButton.addActionListener(e -> AssignmentViewButton_actionPerformed());
		OptionViewButton.setText("View");
		OptionViewButton.setBounds(new Rectangle(290, 124, 79, 29));
		this.getContentPane().add(AssignmentViewButton, null);
		this.getContentPane().add(OptionViewButton, null);
	}

}