package dn.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import dn.controller.Controller;

public class GUI extends JFrame {

	JPanel panelModify;
	JPanel panelCompare;
	JPanel panelSettings;
	
	Controller _controllerInstance;
	
	private static final long serialVersionUID = 1L;

	/**
	 * Create the frame.
	 */
	public GUI(Controller controllerInstance) {
		
		_controllerInstance = controllerInstance;
		
		// ALLGEMEINES (JFRAME)
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		// ROOT PANE
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 434, 262);
		getRootPane().add(layeredPane);
		
		// LAYERED PANE
		
		getLayeredPane().setLayout(null);
		
		panelModify = new JPanel();
		panelModify.setBounds(0, 21, 434, 241);
		getLayeredPane().add(panelModify, 1);
		JLabel lblModify = new JLabel("Modify");
		panelModify.add(lblModify);
		
		panelCompare = new JPanel();
		panelCompare.setBounds(0, 21, 434, 241);
		getLayeredPane().add(panelCompare, 2);
		JLabel lblVergleich = new JLabel("Vergleichen");
		panelCompare.add(lblVergleich);
		
		panelSettings = new JPanel();
		panelSettings.setBounds(0, 21, 434, 241);
		getLayeredPane().add(panelSettings, 3);
		JLabel lblSettings = new JLabel("Settings");
		panelSettings.add(lblSettings);

		getLayeredPane().add(createMenuBar(434, 21));
		
		// CONTENT PANE

		getContentPane().setLayout(null);
	}
	
	private JMenuBar createMenuBar(int width, int height) {
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, width, height);
		
		JMenu mnProgramm = new JMenu("Programm");
		menuBar.add(mnProgramm);
		
		JMenuItem mntmVergleichen = new JMenuItem("Vergleichen");
		mntmVergleichen.addActionListener(new SwitchContentListener(getLayeredPane(), panelCompare));
		mnProgramm.add(mntmVergleichen);
		
		JMenuItem mntmNamenModifizieren = new JMenuItem("Namen modifizieren");
		mntmNamenModifizieren.addActionListener(new SwitchContentListener(getLayeredPane(), panelModify));
		mnProgramm.add(mntmNamenModifizieren);
		
		mnProgramm.addSeparator();
		
		JMenuItem mntmSettings = new JMenuItem("Einstellungen");
		mntmSettings.addActionListener(new SwitchContentListener(getLayeredPane(), panelSettings));
		mnProgramm.add(mntmSettings);
		
		mnProgramm.addSeparator();
		
		JMenuItem mntmSchliessen = new JMenuItem("Exit");
		mntmSchliessen.addActionListener(new CloseListener());
		mnProgramm.add(mntmSchliessen);
		
		JMenu menu = new JMenu("?");
		menuBar.add(menu);
		
		JMenuItem mntmVersion = new JMenuItem("Version");
		menu.add(mntmVersion);
		
		return menuBar;
	}
}
