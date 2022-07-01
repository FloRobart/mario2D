package src.ihm.panelsSelectionCouleur;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PanelSelectCouleur extends JPanel implements AdjustmentListener, ActionListener
{
    private JScrollBar sbCouleur;

    private TextField txtDec;
    private TextField txtHex;

    private PanelSelectionCouleur panelPrincipal;


    public PanelSelectCouleur(PanelSelectionCouleur frame, char couleur)
    {
        JPanel panelHaut, panelBas;

        this.panelPrincipal = frame;

        this.setLayout(new GridLayout(2, 1));

        // Création des composants
        panelHaut = new JPanel(new BorderLayout());
        panelBas  = new JPanel();

        this.sbCouleur = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 265);
        this.sbCouleur.setBlockIncrement(32);
        this.sbCouleur.setUnitIncrement(16);

        this.txtDec = new TextField("000");
        this.txtHex = new TextField( "00");


        switch(couleur)
        {
            case 'R' -> { panelHaut.setBackground(new Color(240, 110, 132)); panelBas.setBackground(new Color(240, 110, 132)); }
            case 'V' -> { panelHaut.setBackground(new Color(130, 213, 130)); panelBas.setBackground(new Color(130, 213, 130)); }
            case 'B' -> { panelHaut.setBackground(new Color(128, 202, 235)); panelBas.setBackground(new Color(128, 202, 235)); }
        }


        // positionnement des composants
        this.add(panelHaut);
        this.add(panelBas);

        panelHaut.add(new Label("00"), BorderLayout.WEST  );
        panelHaut.add(this.sbCouleur , BorderLayout.CENTER);
        panelHaut.add(new Label("FF"), BorderLayout.EAST  );

        panelBas.add(new Label("dec : "));
        panelBas.add(this.txtDec        );
        panelBas.add(new Label("Hex : "));
        panelBas.add(this.txtHex        );


        // activation des composants
        this.sbCouleur.addAdjustmentListener(this);

        this.txtDec.addActionListener(this);
        this.txtHex.addActionListener(this);
    }


    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        this.majTout(this.sbCouleur.getValue()); 
    }


    public void actionPerformed(ActionEvent e)
    {
        int val;

        if (e.getSource() == this.txtDec)
            val = Integer.parseInt(this.txtDec.getText()    );
        else
            val = Integer.parseInt(this.txtDec.getText(), 16);

        this.majTout(val);
    }


    public int getValeur()
    {
        return this.sbCouleur.getValue();
    }


    private void majTout(int val)
    {
        this.sbCouleur.setValue(val);
        val = this.sbCouleur.getValue();

        this.txtDec.setText(String.format("%03d", val));
        this.txtHex.setText(String.format("%02X", val));

        this.panelPrincipal.majCouleur();
    }
}
