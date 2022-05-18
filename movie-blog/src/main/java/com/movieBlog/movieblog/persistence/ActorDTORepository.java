package com.movieBlog.movieblog.persistence;

import com.movieBlog.movieblog.persistence.crud.ActorDTOCrudRepository;
import com.movieBlog.movieblog.persistence.entity.ActorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ActorDTORepository {
    @Autowired
    private ActorDTOCrudRepository actorDTOCrudRepository;

    private Optional<ActorDTO> getByActorId(int actorId){
        return actorDTOCrudRepository.findById(actorId);
    }

    private ActorDTO save (ActorDTO actor){
        return actorDTOCrudRepository.save(actor);
    }
}
