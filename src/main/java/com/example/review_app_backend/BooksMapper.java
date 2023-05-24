package com.example.review_app_backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class BooksMapper implements RowMapper<Books> {

    @Override
    public Books mapRow(ResultSet rs, int rowNum) throws SQLException {
        Books item = new Books();
        item.setBook_ID(rs.getInt("Book_ID"));
        item.setBook_name(rs.getString("Book_name"));
        item.setBook_Image(rs.getString("Book_Image"));
        item.setBook_description(rs.getString("Book_description"));

        return item;
    }

}
