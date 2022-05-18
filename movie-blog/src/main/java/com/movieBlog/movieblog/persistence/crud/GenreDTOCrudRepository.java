package com.movieBlog.movieblog.persistence.crud;

import com.movieBlog.movieblog.persistence.entity.GenreDTO;
import org.springframework.data.repository.CrudRepository;

public interface GenreDTOCrudRepository extends CrudRepository<GenreDTO, Integer> {
}
