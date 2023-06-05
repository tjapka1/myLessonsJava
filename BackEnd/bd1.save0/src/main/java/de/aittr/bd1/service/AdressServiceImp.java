package de.aittr.bd1.service;

import de.aittr.bd1.dto.AdressRequestDTO;
import de.aittr.bd1.dto.AdressResponseDTO;
import de.aittr.bd1.entity.Adress;
import de.aittr.bd1.repository.AccountRepository;
import de.aittr.bd1.repository.AdressRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AdressServiceImp implements AdressService{
    private final AdressRepository repository;
    private final ModelMapper mapper;
    @Override
    public List<AdressResponseDTO> getList() {
        List<Adress> adresses=repository.findAll();
        return adresses.stream().map(a->mapper.map(a, AdressResponseDTO.class)).collect(Collectors.toList());
    }

    @Override
    public AdressResponseDTO getAdress(Long id) {
        return mapper.map(repository.findById(id), AdressResponseDTO.class);
    }

    @Override
    public AdressResponseDTO addAdress(AdressRequestDTO adress) {
        Adress entity = mapper.map(adress, Adress.class);
        return mapper.map(repository.save(entity), AdressResponseDTO.class);
    }

    @Override
    public AdressResponseDTO updateAdress(Long id, AdressRequestDTO adress) {
        if (repository.existsById(id)){
            Adress entity = mapper.map(adress, Adress.class);
            entity.setId(id);
            return mapper.map(repository.save(entity), AdressResponseDTO.class);
        }
        return null;
    }

    @Override
    public void deleteAdress(Long id) {
        repository.deleteById(id);
    }

}
