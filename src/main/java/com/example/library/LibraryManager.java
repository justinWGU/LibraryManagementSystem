package com.example.library;

import java.time.LocalDate;
import java.util.Scanner;

public class LibraryManager {
    public static void main (String[] args) {
        Library lib = new Library();
        LibraryCLI libraryCLI = new LibraryCLI(lib);
        libraryCLI.start();
        /*Magazine magazine1 = new Magazine(123456, 202, "John Doe", "Tech Today", LocalDate.of(2024, 8, 1), "Technology", 20);
        Magazine magazine2 = new Magazine(789012, 103, "Jane Smith", "Fashion Weekly", LocalDate.of(2024, 7, 15), "Fashion", 15);
        Magazine magazine3 = new Magazine(345678, 215, "Alice Johnson", "Home & Garden", LocalDate.of(2024, 6, 10), "Lifestyle", 12);
        Magazine magazine4 = new Magazine(901234, 322, "Robert Brown", "Sports Monthly", LocalDate.of(2024, 8, 20), "Sports", 18);
        Magazine magazine5 = new Magazine(567890, 411, "Emily Davis", "Travel Explorer", LocalDate.of(2024, 5, 25), "Travel", 10);
        lib.addItem(magazine1);
        lib.addItem(magazine2);
        lib.addItem(magazine3);
        lib.addItem(magazine4);
        lib.addItem(magazine5);
        DVD dvd1 = new DVD("Steven Spielberg", 120.5, "Jurassic Park", LocalDate.of(1993, 6, 11), "Adventure", 10);
        DVD dvd2 = new DVD("James Cameron", 137.0, "Titanic", LocalDate.of(1997, 12, 19), "Romance", 8);
        DVD dvd3 = new DVD("Christopher Nolan", 148.0, "Inception", LocalDate.of(2010, 7, 16), "Sci-Fi", 12);
        DVD dvd4 = new DVD("Ridley Scott", 117.0, "Gladiator", LocalDate.of(2000, 5, 5), "Action", 7);
        DVD dvd5 = new DVD("Peter Jackson", 201.0, "The Lord of the Rings: The Return of the King", LocalDate.of(2003, 12, 17), "Fantasy", 15);
        lib.addItem(dvd1);
        lib.addItem(dvd2);
        lib.addItem(dvd3);
        lib.addItem(dvd4);
        lib.addItem(dvd5);
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
        lib.viewAllItems();*/

    }
}
