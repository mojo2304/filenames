package dn.view.panels;

import javax.swing.JPanel;

import dn.view.MainGUIConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import dn.view.comboboxes.CompareBox;

public class Compare extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Compare() {
		this.setBounds(0, MainGUIConstants.MENUHIGHT, MainGUIConstants.PANELWIDTH, MainGUIConstants.PANELHIGHT);
		setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(CompareBox.values()));
		comboBox.setBounds(10, 11, 147, 20);
		add(comboBox);
	}

}
