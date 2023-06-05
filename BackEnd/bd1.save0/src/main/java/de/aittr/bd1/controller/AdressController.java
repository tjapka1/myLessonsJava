package de.aittr.bd1.controller;

import de.aittr.bd1.dto.AdressRequestDTO;
import de.aittr.bd1.dto.AdressResponseDTO;
import de.aittr.bd1.dto.ClientRequestDTO;
import de.aittr.bd1.dto.ClientResponseDTO;
import de.aittr.bd1.service.AdressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("adresses")
public class AdressController {
    private final AdressService service;

    @GetMapping("")
    public List<AdressResponseDTO>getList(){return service.getList();}

    @GetMapping ("/{id}")
    public AdressResponseDTO getAdress(@PathVariable(name = "id")Long id){
        return service.getAdress(id);
    }

    @PostMapping("")
    @ResponseStatus(code= HttpStatus.CREATED)
    public AdressResponseDTO addAdress(@RequestBody AdressRequestDTO adress){
        return service.addAdress(adress);
    }

    @PutMapping("/{id}")
    public AdressResponseDTO updateAdress(@PathVariable(name="id") Long id, @RequestBody AdressRequestDTO adress){
        return service.updateAdress(id, adress);
    }

    @DeleteMapping("/{id}")
    public void deleteAdress(@PathVariable(name="id") Long id){
        service.deleteAdress(id);
    }



}
