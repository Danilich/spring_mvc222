package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars(Integer count) {
        List<Car> carList = carDao.getCars();

        if (count != null && count > 0 && count < carList.size()) {
            carList = carList.subList(0, count);
        }
        return carList;
    }
}
