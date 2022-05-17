package com.movieBlog.movieblog.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Movies_Actors")
public class MovieActorDTO {

    @EmbeddedId
    private MovieGenreDTOPK id;

    public MovieGenreDTOPK getId() {
        return id;
    }

    public void setId(MovieGenreDTOPK id) {
        this.id = id;
    }
}
