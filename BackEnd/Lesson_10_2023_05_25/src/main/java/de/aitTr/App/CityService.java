package de.aitTr.App;

import java.util.List;

public interface CityService {

    List<City> getAllCities();
    List<City> getAllCities(String country);

    City getCity(long id);

    City addCity(City city);

    City removeCity(City city);

    City updateCity(City city);

}
