package de.ait.city.service;

import de.ait.city.dto.UserRequestDTO;
import de.ait.city.dto.UserResponseDTO;
import de.ait.city.entity.City;
import de.ait.city.entity.User;
import de.ait.city.reposity.UserRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Service
public class UserServiceImp {
    private UserRepository repository;
    private ModelMapper mapper;

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
         User res = repository.save(mapper.map(user, User.class));
         return mapper.map(res, UserResponseDTO.class);
    }
    public UserResponseDTO updateUser(Long id, UserRequestDTO user){
        User entity = mapper.map(user, User.class);
        entity.setId(id);
        User res = repository.save(entity);
        return mapper.map(res, UserResponseDTO.class);
    }
    public UserResponseDTO removeUser(Long id){
        repository.deleteById(id);
        return null;
    }

}
