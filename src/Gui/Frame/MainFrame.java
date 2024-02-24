package Gui.Frame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import Gui.Panel.InvestPanel;
import Gui.Panel.DepotPanel;

public class MainFrame extends JFrame{
	
	private final InvestPanel investPanel;
    private final DepotPanel depotPanel;

    public MainFrame(InvestPanel investPanel, DepotPanel depotPanel) {
        this.investPanel = investPanel;
        this.depotPanel = depotPanel;
        initializeComponents();
    }
    
    protected void initializeComponents() {
    	// Erstellen Sie das Hauptpanel mit einem GridBagLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        setPreferredSize(new Dimension(1000, 1000));	

        // Erstellen Sie eine Zeichenkomponente für die Trennlinie
        JSeparator separator = new JSeparator(SwingConstants.VERTICAL);
        separator.setPreferredSize(new Dimension(1, Integer.MAX_VALUE)); // Breite und Höhe der Linie festlegen

        // Fügen Sie das InvestPanel im Westen und das DepotPanel im Osten hinzu
        mainPanel.add(investPanel, BorderLayout.WEST);
        mainPanel.add(depotPanel, BorderLayout.EAST);

        // Fügen Sie die Trennlinie im Zentrum des Hauptpanels hinzu
        mainPanel.add(separator, BorderLayout.CENTER);

        // Fügen Sie das Hauptpanel zum Frame hinzu
        add(mainPanel);

        // Packen und den Frame sichtbar machen
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    } 
}

