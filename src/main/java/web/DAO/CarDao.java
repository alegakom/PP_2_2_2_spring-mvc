package web.DAO;

import web.models.Car;

import java.util.List;

public interface CarDao {
    Car addCar(Car car);
    List<Car> getAllCar();
}
