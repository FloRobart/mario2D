package jeu.ihm;


import jeu.Controleur;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Panel extends JPanel
{
    /* Constante */
    private static final int HAUTEUR_PERSO = 64;
    private static final int LARGEUR_PERSO = 48;
    
    /* Attribut */
    private Controleur ctrl;

    private int posXPerso;
    private int posYPerso;

    
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

        this.posXPerso = 100;
        this.posYPerso = this.getHeight() - Panel.HAUTEUR_PERSO - 1;

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
        g.setColor(Color.BLACK);
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
        /* Dessin du corps */
        /*-----------------*/
        g.setColor(Color.GREEN);
        //x      = x - ;



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



        /*-------------------*/
        /* Dessin des jambes */
        /*-------------------*/
        g.setColor(Color.YELLOW);
        /* Jambes gauche */

        /* Jambes droite */





        g.setColor(couleurInitiale);
    }
}


/*

hauteur --> 16 pixels * 4 = 64 pixels
largeur --> 12 pixels * 4 = 48 pixels

*/