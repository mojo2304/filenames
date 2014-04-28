package dn.view.panels;

import javax.swing.JPanel;

import dn.view.MainGUIConstants;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import dn.view.comboboxes.Languages;

public class Settings extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Settings() {
		this.setBounds(0, MainGUIConstants.MENUHIGHT, MainGUIConstants.PANELWIDTH, MainGUIConstants.PANELHIGHT);
		setLayout(null);
		
		JLabel lblSprache = new JLabel("Sprache");
		lblSprache.setBounds(10, 11, 110, 14);
		add(lblSprache);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Languages.values()));
		comboBox.setBounds(130, 8, 80, 20);
		add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Zeige Dialog");
		lblNewLabel.setBounds(10, 42, 110, 14);
		add(lblNewLabel);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setSelected(true);
		checkBox.setBounds(125, 37, 21, 23);
		add(checkBox);
	}
}
