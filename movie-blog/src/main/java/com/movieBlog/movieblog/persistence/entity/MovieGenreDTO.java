package com.movieBlog.movieblog.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "Movies_Genres")
public class MovieGenreDTO {

    @EmbeddedId
    private MovieGenreDTOPK id;

    // RELATIONS

    @ManyToOne
    @MapsId("movieId")
    @JoinColumn(name = "movieId")
    MovieDTO movie;

    @ManyToOne
    @MapsId("genreId")
    @JoinColumn(name = "genreId")
    GenreDTO genre;

    // GETTERS AND SETTERS

    public MovieGenreDTOPK getId() {
        return id;
    }

    public void setId(MovieGenreDTOPK id) {
        this.id = id;
    }
}
