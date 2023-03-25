package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainAvecSpringAnnotation {
    public static  void main(String[] args) {
        ApplicationContext springContext = new AnnotationConfigApplicationContext("dao", "metier");
        IMetier metier = springContext.getBean(IMetier.class);

        System.out.println(metier.calcul());
    }
}
