package com.systechafrica.assignments.lms;

public class Book {
    private int isbnNo;
    private String title;

    public Book() {
    }

    public Book(int isbnNo, String title) {
        this.isbnNo = isbnNo;
        this.title = title;
    }
    
    public int getIsbnNo() {
        return isbnNo;
    }
    public void setIsbnNo(int isbnNo) {
        this.isbnNo = isbnNo;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    
    
}
