package de.ait.city.service;

import de.ait.city.dto.UserRequestDTO;
import de.ait.city.dto.UserResponseDTO;
import de.ait.city.entity.City;
import de.ait.city.entity.User;
import de.ait.city.reposity.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Service
public class UserServiceImp {
    private UserRepository repository;

    public List<UserResponseDTO> getAllUsers(){
        List<UserResponseDTO>list=new ArrayList<>();
        repository.findAll().forEach(u -> {
            UserResponseDTO udto = new UserResponseDTO(
                    u.getId(),
                    u.getName(),
                    u.getAge()
            );
            list.add(udto);
        });
        return list;
    }
    public UserResponseDTO addUser(UserRequestDTO user){
        User u = new User(user.getName(), user.getAge());
        repository.save(u);
        UserResponseDTO userResponseDTO = new UserResponseDTO(u.getId(), u.getName(), u.getAge());
        return userResponseDTO;
    }
    public UserResponseDTO updateUser(UserRequestDTO user){
        User u = new User(user.getName(), user.getAge());
        repository.save(u);
        UserResponseDTO userResponseDTO = new UserResponseDTO(u.getId(), u.getName(), u.getAge());
        return userResponseDTO;
    }

}
