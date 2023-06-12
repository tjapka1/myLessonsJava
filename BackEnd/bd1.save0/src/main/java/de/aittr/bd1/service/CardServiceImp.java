package de.aittr.bd1.service;

import de.aittr.bd1.dto.CardRequestDTO;
import de.aittr.bd1.dto.CardResponseDTO;
import de.aittr.bd1.entity.Account;
import de.aittr.bd1.entity.Card;
import de.aittr.bd1.repository.AccountRepository;
import de.aittr.bd1.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardServiceImp implements CardService{
    private final CardRepository cardRepository;
    private final AccountRepository accountRepository;
    private final ModelMapper mapper;


    @Override
    public List<CardResponseDTO> getListOfCard() {
        List<Card> entities= cardRepository.findAll();
        List<CardResponseDTO>dtos=mapper.map(entities, new TypeToken<List<CardResponseDTO>>(){}.getType());
        return dtos;
    }

    @Override
    public void addCard(CardRequestDTO cardRequestDTO) {
         Card entity= mapper.map(cardRequestDTO, Card.class );
        Account account = accountRepository.findById(cardRequestDTO.getAccountId()).orElseThrow(
                ()-> new ResponseStatusException(HttpStatus.BAD_REQUEST)
        );
        entity.setAccount(account);
        cardRepository.save(entity);

    }
}
