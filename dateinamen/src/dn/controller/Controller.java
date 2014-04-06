package dn.controller;

import java.awt.EventQueue;

import dn.view.GUI;

public class Controller {
	
	public Controller() {
		
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Controller c = new Controller();
				
				try {
					GUI frame = new GUI(c);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
