package com.movieBlog.movieblog.persistence.entity;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "Movies")
public class MovieDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    private String title;

    private LocalTime duration;

    private Integer genreId;

    private Integer ratingId;

    // RELATIONS

    @OneToMany(mappedBy="movie")
    private List<PostDTO> posts;

    @ManyToOne
    @JoinColumn(name = "ratingId", insertable = false, updatable = false)
    private RatingDTO rating;

    @OneToMany(mappedBy = "movie")
    List<MovieGenreDTO> genresInMovie;

    @OneToMany(mappedBy = "movie")
    List<MovieActorDTO> actorsInMovie;

    // GETTERS AND SETTERS

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public Integer getRatingId() {
        return ratingId;
    }

    public void setRatingId(Integer ratingId) {
        this.ratingId = ratingId;
    }
}
