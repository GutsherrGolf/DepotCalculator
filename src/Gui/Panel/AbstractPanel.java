package Gui.Panel;

import java.awt.Dimension;
import javax.swing.JPanel;

public abstract class AbstractPanel extends JPanel{
	
	protected void setPanelSize(JPanel panel) {
		panel.setPreferredSize(new Dimension(500, 500));
	}
}
