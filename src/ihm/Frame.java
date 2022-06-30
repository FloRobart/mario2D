package src.ihm;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import src.Controleur;


public class Frame extends JFrame implements ActionListener
{
    private Controleur ctrl;

    private PanelJeu panel;


    public Frame(Controleur ctrl)
    {
        this.ctrl = ctrl;
        
        this.setTitle("Jeu");
        this.setSize(500, 500);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); // pleine écran
        this.setLocation(0, 0);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        /*------------------------*/
        /* Création des composant */
        /*------------------------*/
        this.panel = new PanelJeu(this.ctrl);


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



    @Override
    public void actionPerformed(ActionEvent e)
    {
        
    }
}