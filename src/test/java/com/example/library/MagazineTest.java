package com.example.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagazineTest {

    @Test
    public void testMagazineCreation() {

        // instantiate Magazine
        Magazine mag = new Magazine(123456789, 42, "Jane Doe", "Tech Today", LocalDate.of(2024, 8, 1), "Technology", 5);

        // write tests
        assertEquals(123456789, mag.getISSN(), "Should be 123456789");
        assertEquals(42, mag.getIssueNum(), "Should be 42");
        assertEquals("Jane Doe", mag.getEditor(), "Should be Jane Doe");
        assertEquals("Tech Today", mag.getTitle(), "Should be Tech Today");
        assertEquals(LocalDate.of(2024, 8, 1), mag.getPublicationDate(), "Should be 2024-08-01");
        assertEquals("Technology", mag.getGenre(), "Should be Technology");
        assertEquals(5, mag.getQuantity(), "Should be 5");
    }
}
