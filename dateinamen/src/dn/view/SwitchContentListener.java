package dn.view;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SwitchContentListener implements ActionListener {

	JPanel _panel;
	
	public SwitchContentListener(JPanel panel) {
		_panel = panel;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(_panel);
		Component[] com =  frame.getComponents();
		JPanel[] panels = (JPanel[]) com;
		
		for (JPanel p : panels) {
			p.setEnabled(false);
		}
		
		_panel.setVisible(true);
	}

}
