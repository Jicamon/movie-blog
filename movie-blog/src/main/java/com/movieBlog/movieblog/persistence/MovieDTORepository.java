package com.movieBlog.movieblog.persistence;

import com.movieBlog.movieblog.persistence.crud.MovieDTOCrudRepository;
import com.movieBlog.movieblog.persistence.entity.MovieDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class MovieDTORepository {
    @Autowired
    private MovieDTOCrudRepository movieDTOCrudRepository;

    private Optional<MovieDTO> getById(int movieId){
        return movieDTOCrudRepository.findById(movieId);
    }

    private MovieDTO save(MovieDTO movie){
        return movieDTOCrudRepository.save(movie);
    }
}
