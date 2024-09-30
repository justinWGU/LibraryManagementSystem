package com.example.library;

import java.time.LocalDate;

public class Book extends LibraryItem {

    private long ISBN;
    private int numPages;
    private String author;

    public Book(long ISBN, int numPages, String author, String title, LocalDate publicationDate, String genre, int quantity) {
        super(title, publicationDate,genre, quantity);
        this.ISBN = ISBN;
        this.numPages = numPages;
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        super.displayInfo();
        System.out.println("Number of pages: " + numPages);
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
