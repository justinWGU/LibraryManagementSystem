package com.example.library;

import java.time.LocalDate;

public abstract class LibraryItem {
    // fields
    private String title;
    private LocalDate publicationDate;
    private String genre;
    private int quantity;

    // constructor
    public LibraryItem(String title, LocalDate publicationDate, String genre, int quantity) {
        this.title = title;
        this.publicationDate = publicationDate;
        this.genre = genre;
        this.quantity = quantity;
    }

    // abstract function
    public abstract void displayInfo();

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return publicationDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}