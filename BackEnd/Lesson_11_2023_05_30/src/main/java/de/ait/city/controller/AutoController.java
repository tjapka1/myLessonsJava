package de.ait.city.controller;

import de.ait.city.dto.AutoRequestDTO;
import de.ait.city.dto.AutoResponseDTO;
import de.ait.city.service.AutoServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/autos")
public class AutoController {
    private AutoServiceImp service;

    @GetMapping("")
    public List<AutoResponseDTO> listAutos(){return service.getAllAutos();}
    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public AutoResponseDTO creatAuto(@RequestBody AutoRequestDTO auto){return service.addAuto(auto);}
    @PutMapping("/{id}")
    public  AutoResponseDTO updateAuto(@RequestParam Long id, @RequestBody AutoRequestDTO auto){
        return service.updateAuto(id, auto);
    }
    @DeleteMapping("/{id}")
    public AutoResponseDTO deleteAuto(@RequestParam(name = "id", required = true,defaultValue = "all") Long id){
        return service.removeAuto(id);
    }

}
