package de.aittr.bd1.service;

import de.aittr.bd1.dto.AddressRequestDTO;
import de.aittr.bd1.dto.AddressResponseDTO;

import java.util.List;

public interface AddressService {
    List<AddressResponseDTO> getList();
    AddressResponseDTO getAddress(Long id);
    AddressResponseDTO addAddress(AddressRequestDTO address);
    AddressResponseDTO updateAddress(Long id, AddressRequestDTO address);
    void deleteAddress(Long id);
    AddressResponseDTO addAddress(AddressRequestDTO addressRequestDTO, Long clientId);
    List<AddressResponseDTO> getAddressByClientImp(Long id);

    void addClientToAddresse(Long addressId, Long clientId);
}
