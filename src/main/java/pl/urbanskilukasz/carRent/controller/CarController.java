package pl.urbanskilukasz.carRent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.urbanskilukasz.carRent.model.Car;
import pl.urbanskilukasz.carRent.service.CarService;

import java.util.List;

@RestController
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/cars/{id}")
    public String getCar(@PathVariable long id){
        return carService.returnCar();
    }

    @GetMapping("/cars")
    public List<Car> returnCarList(){
        return carService.returnCars();
    }
}
