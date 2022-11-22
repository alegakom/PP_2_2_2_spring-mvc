package web.DAO;

import web.models.Car;

import java.util.List;

public class CarDaoImpl implements CarDao {
    @Override
    public Car addCar(Car car) {
        return car;
    }

    @Override
    public List<Car> getAllCar() {
        return null;
    }
}
