package src.metier;


import src.Controleur;


public class Metier
{
    private Controleur ctrl;


    public Metier(Controleur ctrl)
    {
        this.ctrl = ctrl;
    }



    // Permet d'avancer le personnage
    public void Avancer()
    {

        this.ctrl.majIhm();
    }

    // Permet de reculer le personnage
    public void Reculer()
    {

        this.ctrl.majIhm();
    }

    // Permet de faire sauter le personnage
    public void sauter()
    {

        this.ctrl.majIhm();
    }

    // Permet de faire dash le personnage
    public void dash()
    {

        this.ctrl.majIhm();
    }
}
