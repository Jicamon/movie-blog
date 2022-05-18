package com.movieBlog.movieblog.persistence;

import com.movieBlog.movieblog.persistence.crud.MovieActorDTOCrudRepository;
import com.movieBlog.movieblog.persistence.crud.MovieGenreDTOCrudRepository;
import com.movieBlog.movieblog.persistence.entity.MovieDTO;
import com.movieBlog.movieblog.persistence.entity.MovieGenreDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class MovieGenreDTORepository {
    @Autowired
    private MovieGenreDTOCrudRepository movieGenreDTOCrudRepository;

    private Optional<MovieGenreDTO> getByMovieId(int movieId){
        return movieGenreDTOCrudRepository.findByMovieId(movieId);
    }

    private Optional<MovieGenreDTO> getByGenreId(int genreId){
        return movieGenreDTOCrudRepository.findByGenreId(genreId);
    }

    private MovieGenreDTO save(MovieGenreDTO movieGenre){
        return movieGenreDTOCrudRepository.save(movieGenre);
    }
}
