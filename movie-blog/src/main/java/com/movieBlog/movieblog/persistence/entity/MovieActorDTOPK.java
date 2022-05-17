package com.movieBlog.movieblog.persistence.entity;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;

@Embeddable
public class MovieActorDTOPK implements Serializable {

    private Integer movieId;
    private Integer actorId;

    // GETTERS AND SETTERS

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }
}
