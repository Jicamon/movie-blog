package com.movieBlog.movieblog.persistence.crud;

import com.movieBlog.movieblog.persistence.entity.RatingDTO;
import org.springframework.data.repository.CrudRepository;

public interface RatingDTOCrudRepository extends CrudRepository<RatingDTO, Integer> {

}
