package Gui;

import Gui.Frame.MainFrame;
import Gui.Panel.InvestPanel;
import Gui.Panel.DepotPanel;

public class GuiFacade {
	
    public static void createMainFrame() {
        InvestPanel investPanel = GuiFactory.createInvestPanel();
        DepotPanel depotPanel = GuiFactory.createDepotPanel();
        
        MainFrame mainFrame = new MainFrame(investPanel, depotPanel);
        mainFrame.setVisible(true);
    }
}
    