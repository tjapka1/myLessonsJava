package de.aitTr.App;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
@Tag(name = "Cities", description = "API информацие о городах")
public class CityController {
    private final CityService service;
    @Autowired
    public CityController(CityService service) {
        this.service = service;
    }
    @GetMapping("")  // "/cities"
    public List<City> listCity (@RequestParam(name = "country", required = false,defaultValue = "all") String country ){
        if (country.equals("all")){
            return service.getAllCities();
        } else {
            return service.getAllCities(country);
        }
    }
    @GetMapping("/{id}")  // "/cities"
    @Operation(description = "Получить данные о городе")
    public City getCity (@PathVariable int id){
        return service.getCity(id);
    }
    @PostMapping("")
    @ResponseStatus(code= HttpStatus.CREATED)
    public City createCity(@RequestBody City city){
        service.addCity(city);
        return city;
    }
    // localhost:8080/cities?city=paris&country=france
    @DeleteMapping("")
    public City deleteCity(
            @RequestParam(name = "city", required = true,defaultValue = "all") String city,
            @RequestParam(name = "country", required = false,defaultValue = "all") String country
    ){ return null;}


}
