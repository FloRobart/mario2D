package src.ihm.panelsSelectionCouleur;

import javax.swing.JPanel;
import java.awt.Color;


public class PanelCouleur extends JPanel
{
    private Color couleur;


    public PanelCouleur() {}

    public void majCouleur(int r, int v, int b)
    {
        this.couleur = new Color(r, v, b);
        this.setBackground(this.couleur);
    }

    public Color getCouleur()
    {
        return this.couleur;
    }
}
