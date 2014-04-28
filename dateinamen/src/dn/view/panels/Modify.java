package dn.view.panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import dn.view.MainGUIConstants;

public class Modify extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtAcBmkv;
	private JTextField textField_1;
	private JTextField txtC;
	private JTextField txtAbCtxt;

	/**
	 * Create the panel.
	 */
	public Modify() {
		this.setBounds(0, MainGUIConstants.MENUHIGHT, MainGUIConstants.PANELWIDTH, MainGUIConstants.PANELHIGHT);
		setLayout(null);
		
		JLabel lblTiefe = new JLabel("Tiefe");
		lblTiefe.setBounds(10, 41, 110, 14);
		add(lblTiefe);
		
		JButton btnErstelleIndexdatei = new JButton("Benenne Dateien um");
		btnErstelleIndexdatei.setBounds(10, 166, 157, 23);
		add(btnErstelleIndexdatei);
		
		JLabel lblMuster = new JLabel("Altes Muster");
		lblMuster.setBounds(10, 72, 110, 14);
		add(lblMuster);
		
		txtAcBmkv = new JTextField();
		txtAcBmkv.setText("a (c) b.mkv");
		txtAcBmkv.setBounds(130, 69, 203, 20);
		add(txtAcBmkv);
		txtAcBmkv.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("2");
		textField_1.setBounds(130, 38, 203, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPfad = new JLabel("Pfad");
		lblPfad.setBounds(10, 11, 110, 14);
		add(lblPfad);
		
		txtC = new JTextField();
		txtC.setText("C:\\Users\\default\\Desktop\\Ordner");
		txtC.setBounds(130, 8, 203, 20);
		add(txtC);
		txtC.setColumns(10);
		
		JLabel lblNeuesMuster = new JLabel("Neues Muster");
		lblNeuesMuster.setBounds(10, 130, 110, 14);
		add(lblNeuesMuster);
		
		txtAbCtxt = new JTextField();
		txtAbCtxt.setText("a (b) c.txt");
		txtAbCtxt.setBounds(130, 127, 203, 20);
		add(txtAbCtxt);
		txtAbCtxt.setColumns(10);

	}
}
