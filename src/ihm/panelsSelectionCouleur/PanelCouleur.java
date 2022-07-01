package src.ihm.panelsSelectionCouleur;

import javax.swing.JPanel;
import java.awt.Color;


public class PanelCouleur extends JPanel
{
    public PanelCouleur() {}

    public void majCouleur(int r, int v, int b)
    {
        this.setBackground(new Color(r, v, b));
    }
}
