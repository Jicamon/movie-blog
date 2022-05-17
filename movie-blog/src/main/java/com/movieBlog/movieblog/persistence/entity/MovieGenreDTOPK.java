package com.movieBlog.movieblog.persistence.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class MovieGenreDTOPK implements Serializable {
    private Integer movieId;
    private Integer genreId;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }
}
