package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("bd")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("connexion au base de données");
        double data = 42;
        return data;
    }
}
