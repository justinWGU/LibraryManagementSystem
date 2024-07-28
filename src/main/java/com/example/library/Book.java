package com.example.library;

import java.util.Date;

public class Book extends LibraryItem {

    private int ISBN;
    private int numPages;
    private String author;

    public Book(int ISBN, int numPages, String author, String title, Date publicationDate, String genre, int quantity) {
        super(title, publicationDate,genre, quantity);
        this.ISBN = ISBN;
        this.numPages = numPages;
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + getTitle() + "Author: " + author + "Genre: " + getGenre());
    }
}
