package com.movieBlog.movieblog.persistence.entity;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

@Embeddable
public class MovieActorDTOPK {

    private Integer movieId;
    private Integer actorId;

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
