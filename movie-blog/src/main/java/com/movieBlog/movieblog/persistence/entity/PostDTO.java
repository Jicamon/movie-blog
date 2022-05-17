package com.movieBlog.movieblog.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Posts")
public class PostDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;
    private Integer userId;
    private Integer movieId;
    private String title;
    private String description;
    private LocalDateTime creationDate;
    private Integer likeCount;
    private Integer dislikeCount;

    // RELATIONS

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private UserDTO user;

    @ManyToOne
    @JoinColumn(name = "movieId", insertable = false, updatable = false)
    private MovieDTO movie;

    @OneToMany(mappedBy="post")
    private List<CommentDTO> comments;

    // GETTERS AND SETTERS
    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getDislikeCount() {
        return dislikeCount;
    }

    public void setDislikeCount(Integer dislikeCount) {
        this.dislikeCount = dislikeCount;
    }
}
