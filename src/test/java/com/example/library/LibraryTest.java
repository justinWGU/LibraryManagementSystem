package com.example.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    @Test
    public void testLibraryDefaultConstructor() {
        // create instance of Library using both constructs
        Library lib = new Library("Main Library");
        assertEquals("Main Library", lib.getName(), "Should be 'Main Library'");
    }

    @Test
    public void testConstructorWithNameParam() {
        Library lib2 = new Library();
        lib2.setName("Ontario Library");
        assertEquals("Ontario Library", lib2.getName(), "Should be 'Ontario Library");
    }
    @Test
    public void testAddItem() {

    }

    @Test
    public void testRemoveItem() {

    }

    @Test
    public void testAddMember() {

    }

    @Test
    public void testRemoveMember() {

    }

    @Test
    public void testFindItemByTitle() {

    }


    @Test
    public void testFindMemberById() {

    }

    @Test
    public void testViewAllItems() {

    }

    @Test
    public void testViewAllMembers() {

    }
}
