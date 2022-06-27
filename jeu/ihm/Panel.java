package jeu.ihm;


import jeu.Controleur;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Panel extends JPanel
{
    private Controleur ctrl;
    
    public Panel(Controleur ctrl)
    {
        this.ctrl = ctrl;

        /*-------------------------*/
        /* Création des composants */
        /*-------------------------*/



        /*----------------------*/
        /* Ajout des composants */
        /*----------------------*/



        /*---------------------------*/
        /* Activation des composants */
        /*---------------------------*/

    }



    public void paint(Graphics g)
    {
        super.paint(g);
        Color couleurInitiale = g.getColor();





        g.setColor(couleurInitiale);
    }



    /* Dessins du personnage */
    private void dessinerPersonnage(Graphics g)
    {
        //g.drawOval(100, 100, 100, 100);
    }
}