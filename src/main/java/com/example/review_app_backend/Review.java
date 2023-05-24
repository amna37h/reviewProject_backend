package com.example.review_app_backend;

public class Review {

    private int review_id;
    private int book_id;
    private String username;
    private String user_review;
    private int review_rate;

    public void setReview_id(int review_id) {
        this.review_id = review_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUser_review(String user_review) {
        this.user_review = user_review;
    }

    public void setReview_rate(int review_rate) {
        this.review_rate = review_rate;
    }

    public int getReview_id() {
        return review_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public String getUsername() {
        return username;
    }

    public String getUser_review() {
        return user_review;
    }

    public int getReview_rate() {
        return review_rate;
    }

}
