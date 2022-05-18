package com.movieBlog.movieblog.persistence.crud;

import com.movieBlog.movieblog.persistence.entity.MovieActorDTO;
import com.movieBlog.movieblog.persistence.entity.MovieGenreDTO;
import com.movieBlog.movieblog.persistence.entity.MovieGenreDTOPK;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MovieGenreDTOCrudRepository extends CrudRepository<MovieGenreDTO, MovieGenreDTOPK> {
    Optional<MovieGenreDTO> findByMovieId(int movieId);
    Optional<MovieGenreDTO> findByGenreId(int genreId);
}
