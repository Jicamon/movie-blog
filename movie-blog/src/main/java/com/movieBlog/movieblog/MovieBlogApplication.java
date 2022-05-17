package com.movieBlog.movieblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MovieBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieBlogApplication.class, args);
	}

}
