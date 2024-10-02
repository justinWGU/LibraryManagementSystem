package com.example.library;

import java.time.LocalDate;
import java.time.LocalTime;

public class DVD extends LibraryItem {

    // fields
    private String director;
    private LocalTime duration;

    // constructors
    public DVD(String director, LocalTime duration, String title, LocalDate publicationDate, String genre, int quantity) {
        super(title, publicationDate, genre, quantity);
        this.director = director;
        this.duration = duration;
    }
    // methods
    @Override
    public void displayInfo() {
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration);
        super.displayInfo();
        System.out.println();
    }
    // setters
    public void setDirector(String director) {
        this.director = director;
    }
    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    // getters
    public String getDirector() {
        return director;
    }
    public LocalTime getDuration() {
        return duration;
    }
}
