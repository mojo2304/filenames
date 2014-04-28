package dn.view;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import dn.controller.Controller;
import dn.view.listener.CloseListener;
import dn.view.listener.SwitchContentListener;
import dn.view.panels.*;

public class MainGUI extends JFrame {

	JPanel[] panelArray = {
		new Modify(),
		new Index(),
		new Compare(),
		new Settings()
	};
	
	String[] panelNames = {
		"Namen modifizieren",
		"Erstelle Index",
		"Vergleichen",
		"Einstellungen"
	};
	
	Controller _controllerInstance;
	
	private static final long serialVersionUID = 1L;

	/**
	 * Create the frame.
	 */
	public MainGUI(Controller controllerInstance) {
		
		_controllerInstance = controllerInstance;
		
		// ALLGEMEINES (JFRAME)
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, MainGUIConstants.FRAMEWIDTH, MainGUIConstants.FRAMEHIGHT);
		
		// ROOT PANE
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, MainGUIConstants.FRAMEWIDTH, MainGUIConstants.FRAMEHIGHT);
		getRootPane().add(layeredPane);
		
		// LAYERED PANE
		
		getLayeredPane().setLayout(null);
		
		// erzeuge die einzelnen Panels
		for (int i=0; i<panelArray.length; i++) {
			getLayeredPane().add(panelArray[i], i);
		}

		// erzeuge Menü
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, MainGUIConstants.MENUWIDTH, MainGUIConstants.MENUHIGHT);
		
		JMenu mnProgramm = new JMenu("Programm");
		menuBar.add(mnProgramm);
		
		for (int i=0; i<panelArray.length; i++) {
			JMenuItem item = new JMenuItem(panelNames[i]);
			item.addActionListener(new SwitchContentListener(getLayeredPane(), panelArray[i]));
			mnProgramm.add(item);
		}
		
		mnProgramm.addSeparator();
		
		JMenuItem mntmSchliessen = new JMenuItem("Exit");
		mntmSchliessen.addActionListener(new CloseListener());
		mnProgramm.add(mntmSchliessen);
		
		JMenu menu = new JMenu("?");
		menuBar.add(menu);
		
		JMenuItem mntmVersion = new JMenuItem("Version");
		menu.add(mntmVersion);
		
		getLayeredPane().add(menuBar);
		
		// CONTENT PANE

		getContentPane().setLayout(null);
	}

}
