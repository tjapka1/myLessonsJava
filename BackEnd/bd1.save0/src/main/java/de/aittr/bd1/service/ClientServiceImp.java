package de.aittr.bd1.service;

import de.aittr.bd1.dto.AccountResponseDTO;
import de.aittr.bd1.dto.ClientRequestDTO;
import de.aittr.bd1.dto.ClientResponseDTO;
import de.aittr.bd1.entity.Account;
import de.aittr.bd1.entity.Client;
import de.aittr.bd1.repository.CardRepository;
import de.aittr.bd1.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor

public class ClientServiceImp implements ClientService{
    private final ClientRepository clientRepository;
    private final ModelMapper mapper;

    @Override
    public List<ClientResponseDTO> getList() {
        List<Client> clients = clientRepository.findAll();
        return clients.stream()
                .map(a->mapper.map(a, ClientResponseDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ClientResponseDTO getClient(Long id) {
        return mapper.map(clientRepository.findById(id), ClientResponseDTO.class);
    }

    @Override
    public ClientResponseDTO addClient(ClientRequestDTO client) {
        Client entity = mapper.map(client, Client.class);
        //entity.getAccount().setClient(entity);

        /*
        Client entity=new Client();
        Account account =new Account();
        account.setClient(entity);
        account.setIban(client.getAccount().getIban());
        entity.setName(client.getName());
        entity.setAccount(account);
        */

        return mapper.map(clientRepository.save(entity), ClientResponseDTO.class);
    }

    @Override
    public ClientResponseDTO updateClient(Long id, ClientRequestDTO client) {
        if (clientRepository.existsById(id)) {
            Client entity = mapper.map(client, Client.class);
            entity.setId(id);
            return mapper.map(clientRepository.save(entity), ClientResponseDTO.class);
        }
        return null;
    }
    public List<ClientResponseDTO> getListByAge(Integer age){

        List<Client> clients = clientRepository.findAllByAge2(age);
        return clients.stream()
                .filter(c->c.getAge().equals(age))
                .map(a->mapper.map(a, ClientResponseDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
