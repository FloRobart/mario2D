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
        int x         = this.posXPerso;
        int y         = this.posYPerso;
        int largeur   = Panel.LARGEUR_PERSO;
        int hauteur   = Panel.HAUTEUR_PERSO / 4;

        g.fillOval(x, y, largeur, hauteur);

        //test
        //g.drawLine(x, y, x, y*10);
        //g.drawLine(x+largeur, y, x+largeur, y*10);


        /*-----------------*/
        /* Dessin du torse */
        /*-----------------*/
        g.setColor(Color.GREEN);
        int xTorse       = x       = this.posXPerso + Panel.LARGEUR_PERSO / 4;
        int yTorse       = y       = this.posYPerso + hauteur + tailleCou;
        int largeurTorse = largeur = Panel.LARGEUR_PERSO / 2;
        int hauteurTorse = hauteur = Panel.HAUTEUR_PERSO - tailleCou / 2;

        g.fillRect(x, y, largeur, hauteur);


        /*-------------------*/
        /* Dessin des jambes */
        /*-------------------*/
        g.setColor(Color.YELLOW);
        /* Jambes gauche */
        largeur = largeur / 2 - largeur / 4;
        y    += hauteur;

        g.fillRect(x, y, largeur, hauteur);

        /* Jambes droite */
        x += largeur*3;

        g.fillRect(x, y, largeur, hauteur);


        /*--------------------*/
        /* Dessin des épaules */
        /*--------------------*/
        g.setColor(Color.BLUE);
        /* Epaule gauche */
        largeur = largeurTorse;
        x = xTorse - largeur / 2;
        y = yTorse;

        g.fillArc(x, y, largeur, largeur, 90, 90);

        /* Epaule droite */
        x = xTorse + largeurTorse - largeur / 2;

        g.fillArc(x, y, largeur, largeur, 90, -90);


        /*-----------------*/
        /* Dessin des bras */
        /*-----------------*/
        g.setColor(Color.PINK);
        /* Bras gauche */
        x = xTorse - largeur / 2;
        y = yTorse + largeur / 2;
        largeur = largeurTorse / 2 - largeurTorse / 4;

        g.fillRect(x, y, largeur, hauteur);

        /* Bras droit */
        x += largeurTorse * 2 - largeur;

        g.fillRect(x, y, largeur, hauteur);



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