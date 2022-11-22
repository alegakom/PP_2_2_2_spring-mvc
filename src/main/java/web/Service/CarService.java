package web.Service;

import web.models.Car;

import java.util.List;

public interface CarService {
    Car addCar(Car car);
    List<Car> getAllCar();
}
