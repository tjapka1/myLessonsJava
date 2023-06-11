package de.aittr.bd1.controller;

import de.aittr.bd1.dto.*;
import de.aittr.bd1.service.AccountService;
import de.aittr.bd1.service.AddressService;
import de.aittr.bd1.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("clients")
public class ClientController {
    private final ClientService clientService;
    private final AccountService accountService;
    private final AddressService addressService;

    @GetMapping("")
    public List<ClientResponseDTO> getList(){
        return clientService.getList();
    }

    @GetMapping("/{id}")
    public ClientResponseDTO getClient(@PathVariable(name = "id") Long id){
        return clientService.getClient(id);
    }

    @PostMapping("")
    @ResponseStatus(code= HttpStatus.CREATED)
    public ClientResponseDTO addClient(@RequestBody ClientRequestDTO client){
        return clientService.addClient(client);
    }

    @PostMapping("/{id}/accounts")
    @ResponseStatus(code = HttpStatus.CREATED)
    public AccountResponseDTO addAccount(@PathVariable(name = "id") Long clientId, @RequestBody AccountRequestDTO account){
        AccountResponseDTO accountResponseDTO = accountService.addAccount(account, clientId);
        return accountResponseDTO;
    }

    @GetMapping("/{id}/accounts")
    public List<AccountResponseDTO> getAccountsByClient(@PathVariable(name = "id") Long clientId){
        return getAccountsByClient(clientId);
    }

    @PostMapping("/{id}/address")
    @ResponseStatus(code = HttpStatus.CREATED)
    public AddressResponseDTO addAddress(@PathVariable(name = "id") Long clientId, @RequestBody AddressRequestDTO address){
       AddressResponseDTO addressResponseDTO = addressService.addAddress(address, clientId);
        return addressResponseDTO;
    }
    @GetMapping("/{id}/address")
    public List<AddressResponseDTO> getAddressByClient(@PathVariable(name = "id") Long clientId){
        return addressService.getAddressByClientImp(clientId);
    }

    @PutMapping("/{id}")
    public ClientResponseDTO updateClient(@PathVariable(name="id") Long id, @RequestBody ClientRequestDTO client){
        return clientService.updateClient(id,client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable(name="id") Long id){
        clientService.deleteClient(id);
    }


}
