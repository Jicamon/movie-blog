package com.movieBlog.movieblog.persistence;

import com.movieBlog.movieblog.persistence.crud.GenreDTOCrudRepository;
import com.movieBlog.movieblog.persistence.entity.GenreDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class GenreDTORepository {
    @Autowired
    private GenreDTOCrudRepository genreDTOCrudRepository;

    private Optional<GenreDTO> getById(int genreId){
        return genreDTOCrudRepository.findById(genreId);
    }

    private GenreDTO save(GenreDTO genre){
        return genreDTOCrudRepository.save(genre);
    }
}
