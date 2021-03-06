package src;

import src.ihm.Frame;
import src.metier.Metier;

import java.awt.Color;


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
    public void  majIhm        () {        this.frame.majIhm    (); }
    public int   getWidthFrame () { return this.frame.getWidth  (); }
    public int   getHeightFrame() { return this.frame.getHeight (); }
    public Color getCouleur    () { return this.frame.getCouleur(); }



    public static void main(String[] args)
    {
        new Controleur();
    }
}
