import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

class SolutionGradingDlg extends JDialog {
	private Solution theSolution;
	private JLabel jLabel1 = new JLabel();
	private JTextField tfGrad = new JTextField();
	private JButton buttonOK = new JButton();
	private JLabel labelSolutionFileName = new JLabel();

	SolutionGradingDlg() {
		try {
			jbInit();
			setSize(316, 186);
			setModal(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() {
		jLabel1.setText("Solution File Name");
		jLabel1.setBounds(new Rectangle(23, 30, 121, 18));
		this.getContentPane().setLayout(null);
		tfGrad.setBounds(new Rectangle(25, 66, 100, 22));
		buttonOK.setText("OK");
		buttonOK.setBounds(new Rectangle(217, 67, 79, 29));
		buttonOK.addActionListener(this::buttonOK_actionPerformed);
		labelSolutionFileName.setBounds(new Rectangle(212, 34, 163, 18));
		this.getContentPane().add(jLabel1, null);
		this.getContentPane().add(tfGrad, null);
		this.getContentPane().add(labelSolutionFileName, null);
		this.getContentPane().add(buttonOK, null);
	}

	void show(Solution solution) {
		theSolution = solution;
		tfGrad.setText("" + theSolution.getGradeInt());
		labelSolutionFileName.setText(theSolution.SolutionFileName);
		setVisible(true);
	}

	private void buttonOK_actionPerformed(ActionEvent e) {
		theSolution.theGrade = Integer.parseInt(tfGrad.getText());
		dispose();
	}

}