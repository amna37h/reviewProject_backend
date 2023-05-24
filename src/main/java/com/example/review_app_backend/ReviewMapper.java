package com.example.review_app_backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ReviewMapper implements RowMapper<Review> {

    @Override
    public Review mapRow(ResultSet rs, int rowNum) throws SQLException {
        Review item = new Review();
        item.setReview_id(rs.getInt("review_id"));
        item.setBook_id(rs.getInt("book_id"));
        item.setReview_rate(rs.getInt("review_rate"));
        item.setUser_review(rs.getString("user_review"));
        item.setUsername(rs.getString("username"));

        return item;
    }

}
