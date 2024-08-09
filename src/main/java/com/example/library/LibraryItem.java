package com.example.library;

import java.time.LocalDate;
import java.util.UUID;

public abstract class LibraryItem {
    // fields
    private String title;
    private LocalDate publicationDate;
    private String genre;
    private int quantity;
    private final String id;

    // constructor
    public LibraryItem(String title, LocalDate publicationDate, String genre, int quantity) {
        this.title = title;
        this.publicationDate = publicationDate;
        this.genre = genre;
        this.quantity = quantity;
        this.id = UUID.randomUUID().toString();
    }

    // borrow & return functions
    public boolean borrowItem() {
        if (quantity > 0) {
            quantity--;
            return true;
        }
        return false;
    }
    public boolean returnItem() {
        quantity++;
        return true;
    }

    // abstract functions
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

    // setters
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

    public String getId() {
        return id;
    }
}