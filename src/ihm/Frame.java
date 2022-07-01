package src.ihm;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import src.Controleur;
import java.awt.Color;
import java.awt.BorderLayout;
import src.ihm.panelsSelectionCouleur.PanelSelectionCouleur;


public class Frame extends JFrame implements ActionListener
{
    private Controleur ctrl;

    private PanelSelectionCouleur panelSelectionCouleur;
    private PanelJeu panelJeu;

    private JButton btnValider;


    public Frame(Controleur ctrl)
    {
        this.ctrl = ctrl;
        
        this.setTitle("Jeu");
        this.setSize(500, 500);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); // pleine écran
        this.setLocation(0, 0);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new BorderLayout());

        /*------------------------*/
        /* Création des composant */
        /*------------------------*/
        this.panelSelectionCouleur = new PanelSelectionCouleur(this.ctrl);
        this.btnValider = new JButton("Valider");


        /*---------------------*/
        /* Ajout des composant */
        /*---------------------*/
        this.add(this.panelSelectionCouleur, BorderLayout.CENTER);
        this.add(this.btnValider, BorderLayout.SOUTH);



        /*--------------------------*/
        /* Activation des composant */
        /*--------------------------*/
        this.btnValider.addActionListener(this);



        this.setVisible(true);
    }



    /* Met à jour le panel */
    public void majIhm()
    {
        this.panelSelectionCouleur.repaint();
    }

    public Color getCouleur()
    {
        return this.panelSelectionCouleur.getCouleur();
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == this.btnValider)
        {
            this.removeAll();
            this.panelJeu = new PanelJeu(this.ctrl);
            this.add(this.panelJeu, BorderLayout.CENTER);
        }
    }
}