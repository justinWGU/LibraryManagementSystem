package com.example.library;

import java.time.LocalDate;

public class DVD extends LibraryItem {

    // fields
    private String director;
    private double duration;

    // constructors
    public DVD(String director, double duration, String title, LocalDate publicationDate, String genre, int quantity) {
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
    }
    // setters
    public void setDirector(String director) {
        this.director = director;
    }
    public void setDuration(double duration) {
        this.duration = duration;
    }

    // getters
    public String getDirector() {
        return director;
    }
    public double getDuration() {
        return duration;
    }
}
