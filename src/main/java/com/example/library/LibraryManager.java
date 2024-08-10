package com.example.library;

import java.time.LocalDate;
import java.util.Scanner;

public class LibraryManager {
    public static void main (String[] args) {
        Library lib = new Library();
        Book book1 = new Book(9780451524935L, 328, "George Orwell", "1984", LocalDate.of(1949, 6, 8), "Dystopian", 5);
        Book book2 = new Book(9780061120084L, 336, "Harper Lee", "To Kill a Mockingbird", LocalDate.of(1960, 7, 11), "Fiction", 3);
        Book book3 = new Book(9780743273565L, 180, "F. Scott Fitzgerald", "The Great Gatsby", LocalDate.of(1925, 4, 10), "Classic", 7);
        Book book4 = new Book(9781503280786L, 720, "Herman Melville", "Moby Dick", LocalDate.of(1851, 11, 14), "Adventure", 4);
        Book book5 = new Book(9781503290563L, 279, "Jane Austen", "Pride and Prejudice", LocalDate.of(1813, 1, 28), "Romance", 6);
        lib.addItem(book1);
        lib.addItem(book2);
        lib.addItem(book3);
        lib.addItem(book4);
        lib.addItem(book5);
        Member member1 = new Member("Alice Johnson", "alice@example.com");
        Member member2 = new Member("Bob Smith", "bob@example.com");
        Member member3 = new Member("Charlie Davis", "charlie@example.com");
        Member member4 = new Member("Diana Evans", "diana@example.com");
        Member member5 = new Member("Evan Green", "evan@example.com");
        lib.addMember(member1);
        lib.addMember(member2);
        lib.addMember(member3);
        lib.addMember(member4);
        lib.addMember(member5);

        Scanner scnr = new Scanner(System.in);
        System.out.println("What would you like to do:?");
        int input = scnr.nextInt();
    }
}
