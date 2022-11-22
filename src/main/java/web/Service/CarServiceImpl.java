package web.Service;

import web.DAO.CarDaoImpl;
import web.models.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    CarDaoImpl cdi = new CarDaoImpl();
    @Override
    public Car addCar(Car car) {
        return cdi.addCar(car);
    }

    @Override
    public List<Car> getAllCar() {
        return null;
    }
}
