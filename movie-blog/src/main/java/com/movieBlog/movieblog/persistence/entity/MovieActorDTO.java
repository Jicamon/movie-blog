package com.movieBlog.movieblog.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "Movies_Actors")
public class MovieActorDTO {

    @EmbeddedId
    private MovieActorDTOPK id;

    // RELATIONS

    @ManyToOne
    @MapsId("movieId")
    @JoinColumn(name = "movieId")
    MovieDTO movie;

    @ManyToOne
    @MapsId("actorId")
    @JoinColumn(name = "actorId")
    GenreDTO actor;


    // GETTERS AND SETTERS

    public MovieActorDTOPK getId() {
        return id;
    }

    public void setId(MovieActorDTOPK id) {
        this.id = id;
    }
}
