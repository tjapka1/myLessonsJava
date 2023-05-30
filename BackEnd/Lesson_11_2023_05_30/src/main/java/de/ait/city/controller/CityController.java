package de.ait.city.controller;

import de.ait.city.dto.CityRequestDTO;
import de.ait.city.dto.CityResponseDTO;
import de.ait.city.entity.City;
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
    @PostMapping("")
    public CityResponseDTO updateCity(@RequestBody CityRequestDTO city){return service.updateCity(city);}
    @DeleteMapping("")
    public City deleteCity(
            @RequestParam(name = "city", required = true,defaultValue = "all") String city,
            @RequestParam(name = "country", required = false,defaultValue = "all") String country
    ){ return null;}
}
