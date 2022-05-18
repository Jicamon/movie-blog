package com.movieBlog.movieblog.persistence.crud;

import com.movieBlog.movieblog.persistence.entity.UserDTO;
import org.springframework.data.repository.CrudRepository;

public interface UserDTOCrudRepository extends CrudRepository<UserDTO, Integer> {

}
