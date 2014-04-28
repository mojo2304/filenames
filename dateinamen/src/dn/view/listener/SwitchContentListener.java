package dn.view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class SwitchContentListener implements ActionListener {

	JLayeredPane _layeredPane;
	JPanel _panel;
	
	public SwitchContentListener(JLayeredPane layeredPane, JPanel panel) {
		_layeredPane = layeredPane;
		_panel = panel;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		_layeredPane.moveToFront(_panel);
	}

}
