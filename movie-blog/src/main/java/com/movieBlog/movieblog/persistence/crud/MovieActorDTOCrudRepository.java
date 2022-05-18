package com.movieBlog.movieblog.persistence.crud;

import com.movieBlog.movieblog.persistence.entity.MovieActorDTO;
import com.movieBlog.movieblog.persistence.entity.MovieActorDTOPK;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MovieActorDTOCrudRepository extends CrudRepository<MovieActorDTO, MovieActorDTOPK> {
    Optional<MovieActorDTO> findByMovieId(int movieId);
    Optional<MovieActorDTO> findByActorId(int actorId);
}
