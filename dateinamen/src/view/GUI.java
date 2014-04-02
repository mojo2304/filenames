package view;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class GUI extends JFrame {

	JPanel panel;
	JPanel panel_1;
	
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		
		// ALLGEMEINES (JFRAME)
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		// ROOT PANE
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 434, 262);
		getRootPane().add(layeredPane);
		
		// LAYERED PANE
		
		getLayeredPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 434, 241);
		getLayeredPane().add(panel, 0);
		
		JLabel lblModify = new JLabel("Modify");
		panel.add(lblModify);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 434, 241);
		getLayeredPane().add(panel_1, 1);
		
		JLabel lblVergleich = new JLabel("Vergleichen");
		panel_1.add(lblVergleich);
		
		// CONTENT PANE
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		getLayeredPane().add(menuBar);
		
		JMenu mnProgramm = new JMenu("Programm");
		menuBar.add(mnProgramm);
		
		JMenuItem mntmVergleichen = new JMenuItem("Vergleichen");
		mntmVergleichen.addActionListener(new SwitchContentListener(panel_1));
		mnProgramm.add(mntmVergleichen);
		
		JMenuItem mntmNamenModifizieren = new JMenuItem("Namen modifizieren");
		mntmNamenModifizieren.addActionListener(new SwitchContentListener(panel));
		mnProgramm.add(mntmNamenModifizieren);
		
		mnProgramm.addSeparator();
		
		JMenuItem mntmSchliessen = new JMenuItem("Exit");
		mntmSchliessen.addActionListener(new CloseListener());
		
		mnProgramm.add(mntmSchliessen);
		
		JMenu menu = new JMenu("?");
		menuBar.add(menu);
		
		JMenuItem mntmVersion = new JMenuItem("Version");
		menu.add(mntmVersion);
		
		getContentPane().setLayout(null);
	}
}
