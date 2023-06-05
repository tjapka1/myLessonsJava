package de.aittr.bd1.service;

import de.aittr.bd1.dto.AdressRequestDTO;
import de.aittr.bd1.dto.AdressResponseDTO;

import java.util.List;

public interface AdressService {
    List<AdressResponseDTO> getList();
    AdressResponseDTO getAdress(Long id);
    AdressResponseDTO addAdress(AdressRequestDTO adress);
    AdressResponseDTO updateAdress(Long id, AdressRequestDTO adress);
    void deleteAdress(Long id);
}
