package com.movieBlog.movieblog.persistence.crud;

import com.movieBlog.movieblog.persistence.entity.MovieDTO;
import org.springframework.data.repository.CrudRepository;

public interface MovieDTOCrudRepository extends CrudRepository<MovieDTO, Integer> {

}
