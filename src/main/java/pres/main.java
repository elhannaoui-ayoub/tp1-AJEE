package pres;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

public class main {
    //IMetier metier;
    public static  void main(String[] args){

        IDao dao = new DaoImpl();
        // instanciation dynamique
        MetierImpl metier = new MetierImpl(); //Instanciation statique
        metier.setDao(dao); // injection des dépendances
        System.out.println(metier.calcul());

    }
}
