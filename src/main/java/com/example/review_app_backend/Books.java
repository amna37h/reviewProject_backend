package com.example.review_app_backend;

public class Books {

    private int Book_ID;
    private String Book_name;
    private String Book_Image;
    private String Book_description;

    public int getBook_ID() {
        return Book_ID;
    }

    public void setBook_ID(int book_ID) {
        Book_ID = book_ID;
    }

    public String getBook_name() {
        return Book_name;
    }

    public void setBook_name(String book_name) {
        Book_name = book_name;
    }

    public String getBook_Image() {
        return Book_Image;
    }

    public void setBook_Image(String book_Image) {
        Book_Image = book_Image;
    }

    public String getBook_description() {
        return Book_description;
    }

    public void setBook_description(String book_description) {
        Book_description = book_description;
    }

}
