package com.movieBlog.movieblog.persistence.crud;

import com.movieBlog.movieblog.persistence.entity.ActorDTO;
import org.springframework.data.repository.CrudRepository;

public interface ActorDTOCrudRepository extends CrudRepository<ActorDTO, Integer> {

}
