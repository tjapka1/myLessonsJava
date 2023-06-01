package de.ait.city.controller;

import de.ait.city.dto.CityRequestDTO;
import de.ait.city.dto.UserRequestDTO;
import de.ait.city.dto.UserResponseDTO;
import de.ait.city.service.UserServiceImp;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
    private UserServiceImp service;

    @GetMapping("")
    public List<UserResponseDTO> listUsers(){return service.getAllUsers();}

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public UserResponseDTO creatUser(@RequestBody UserRequestDTO user){return service.addUser(user);}

    @PutMapping("/{id}")
    public UserResponseDTO updateUser(@RequestParam Long id, @RequestBody UserRequestDTO user){return service.updateUser(id, user);}


    @DeleteMapping("/{id}")
    public UserResponseDTO
    deleteUser(@RequestParam(name = "id",required = true,defaultValue = "all")Long id){
        return service.removeUser(id);
    }

}
