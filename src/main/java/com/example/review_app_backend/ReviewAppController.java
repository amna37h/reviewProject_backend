package com.example.review_app_backend;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

@RestController
@CrossOrigin(origins = "*")

public class ReviewAppController {
    @Autowired
    JdbcTemplate jdbc;

    @RequestMapping(path = "/addReview", method = RequestMethod.POST)
    public String storeData(@RequestBody JsonNode requestData) throws IOException {
        System.out.println(requestData);

        String username = requestData.path("username").asText();
        System.out.println(username);

        String content = requestData.path("reviewContent").asText();
        System.out.println(content);

        int rating = requestData.path("rating").asInt();
        System.out.println(rating);

        int id = 4;

        String sql = "INSERT INTO `sys`.`eibfs_bookreview_reviews` (`book_id`, `username`, `user_review`, `review_rate`) VALUES (?, ?, ?, ?)";
        jdbc.update(sql, id, username, content, rating);

        return requestData.toString();
    }

    @RequestMapping(path = "/reviews", method = RequestMethod.GET)
    public List<Review> getAllReviews() throws IOException {
        String sql = "SELECT * FROM eibfs_bookreview_reviews";

        List<Review> items = jdbc.query(sql, new ReviewMapper());
        return items;

    }

    @RequestMapping(path = "/books", method = RequestMethod.GET)
    public List<Books> getAllBooks() throws IOException {
        String sql = "SELECT * FROM eibfs_bookreview_booksdetail";

        List<Books> items = jdbc.query(sql, new BooksMapper());
        return items;

    }

}
