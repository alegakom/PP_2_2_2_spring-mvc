package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImpl;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Controller
public class CarController {
    Car car = new Car("BMW", "<X6>", 2016);
    Car car1 = new Car("LADA", "<GRANTA>", 2016);
    Car car2 = new Car("<Mazda>", "<RX8>", 2016);
    Car car3 = new Car("Opel", "<Astra>", 2016);
    Car car4 = new Car("VAZ", "<2108>", 2016);


    CarServiceImpl csi = new CarServiceImpl();
    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model){
        List<Car> carList = new ArrayList<>();
        carList.add(car);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        model.addAttribute("carList", carList.stream().limit(count).collect(Collectors.toList()));
        // нужно не забыть указать передаваемый объект "carList" в .html
        return "car";
    }
}
