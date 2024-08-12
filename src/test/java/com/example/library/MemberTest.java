package com.example.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MemberTest {

    @Test
    public void testMemberCreation() {
        // create instance of Member
        Member mem = new Member("Justin", "Justin@yahoo.com");
        assertEquals("Justin", mem.getName(), "Should be Justin");
        assertEquals("Justin@yahoo.com", mem.getEmail(), "Should be Justin@yahoo.com");
        assertNotNull(mem.getNumberID(), "Should not be NULL");
    }

    @Test
    public void testBorrowItem() {
        // create item and member
        Member mem = new Member("Justin", "Justin@yahoo.com");
        Book book1 = new Book(9780451524935L, 328, "George Orwell", "1984", LocalDate.of(1949, 6, 8), "Dystopian", 5);
        // borrow book, then check quantity went down by 1
        mem.borrowItem(book1.getId());
        assertEquals(4, book1.getQuantity(), "Quantity should drop to 4.");
    }

    @Test
    public void testReturnItem() {
        Member mem = new Member("Justin", "Justin@yahoo.com");
        Book book1 = new Book(9780451524935L, 328, "George Orwell", "1984", LocalDate.of(1949, 6, 8), "Dystopian", 5);
        // borrow book, quant will drop to 4
        mem.borrowItem(book1.getId());
        // return book and check quantity back up to 5
        assertEquals(5, book1.getQuantity(), "Quantity should drop to 5.");

    }

    @Test
    public void testViewBorrowedList() {

    }

}
