package pl.urbanskilukasz.carRent.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.urbanskilukasz.carRent.model.dto.RentalDto;
import pl.urbanskilukasz.carRent.model.rental.Rental;
import pl.urbanskilukasz.carRent.service.RentalService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/rental")
public class RentalController {

    private final RentalService rentalService;

    @GetMapping("")
    public List<Rental> getAllRentals(){
        return rentalService.findAll();
    }

    @GetMapping("/{id}")
    public Rental getRentalById(@PathVariable long id){
        return rentalService.findById(id);
    }

    @PostMapping("")
    public Rental createRental(@RequestBody RentalDto rentalDto){
        return rentalService.createRental(rentalDto);
    }
}
