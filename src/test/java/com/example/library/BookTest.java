package com.example.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    @Test
    public void testBookCreation() {
        // create date to test book class pub date
        LocalDate pubDate = LocalDate.of(1960, 7, 11);
        // create book class
        Book book = new Book(2345678901L, 281, "Harper Lee", "To Kill a Mockingbird", pubDate, "Fiction", 5);
        assertEquals(2345678901L, book.getISBN(), "Should be 2345678901");
        assertEquals(281, book.getNumPages(), "Should be 281");
        assertEquals("Harper Lee", book.getAuthor(), "Should be Harper Lee");
        assertEquals("To Kill a Mockingbird", book.getTitle(), "Should be To Kill a Mockingbird");
        assertEquals(pubDate, book.getPublicationDate(), "Should be 1960-07-11");
        assertEquals("Fiction", book.getGenre(), "Should be Fiction");
        assertEquals(5, book.getQuantity(), "Should be 5");

    }
}
