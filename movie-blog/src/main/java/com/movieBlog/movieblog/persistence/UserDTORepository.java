package com.movieBlog.movieblog.persistence;

import com.movieBlog.movieblog.persistence.crud.UserDTOCrudRepository;
import com.movieBlog.movieblog.persistence.entity.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserDTORepository {
    @Autowired
    private UserDTOCrudRepository userDTOCrudRepository;

    private Optional<UserDTO> getById(int userId){
        return userDTOCrudRepository.findById(userId);
    }

    private UserDTO save(UserDTO user){
        return userDTOCrudRepository.save(user);
    }
}
