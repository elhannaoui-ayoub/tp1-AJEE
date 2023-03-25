package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("ws")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version web service");
        double data = 72;
        double res = data * 4.2;
        return res;
    }
}
