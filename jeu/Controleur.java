package jeu;

import jeu.ihm.Frame;
import jeu.ihm.Panel;


public class Controleur
{
    private Frame frame;
    private Panel panel;

    public Controleur()
    {
        frame = new Frame(this);
        panel = new Panel(this);
    }



    public static void main(String[] args)
    {
        new Controleur();
    }
}
