package jeu.ihm;


import javax.swing.JFrame;

import jeu.Controleur;


public class Frame extends JFrame
{
    private Controleur ctrl;

    private Panel panel;


    public Frame(Controleur ctrl)
    {
        this.ctrl = ctrl;
        
        this.setTitle("Jeu");
        this.setSize(800, 600);
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