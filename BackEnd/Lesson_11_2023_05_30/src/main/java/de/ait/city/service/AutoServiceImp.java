package de.ait.city.service;

import de.ait.city.dto.AutoRequestDTO;
import de.ait.city.dto.AutoResponseDTO;
import de.ait.city.entity.Auto;
import de.ait.city.reposity.AutoRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class AutoServiceImp {
    private AutoRepository repository;
    private ModelMapper mapper;

    public List<AutoResponseDTO> getAllAutos(){
        List<AutoResponseDTO> list = new ArrayList<>();
        repository.findAll().forEach(
                a->{
                    AutoResponseDTO adto=new AutoResponseDTO(
                            a.getId(),
                            a.getBrand(),
                            a.getPlate(),
                            a.getYear()
                    );
                    list.add(adto);
                }
        );
        return list;
    }
    public AutoResponseDTO addAuto(AutoRequestDTO auto){
        Auto res = repository.save(mapper.map(auto, Auto.class));
        return mapper.map(res, AutoResponseDTO.class);
    }
    public AutoResponseDTO removeAuto(Long id){
        repository.deleteById(id);
        return null;
    }
    public AutoResponseDTO updateAuto(Long id, AutoRequestDTO auto){
        Auto entity = mapper.map(auto, Auto.class);
        entity.setId(id);
        Auto resEntity = repository.save(entity);
        return mapper.map(resEntity, AutoResponseDTO.class);
    }
}
