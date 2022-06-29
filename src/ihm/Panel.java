package src.ihm;


import src.Controleur;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Panel extends JPanel
{
    /* Constante */
    private static final int HAUTEUR_PERSO = 240/*120*/;
    private static final int LARGEUR_PERSO = 80/*80*/;
    
    /* Attribut */
    private Controleur ctrl;

    private int posXPerso;
    private int posYPerso;

    
    public Panel(Controleur ctrl)
    {
        this.ctrl = ctrl;

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
        int tailleCou = 8;
        int width     = Panel.LARGEUR_PERSO;
        int height    = Panel.LARGEUR_PERSO;
        int x         = this.posXPerso;
        int y         = this.posYPerso;

        g.fillOval(x, y, width, height);

        //test
        g.drawLine(x, y, x, y*10);
        g.drawLine(x+width, y, x+width, y*10);


        /*-----------------*/
        /* Dessin du torse */
        /*-----------------*/
        g.setColor(Color.GREEN);
        int widthTorse  = width  = width / 2;
                          height = ((Panel.HAUTEUR_PERSO - height) / 2) - tailleCou / 2;
        int xTorse      = x      = x + width / 2;
        int yTorse      = y      = y + height + tailleCou;

        g.fillRect(x, y, width, height);


        /*-------------------*/
        /* Dessin des jambes */
        /*-------------------*/
        g.setColor(Color.YELLOW);
        /* Jambes gauche */
        width = width / 2 - width / 4;
        y    += height;

        g.fillRect(x, y, width, height);

        /* Jambes droite */
        x += width*3;

        g.fillRect(x, y, width, height);


        /*--------------------*/
        /* Dessin des épaules */
        /*--------------------*/
        g.setColor(Color.BLUE);
        /* Epaule gauche */
        width = widthTorse;
        x = xTorse - width / 2;
        y = yTorse;

        g.fillArc(x, y, width, width, 90, 90);

        /* Epaule droite */
        x = xTorse + widthTorse - width / 2;

        g.fillArc(x, y, width, width, 90, -90);


        /*-----------------*/
        /* Dessin des bras */
        /*-----------------*/
        g.setColor(Color.PINK);
        /* Bras gauche */
        x = xTorse - width / 2;
        y = yTorse + width / 2;
        width = widthTorse / 2 - widthTorse / 4;

        g.fillRect(x, y, width, height);

        /* Bras droit */
        x += widthTorse * 2 - width;

        g.fillRect(x, y, width, height);



        /*------------------------------*/
        /* Retour à la couleur initiale */
        /*------------------------------*/
        g.setColor(couleurInitiale);
    }
}


/*

hauteur --> 16 pixels * 6 = 96 pixels
largeur --> 12 pixels * 6 = 72 pixels

*/