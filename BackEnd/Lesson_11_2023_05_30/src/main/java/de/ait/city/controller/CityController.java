package de.ait.city.controller;

import de.ait.city.dto.CityRequestDTO;
import de.ait.city.dto.CityResponseDTO;
import de.ait.city.service.CityServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/cities")
public class CityController {

    private CityServiceImp service;
    @GetMapping("")
    public List<CityResponseDTO>listCities(){
        return service.getAllCities();
    }
    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public CityResponseDTO creatCity(@RequestBody CityRequestDTO city){return service.addCity(city);}

    @PutMapping("/{id}")
    public CityResponseDTO updateCity(@RequestParam Long id, @RequestBody CityRequestDTO city){
        return service.updateCity(id, city);}

    @DeleteMapping("/{id}")
    public CityResponseDTO deleteCity(
            @RequestParam(name = "id", required = true,defaultValue = "all") Long id){

        return service.removeCity(id);
    }
}
