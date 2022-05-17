package com.movieBlog.movieblog.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Actors")
public class ActorDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer actorId;
    private String fullName;
    private Character gender;

    // RELATIONS

    @OneToMany(mappedBy = "actor")
    List<MovieActorDTO> actors;

    // GETTERS AND SETTERS

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }
}
