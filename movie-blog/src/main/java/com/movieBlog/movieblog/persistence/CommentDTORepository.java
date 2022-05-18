package com.movieBlog.movieblog.persistence;

import com.movieBlog.movieblog.persistence.crud.CommentDTOCrudRepository;
import com.movieBlog.movieblog.persistence.entity.CommentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommentDTORepository {
    @Autowired
    private CommentDTOCrudRepository commentDTOCrudRepository;

    public List<CommentDTO> getAll(){
        return (List<CommentDTO>) commentDTOCrudRepository.findAll();
    }

    public List<CommentDTO> getByCommentId(int commentId){
        return commentDTOCrudRepository.findByCommentId(commentId);
    }

    public List<CommentDTO> getByPostId(int postId){
        return commentDTOCrudRepository.findByPostId(postId);
    }

    public List<CommentDTO> getByUserId(int userId){
        return commentDTOCrudRepository.findByUserId(userId);
    }

    public CommentDTO save(CommentDTO comment){
        return commentDTOCrudRepository.save(comment);
    }
}
