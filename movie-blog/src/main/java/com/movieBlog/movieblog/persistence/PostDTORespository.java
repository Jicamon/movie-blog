package com.movieBlog.movieblog.persistence;

import com.movieBlog.movieblog.persistence.crud.PostDTOCrudRespository;
import com.movieBlog.movieblog.persistence.entity.PostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public class PostDTORespository {
    @Autowired
    private PostDTOCrudRespository postDTOCrudRespository;

    private Optional<PostDTO> getByPostId(int postId){
        return postDTOCrudRespository.findById(postId);
    }

    private List<PostDTO> getAllByUserId(int userId){
        return postDTOCrudRespository.findAllByUserId(userId);
    }

    private List<PostDTO> getAllByCreationDate(LocalDateTime creationDate){
        return postDTOCrudRespository.findAllByCreationDate(creationDate);
    }

    private PostDTO save(PostDTO post){
        return postDTOCrudRespository.save(post);
    }
}
