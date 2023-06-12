package de.aittr.bd1.service;

import de.aittr.bd1.dto.AccountRequestDTO;
import de.aittr.bd1.dto.AccountResponseDTO;
import de.aittr.bd1.dto.CardRequestDTO;
import de.aittr.bd1.dto.CardResponseDTO;
import de.aittr.bd1.entity.Account;
import de.aittr.bd1.entity.Card;
import de.aittr.bd1.entity.Client;
import de.aittr.bd1.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AccountServiceIml implements AccountService{
    private final JpaRepository<Account, Long> accountRepository;
    private final JpaRepository<Client, Long> clientRepository;
    private final ModelMapper mapper;
    @Override
    public List<AccountResponseDTO> getList() {
        List<Account> accounts = accountRepository.findAll();
        return accounts.stream()
                .map(a->mapper.map(a, AccountResponseDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public AccountResponseDTO getAccount(Long id) {
        return mapper.map(accountRepository.findById(id), AccountResponseDTO.class);
    }

       @Override
        public AccountResponseDTO addAccount(AccountRequestDTO account) {
           Account entity = mapper.map(account, Account.class);
           return mapper.map(accountRepository.save(entity),AccountResponseDTO.class);
         //   return null;
        }

    @Override
    public AccountResponseDTO addAccount(AccountRequestDTO account, Long clientId) {
        Account entity = mapper.map(account,Account.class);
        Client client = clientRepository.findById(clientId).get();

        //TODO Mapper
        List<Client> clients = entity.getClients();
        if(clients==null){clients=new ArrayList<>();}
        clients.add(client);
        entity.setClients(clients);

        List<Account> accounts = client.getAccounts();
        if (accounts==null){accounts=new ArrayList<>();}
        accounts.add(entity);
        client.setAccounts(accounts);


//        entity. setClients(client);
        //accounts.add(entity);
        Account savedAccount = accountRepository.save(entity);
        AccountResponseDTO res = mapper.map(savedAccount, AccountResponseDTO.class);
        return res;
    }


    @Override
    public void addClientToAccount(Long accountId, Long clientId) {
        Account account = accountRepository.findById(accountId).get();
        Client client = clientRepository.findById(clientId).get();

        List<Client> clients = account.getClients();
        clients.add(client);
        account.setClients(clients);

        List<Account> accounts = client.getAccounts();
        accounts.add(account);
        client.setAccounts(accounts);

        clientRepository.save(client);


    }

    @Override
    public AccountResponseDTO updateAccount(Long id, AccountRequestDTO account) {
        if (accountRepository.existsById(id)) {
            Account entity = mapper.map(account, Account.class);
            entity.setId(id);
            return mapper.map(accountRepository.save(entity), AccountResponseDTO.class);
        }
        return null;

    }

    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }



}
