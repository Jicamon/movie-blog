package com.movieBlog.movieblog.persistence;

import com.movieBlog.movieblog.persistence.crud.RatingDTOCrudRepository;
import com.movieBlog.movieblog.persistence.entity.RatingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RatingDTORepository {
    @Autowired
    private RatingDTOCrudRepository ratingDTOCrudRepository;

    private Optional<RatingDTO> getById(int ratingId){
        return ratingDTOCrudRepository.findById(ratingId);
    }

    private RatingDTO save(RatingDTO rating){
        return ratingDTOCrudRepository.save(rating);
    }
}
