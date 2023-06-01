package de.ait.city.service;

import de.ait.city.dto.CityRequestDTO;
import de.ait.city.dto.CityResponseDTO;
import de.ait.city.entity.City;
import de.ait.city.reposity.CityRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class CityServiceImp{
    private CityRepository repository;
    private ModelMapper mapper;
    public List<CityResponseDTO> getAllCities(){

        List<CityResponseDTO> list = new ArrayList<>();
        repository.findAll().forEach(
            c->{
                CityResponseDTO cdto = new CityResponseDTO(
                        c.getId(),
                        c.getName(),
                        c.getCountry(),
                        c.getPopulation(),
                        c.getArea()
                                   );

                list.add(cdto);
    });
        return list;
}

    public CityResponseDTO addCity(CityRequestDTO city){
        //City c= new City(null, city.getName(), city.getCountry(),city.getPopulation(),city.getArea());
        //City c = mapper.map(city, City.class);
        City res = repository.save(mapper.map(city, City.class));
        //CityResponseDTO cityResponseDTO = new CityResponseDTO(res.getId(), res.getName(), res.getCountry(), res.getPopulation(), res.getArea());
        return  mapper.map(res, CityResponseDTO.class);
    }


    public CityResponseDTO removeCity(Long id) {
        repository.deleteById(id);
        return null;
    }

    public CityResponseDTO updateCity(Long id, CityRequestDTO city){
        City entity = mapper.map(city, City.class);
        entity.setId(id);
        City resEntity = repository.save(entity);
        return mapper.map(resEntity,CityResponseDTO.class);
    }

}
