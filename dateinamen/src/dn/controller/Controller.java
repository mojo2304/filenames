package dn.controller;

import java.awt.EventQueue;
import java.io.File;

import dn.view.MainGUI;

public class Controller {
	
	public Controller() {
	}
	
	public int getFiles(String path) {
		File file = new File(path);
		
		for (File f : file.listFiles(new MyFilenameFilter()))
			  System.out.println(f);
		
		return 0;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Controller c = new Controller();
				
				try {
					MainGUI frame = new MainGUI(c);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					System.out.print("GUI konnte nicht gestartet werden.");
				}
				
				c.getFiles(System.getProperty("user.dir"));
			}
		});
	}
}
