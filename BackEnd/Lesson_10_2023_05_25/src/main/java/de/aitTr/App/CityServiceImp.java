package de.aitTr.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityServiceImp implements CityService{


    CityRepository repository;
    @Autowired
    public CityServiceImp(CityRepository repository) {
        this.repository = repository;
    }

    /*
    static final List <City> cities =new ArrayList<>(List.of(
            new City("Berlin", "Germany", 3_645_000, 891.8),
            new City("London", "United Kingdom", 8_982_000, 1572),
            new City("New York", "USA", 8_468_000, 783.8),
            new City("Oslo", "Norway",634_293, 454),
            new City("Tokyo", "Japan",13_960_000, 2194),
            new City("Reykjavik", "Iceland",122_853, 273),
            new City("Paris", "USA",24_171, 96),
            new City("Paris", "France",2_161_000, 105.4)
    )
    );*/

    @Override
    public List<City> getAllCities() {
        List<City> cities = new ArrayList<>();
        repository.findAll().forEach(c->cities.add(c));
        City city= City.builder()
                .name("Moscow")
                .population(1888888)
                .country("RF").build();
        return cities;
    }

    @Override
    public List<City> getAllCities(String country) {
        return null; //cities.stream().filter(a->a.getCountry().equals(country)).toList();
    }

    @Override
    public City getCity(long id) {
        return null; //cities.stream().filter(a->a.getId()==id).findAny().get();
    }

    @Override
    public City addCity(City city) {
        repository.save(city);
        return city;
    }

    @Override
    public City removeCity(City city) {
        return null;
    }

    @Override
    public City updateCity(City city) {
        return null;
    }
}
