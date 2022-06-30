package src.ihm;


import java.awt.Dimension;

import javax.swing.JFrame;
import src.Controleur;


public class Frame extends JFrame
{
    private Controleur ctrl;

    private Panel panel;


    public Frame(Controleur ctrl)
    {
        this.ctrl = ctrl;

        Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        
        this.setTitle("Jeu");
        this.setSize(500, 500);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); // pleine écran
        this.setLocation(0, 0);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        /*------------------------*/
        /* Création des composant */
        /*------------------------*/
        this.panel = new Panel(this.ctrl);


        /*---------------------*/
        /* Ajout des composant */
        /*---------------------*/
        this.add(this.panel);



        this.setVisible(true);
    }



    /* Met à jour le panel */
    public void majIhm()
    {
        this.panel.repaint();
    }
}