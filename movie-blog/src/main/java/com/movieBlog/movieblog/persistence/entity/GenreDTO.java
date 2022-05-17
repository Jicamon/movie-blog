package com.movieBlog.movieblog.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Genres")
public class GenreDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer genreId;

    private String description;

    public Integer getGenreId() {
        return genreId;
    }

    // RELATIONS

    @OneToMany(mappedBy = "genre")
    List<MovieGenreDTO> genres;

    // GETTERS AND SETTERS

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
