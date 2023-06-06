package de.aittr.bd1.service;

import de.aittr.bd1.dto.AddressRequestDTO;
import de.aittr.bd1.dto.AddressResponseDTO;
import de.aittr.bd1.entity.Address;
import de.aittr.bd1.entity.Client;
import de.aittr.bd1.repository.AddressRepository;
import de.aittr.bd1.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AddressServiceImp implements AddressService {
    private final AddressRepository addressRepository;
    private final ClientRepository clientRepository;
    private final ModelMapper mapper;
    @Override
    public List<AddressResponseDTO> getList() {
        List<Address> addresses = addressRepository.findAll();
        return addresses.stream().map(a->mapper.map(a, AddressResponseDTO.class)).collect(Collectors.toList());
    }

    @Override
    public AddressResponseDTO getAddress(Long id) {
        return mapper.map(addressRepository.findById(id), AddressResponseDTO.class);
    }

    @Override
    public AddressResponseDTO addAddress(AddressRequestDTO adress) {
        Address entity = mapper.map(adress, Address.class);
        return mapper.map(addressRepository.save(entity), AddressResponseDTO.class);
    }

    @Override
    public AddressResponseDTO updateAddress(Long id, AddressRequestDTO adress) {
        if (addressRepository.existsById(id)){
            Address entity = mapper.map(adress, Address.class);
            entity.setId(id);
            return mapper.map(addressRepository.save(entity), AddressResponseDTO.class);
        }
        return null;
    }

    @Override
    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }

    @Override
    public AddressResponseDTO addAddress(AddressRequestDTO address, Long clientId) {
        Address entity= mapper.map(address, Address.class);
        Client client = clientRepository.findById(clientId).get();

        entity.setClient(client);

        //как тут добавить один к одному
        client.getAddress().setClient(client);

        Address savedAddress = addressRepository.save(entity);
        AddressResponseDTO res =mapper.map(savedAddress, AddressResponseDTO.class);
        return res;
    }


}
