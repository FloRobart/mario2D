package jeu.ihm;


import jeu.Controleur;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import 

public class Panel extends JPanel
{
    /* Constante */
    private static final int HAUTEUR_PERSO = 120;
    private static final int LARGEUR_PERSO = 80;
    
    /* Attribut */
    private Controleur ctrl;

    private int posXPerso;
    private int posYPerso;

    
    public Panel(Controleur ctrl)
    {
        this.ctrl = ctrl;

        final OsThemeDetector detector = OsThemeDetector.getDetector();
        final boolean isDarkThemeUsed = detector.isDark();
        if (isDarkThemeUsed) {
            //The OS uses a dark theme
        } else {
            //The OS uses a light theme
        }

        this.setBackground(Color.BLACK);

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

        this.posXPerso = 400;
        this.posYPerso = 400;

        this.dessinerPersonnage(g);



        g.setColor(couleurInitiale);
    }



    /* Dessins du personnage */
    private void dessinerPersonnage(Graphics g)
    {
        Color couleurInitiale = g.getColor();

        //g.setColor(this.getBackground());

        /*------*/
        /* Test */
        /*------*/
        //g.setColor(Color.RED);
        //g.fillRect(this.posXPerso, this.posYPerso, 10, 10);


        /*-----------------*/
        /* Hitbox du perso */
        /*-----------------*/
        g.setColor(Color.WHITE);
        g.drawRect(this.posXPerso, this.posYPerso, Panel.LARGEUR_PERSO, Panel.HAUTEUR_PERSO);


        /*-------------------*/
        /* Dessin de la tête */
        /*-------------------*/
        g.setColor(Color.RED);
        int width  = Panel.LARGEUR_PERSO / 2;
        int height = Panel.LARGEUR_PERSO / 2;
        int x      = this.posXPerso + width / 2;
        int y      = this.posYPerso;

        g.fillOval(x, y, width, height);


        /*-----------------*/
        /* Dessin du torse */
        /*-----------------*/
        g.setColor(Color.GREEN);
        y      = y + height + 10;
        height = (Panel.HAUTEUR_PERSO / 2) - height;

        g.fillRect(x, y, width, height);


        /*-------------------*/
        /* Dessin des jambes */
        /*-------------------*/
        g.setColor(Color.YELLOW);
        /* Jambes gauche */
        width = (width / 2) - width / 4;
        y     = y + height;

        g.fillRect(x, y, width, height);

        /* Jambes droite */
        x     = x + width*3;

        g.fillRect(x, y, width, height);



        /*--------------------*/
        /* Dessin des épaules */
        /*--------------------*/
        g.setColor(Color.BLUE);
        /* Epaule gauche */


        /* Epaule droite */



        /*-----------------*/
        /* Dessin des bras */
        /*-----------------*/
        g.setColor(Color.PINK);
        /* Bras gauche */


        /* Bras droit */





        g.setColor(couleurInitiale);
    }
}


/*

hauteur --> 16 pixels * 6 = 96 pixels
largeur --> 12 pixels * 6 = 72 pixels

*/