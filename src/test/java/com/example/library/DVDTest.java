package com.example.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DVDTest {

    @Test
    public void testDVDCreation() {

        // create DVD instance
        DVD dvd = new DVD("Christopher Nolan", 148.0, "Inception", LocalDate.of(2000, 12, 10), "Sci-Fi", 5);

        // write tests
        assertEquals("Christopher Nolan", dvd.getDirector(), "Should be \"Christopher Nolan\"");
        assertEquals(148.0, dvd.getDuration(), "Should be 148.0");
        assertEquals("Inception", dvd.getTitle(), "Should be Inception");
        assertEquals(LocalDate.of(2000, 12, 10), dvd.getPublicationDate(), "Should be 2000-12-10");
        assertEquals("Sci-Fi", dvd.getGenre(), "Should be \"Sci-Fi\"");
        assertEquals(5, dvd.getQuantity(), "Should be 5");
    }
}
