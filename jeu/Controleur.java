package jeu;

import jeu.ihm.Frame;
import jeu.metier.Metier;


public class Controleur
{
    private Frame  frame;
    private Metier metier;

    public Controleur()
    {
        this.frame  = new Frame(this);
        this.metier = new Metier(this);
    }


    // methode du metier
    public void Avancer() { this.metier.Avancer(); }
    public void Reculer() { this.metier.Reculer(); }
    public void sauter () { this.metier.sauter (); }
    public void dash   () { this.metier.dash   (); }

    // methode de l'ihm
    public void majIhm () { this.frame.majIhm  (); }


    public static void main(String[] args)
    {
        new Controleur();
    }
}
