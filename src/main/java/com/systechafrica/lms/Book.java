package com.systechafrica.lms;

public class Book {
    int isbnNo;
    String title;

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

    public Book(int isbnNo, String title) {
        this.isbnNo = isbnNo;
        this.title = title;
    }

    public Book() {
    }
    
}
