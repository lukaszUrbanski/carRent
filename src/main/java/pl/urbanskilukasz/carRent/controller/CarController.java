package pl.urbanskilukasz.carRent.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.*;
import pl.urbanskilukasz.carRent.mapper.CarDtoMapper;
import pl.urbanskilukasz.carRent.model.car.Car;
import pl.urbanskilukasz.carRent.model.dto.CarDto;
import pl.urbanskilukasz.carRent.service.CarService;

import java.util.List;

@RestController
@RequestMapping("/cars")
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
    public List<CarDto> returnCarList(@RequestParam(required = false) Integer page){
      int pageNumber = page ==  null || page <= 0  ? 0 : page;
        return CarDtoMapper.mapToCarDtoList(carService.returnCars(pageNumber));
    }

    @GetMapping("/{id}")
    public CarDto getCar(@PathVariable long id){
        
        return carService.returnCar(id);
    }

   @GetMapping("/vehicleBrand")
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
