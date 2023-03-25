package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {
    //@Autowired
   // @Qualifier("bd")
    private IDao dao; //couplge faible
    public MetierImpl() {

    }
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        double res = data* 11.4;
        return res;
    }
    // Permettre de modifier la valeur de la variable dao
    //un objet d'une class qui implement l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
