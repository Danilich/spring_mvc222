package web.service;

import org.springframework.lang.Nullable;
import web.models.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars( Integer count);
}
