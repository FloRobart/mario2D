package src.ihm.panelsSelectionCouleur;

import javax.swing.*;
import java.awt.*;

public class PanelSelectionCouleur extends JPanel
{
    private PanelCouleur       panelCouleur;

    private PanelSelectCouleur panelRouge;
    private PanelSelectCouleur panelVert;
    private PanelSelectCouleur panelBleu;


    public PanelSelectionCouleur()
    {
        this.setSize    (400, 400);
        this.setLocation(  0,   0);

        this.setLayout(new GridLayout(4, 1));


        // Création des composant
        this.panelCouleur = new PanelCouleur();

        this.panelRouge   = new PanelSelectCouleur(this, 'R');
        this.panelVert    = new PanelSelectCouleur(this, 'V');
        this.panelBleu    = new PanelSelectCouleur(this, 'B');


        // Positionnement des composants
        this.add(this.panelCouleur);

        this.add(this.panelRouge);
        this.add(this.panelVert);
        this.add(this.panelBleu);

        this.majCouleur();
        this.setVisible(true);
    }


    public void majCouleur()
    {
        int r, v, b;

        r = this.panelRouge.getValeur();
        v = this.panelVert .getValeur();
        b = this.panelBleu .getValeur();

        this.panelCouleur.majCouleur(r, v, b);
    }
}
