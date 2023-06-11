package de.aittr.bd1.service;

import de.aittr.bd1.dto.AccountRequestDTO;
import de.aittr.bd1.dto.AccountResponseDTO;
import de.aittr.bd1.dto.CardRequestDTO;
import de.aittr.bd1.dto.CardResponseDTO;

import java.util.List;

public interface AccountService {
    List<AccountResponseDTO> getList();
    AccountResponseDTO getAccount(Long id);
    AccountResponseDTO addAccount(AccountRequestDTO account, Long clientId);
    AccountResponseDTO updateAccount(Long id, AccountRequestDTO account);
    void deleteAccount(Long id);
   // AccountResponseDTO addAccount(AccountRequestDTO account, Long clientId);

   // AccountResponseDTO addAccount(AccountRequestDTO account, Long clientId);

    void addClientToAccount(Long accountId, Long clientId);
}
