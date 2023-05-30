package de.ait.city.service;

import de.ait.city.dto.CityRequestDTO;
import de.ait.city.dto.CityResponseDTO;
import de.ait.city.entity.City;

import java.util.List;

public interface CityServices {
    List<CityResponseDTO> getAllCities();


    CityResponseDTO addCity(CityRequestDTO city);

    City removeCity(City city);

    CityResponseDTO updateCity(CityRequestDTO city);
}

