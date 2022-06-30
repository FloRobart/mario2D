package src.ihm;


import src.Controleur;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class PanelJeu extends JPanel
{
    /* Constante */
    private static final int HAUTEUR_PERSO = 200/*120*/;
    private static final int LARGEUR_PERSO = 200/*80*/;
    
    /* Attribut */
    private Controleur ctrl;

    private int posXPerso;
    private int posYPerso;

    
    public PanelJeu(Controleur ctrl)
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

        this.posXPerso = 100;
        this.posYPerso = 100;

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
        g.drawRect(this.posXPerso, this.posYPerso, PanelJeu.LARGEUR_PERSO, PanelJeu.HAUTEUR_PERSO);


        /*-------------------*/
        /* Dessin de la tête */
        /*-------------------*/
        g.setColor(Color.RED);
        int tailleCou = 8;
        int x         = this.posXPerso;
        int y         = this.posYPerso;
        int largeur   = PanelJeu.LARGEUR_PERSO;
        int hauteur   = PanelJeu.HAUTEUR_PERSO / 4;

        g.fillOval(x, y, largeur, hauteur);


        /*-----------------*/
        /* Dessin du torse */
        /*-----------------*/
        g.setColor(Color.GREEN);
        int xTorse       = x       = this.posXPerso + PanelJeu.LARGEUR_PERSO / 4;
        int yTorse       = y       = this.posYPerso + hauteur + tailleCou;
        int largeurTorse = largeur = PanelJeu.LARGEUR_PERSO / 2;
        int hauteurTorse = hauteur = PanelJeu.HAUTEUR_PERSO / 2 - hauteur / 2 - tailleCou / 2;

        g.fillRect(x, y, largeur, hauteur);


        /*-------------------*/
        /* Dessin des jambes */
        /*-------------------*/
        g.setColor(Color.YELLOW);
        largeur = largeurTorse / 3;
        /* Jambes gauche */
        y       = yTorse + hauteurTorse;

        g.fillRect(x, y, largeur, hauteur);

        /* Jambes droite */
        g.setColor(Color.CYAN);
        x       = xTorse + largeurTorse - largeur;

        g.fillRect(x, y, largeur, hauteur);


        /*--------------------*/
        /* Dessin des épaules */
        /*--------------------*/
        g.setColor(Color.BLUE);
        y       = yTorse;
        /* Epaule gauche */
        x       = xTorse - largeurTorse / 2;

        g.fillArc(x, y, largeurTorse, largeurTorse, 90, 90);

        /* Epaule droite */
        x       = xTorse + largeurTorse / 2;

        g.fillArc(x, y, largeurTorse, largeurTorse, 90, -90);


        /*-----------------*/
        /* Dessin des bras */
        /*-----------------*/
        g.setColor(Color.PINK);
        largeur = largeurTorse / 4;
        hauteur = hauteurTorse;
        y       = yTorse + largeurTorse / 2;
        /* Bras gauche */
        x       = this.posXPerso;

        g.fillRect(x, y, largeur, hauteur);

        /* Bras droit */
        x       = this.posXPerso + PanelJeu.LARGEUR_PERSO - largeur;

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