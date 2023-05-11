package de.aittr.Lesson_06_2023_05_06.dao;

import de.aittr.Lesson_06_2023_05_06.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UsersDAO {
    public List<User> getUsers(){

        List<User> list = new ArrayList<>(
            List.of(
                            new User("Jack", "Berlin"),
                            new User("Nick", "Paris"),
                            new User("Lena", "Berlin"),
                            new User("Ted", "Oslo")
                    )
            );
            return list;
    }
}
