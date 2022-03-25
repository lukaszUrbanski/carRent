package pl.urbanskilukasz.carRent.controller;

import org.springframework.web.bind.annotation.*;
import pl.urbanskilukasz.carRent.model.Car;
import pl.urbanskilukasz.carRent.service.CarService;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/home")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("")
    public List<Car> returnCarList(){
        return carService.returnCars();
    }

    @GetMapping("/{id}")
    public Car getCar(@PathVariable long id){
        return carService.returnCar(id);
    }

   @GetMapping(path = "/vehicleBrand")
    public  List<Car> getCarsByVehicleBrand (@RequestParam("vehicleBrand") String vehicleBrand){
        return carService.returnCarsByVehicleBrand(vehicleBrand);
   }
}
