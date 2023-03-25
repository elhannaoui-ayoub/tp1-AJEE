package pres;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainAvecSpringXml {


    public static  void main(String[] args){

        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = springContext.getBean(IMetier.class);
        //IMetier metier = (IMetier) springContext.getBean("metier");
        System.out.println(metier.calcul());

    }

}
