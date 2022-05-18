package com.movieBlog.movieblog.persistence;

import com.movieBlog.movieblog.persistence.crud.MovieActorDTOCrudRepository;
import com.movieBlog.movieblog.persistence.entity.MovieActorDTO;
import com.movieBlog.movieblog.persistence.entity.MovieActorDTOPK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class MovieActorDTORepository {
    @Autowired
    private MovieActorDTOCrudRepository movieActorDTOCrudRepository;

    private Optional<MovieActorDTO> getByMovieId(int movieId){
        return movieActorDTOCrudRepository.findByMovieId(movieId);
    }

    private Optional<MovieActorDTO> getByActorId(int actorId){
        return movieActorDTOCrudRepository.findByActorId(actorId);
    }

    private MovieActorDTO save(MovieActorDTO movieActor){
        return movieActorDTOCrudRepository.save(movieActor);
    }
}
