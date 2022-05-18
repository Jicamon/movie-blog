package com.movieBlog.movieblog.persistence.crud;

import com.movieBlog.movieblog.persistence.entity.CommentDTO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentDTOCrudRepository extends CrudRepository<CommentDTO, Integer> {
    //@Query(value = "SELECT * FROM Comments WHERE commentId = ?", nativeQuery = true)
    List<CommentDTO> findByCommentId(int commentId);
    List<CommentDTO> findByPostId(int postId);
    List<CommentDTO> findByUserId(int userId);
}
