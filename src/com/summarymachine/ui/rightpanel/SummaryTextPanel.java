package com.summarymachine.ui.rightpanel;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class SummaryTextPanel extends JPanel {
	public SummaryTextPanel() {
		this.setLayout(new BorderLayout());
		TitledBorder border = new TitledBorder("Text");
		this.setBorder(border);

		JTextArea summaryTextField = new JTextArea(5, 10);
		summaryTextField.setEditable(false);
		this.add(summaryTextField);

	}
}
