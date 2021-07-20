package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {


    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Audi", 1992));
        cars.add(new Car(2, "Kamaz", 2006));
        cars.add(new Car(3, "Ural", 2007));
        cars.add(new Car(4, "UAZ", 1992));
        cars.add(new Car(5, "Maybach", 2018));

        return cars;
    }
}
