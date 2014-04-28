package dn.controller;

import java.awt.EventQueue;
import java.io.File;

import dn.model.DirectoryTree;
import dn.view.MainGUI;

public class Controller {
	
	public Controller() {
	}
	
	public static DirectoryTree getDirectoryTree(String path, int recursiveDepth) {
		File begin = new File(path);
		
		DirectoryTree tree = new DirectoryTree(begin);
		tree.buildDirectoryTree(recursiveDepth);
		tree.printDirectoryTree();
		
		return tree;
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
			}
		});
	}
}
