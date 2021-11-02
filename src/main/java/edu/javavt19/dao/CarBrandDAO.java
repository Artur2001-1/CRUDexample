package edu.javavt19.dao;

import edu.javavt19.model.CarBrand;
import java.util.List;

public interface CarBrandDAO{

    void saveOrUpdate(CarBrand item);

    void delete(int itemId);

    CarBrand get(int itemId);

    List<CarBrand> list();

}
