package pl.urbanskilukasz.carRent.controller;

import org.springframework.web.bind.annotation.*;
import pl.urbanskilukasz.carRent.model.Car;
import pl.urbanskilukasz.carRent.model.CarDto;
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
    public List<CarDto> returnCarList(){
        return carService.returnCars();
    }

    @GetMapping("/{id}")
    public CarDto getCar(@PathVariable long id){
        
        return carService.returnCar(id);
    }

   @GetMapping(path = "/vehicleBrand")
    public  List<Car> getCarsByVehicleBrand (@RequestParam("vehicleBrand") String vehicleBrand){
        return carService.returnCarsByVehicleBrand(vehicleBrand);
   }

   @PostMapping("")
    public Car crateCar(@RequestBody CarDto carDto){
        return carService.createCar(carDto);
   }

   @PutMapping("/{id}")
    public Car updateCar (@RequestBody CarDto carDto, @PathVariable Long id){
        return carService.updateCar(carDto, id);
   }

   @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id){
        carService.deleteCar(id);

   }
}
