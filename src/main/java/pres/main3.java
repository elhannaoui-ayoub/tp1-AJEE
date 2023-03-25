package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class main3 {

    public static  void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("donner la classe de la couche Dao:");
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao= (IDao) cDao.getConstructor().newInstance();

        System.out.println("donner la classe de la couche metier:");
        String metierClassname=scanner.nextLine();
        Class cMetier=Class.forName(metierClassname);
        IMetier metier =(IMetier) cMetier.getConstructor().newInstance();
        // IMetier metier =(IMetier) cMetier.getConstructor(Idao.class).newInstance(dao);
        //metier.setDao(dao) instansiation dynamique
        Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier,dao); //injection des dépendances dynamique
        System.out.println("Res ="+metier.calcul());
    }
}
