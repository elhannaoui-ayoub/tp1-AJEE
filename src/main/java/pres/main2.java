package pres;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class main2 {

    public static  void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("config.txt"));
      String daoClassName = scanner.nextLine();
      Class cDao = Class.forName(daoClassName);
      IDao dao= (IDao) cDao.getConstructor().newInstance();
      System.out.println(dao.getData());
      String metierClassname=scanner.nextLine();
      Class cMetier=Class.forName(metierClassname);
      IMetier metier =(IMetier) cMetier.getConstructor().newInstance();

      //metier.setDao(dao) instansiation dynamique
      Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
      setDao.invoke(metier,dao); //injection des dépendances dynamique
        System.out.println("Res ="+metier.calcul());
    }
}
