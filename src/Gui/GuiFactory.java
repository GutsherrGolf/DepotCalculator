package Gui;

import Gui.Panel.InvestPanel;
import Gui.Panel.DepotPanel;

public class GuiFactory {
	
	public static InvestPanel createInvestPanel() {
		return new InvestPanel();
	}
	
	public static DepotPanel createDepotPanel() {
		return new DepotPanel();
	}
}
