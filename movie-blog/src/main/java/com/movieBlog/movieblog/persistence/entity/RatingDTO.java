package com.movieBlog.movieblog.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Ratings")
public class RatingDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ratingId;
    private String abbreviation;
    private String description;

    // RELATIONS

    @OneToMany(mappedBy = "rating")
    private List<MovieDTO> movies;


    // GETTERS AND SETTERS

    public Integer getRatingId() {
        return ratingId;
    }

    public void setRatingId(Integer ratingId) {
        this.ratingId = ratingId;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
