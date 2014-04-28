package dn.view.panels;

import javax.swing.JPanel;

import dn.controller.Controller;
import dn.view.MainGUIConstants;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Index extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtCusersjohannesdesktoptest;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Index() {
		this.setBounds(0, MainGUIConstants.MENUHIGHT, MainGUIConstants.PANELWIDTH, MainGUIConstants.PANELHIGHT);
		setLayout(null);
		
		JLabel lblPfad = new JLabel("Pfad");
		lblPfad.setBounds(10, 11, 110, 14);
		add(lblPfad);
		
		txtCusersjohannesdesktoptest = new JTextField();
		txtCusersjohannesdesktoptest.setText("C:\\Users\\Johannes\\Desktop\\test");
		txtCusersjohannesdesktoptest.setBounds(130, 8, 203, 20);
		add(txtCusersjohannesdesktoptest);
		txtCusersjohannesdesktoptest.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Tiefe");
		lblNewLabel.setBounds(10, 43, 46, 14);
		add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setText("1");
		textField_1.setBounds(130, 40, 203, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Pattern");
		lblNewLabel_1.setBounds(10, 78, 110, 14);
		add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(130, 75, 203, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Erstelle Index");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String startingDirectory = txtCusersjohannesdesktoptest.getText();
				int depth = Integer.parseInt(textField_1.getText());
				Controller.getDirectoryTree(startingDirectory, depth);
			}
		});
		btnNewButton.setBounds(10, 118, 143, 23);
		add(btnNewButton);
	}

}
