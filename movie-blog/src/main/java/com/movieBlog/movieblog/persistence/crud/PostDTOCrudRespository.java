package com.movieBlog.movieblog.persistence.crud;

import com.movieBlog.movieblog.persistence.entity.PostDTO;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PostDTOCrudRespository extends CrudRepository<PostDTO, Integer> {
    List<PostDTO> findAllByUserId(int userId);
    List<PostDTO> findAllByCreationDate(LocalDateTime creationDate);
}
