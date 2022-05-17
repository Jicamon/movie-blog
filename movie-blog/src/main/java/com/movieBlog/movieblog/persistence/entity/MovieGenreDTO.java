package com.movieBlog.movieblog.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Movies_Genres")
public class MovieGenreDTO {

    @EmbeddedId
    private MovieGenreDTOPK id;

    public MovieGenreDTOPK getId() {
        return id;
    }

    public void setId(MovieGenreDTOPK id) {
        this.id = id;
    }
}
