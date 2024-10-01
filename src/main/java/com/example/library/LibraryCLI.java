package com.example.library;

import java.time.LocalDate;
import java.util.Scanner;

public class LibraryCLI {

    private final Library library;
    private final Scanner scnr;

    // DI Library for when Library creates an instance of this class
    public LibraryCLI(Library library) {
        this.library = library;
        scnr = new Scanner(System.in);
    }

    // Display menu Options
    public void start() {

        // call bootstrap data
        bootStrap();

        // call appropriate prompt method
        System.out.println("Enter your role: (Admin or Member)");
        String role = scnr.next();
        if (role.equalsIgnoreCase("ADMIN")) {
            // call admin prompt
            adminPrompt();
        }
        else if (role.equalsIgnoreCase("MEMBER")) {
            // call mem prompt
            memberPrompt();
        }
        else {
            System.out.println("Incorrect response.");
        }
    }

    private void adminPrompt() {

        // method test print statement
        System.out.println("Adin prompt works!");

        // continue displaying options until exited
        boolean running = true;
        while(running) {
            System.out.println("Please choose from the following options: ");
            System.out.println("1. Add a Book");
            System.out.println("2. Add a Magazine");
            System.out.println("3. Add a DVD");
            System.out.println("4. Add a new Member");
            System.out.println("5. View entire inventory");
            System.out.println("6. Search for Item by title");
            System.out.println("7. Search for Book by ISBN");
            System.out.println("8. Search for Magazine by ISSN");
            System.out.println("9. Search for Member by ID");
            System.out.println("0. EXIT");

            int input = scnr.nextInt();
            scnr.nextLine();

            // switch case to handle user input
            switch (input) {
                case 1:
                    addBook();
                    break;
                case 2:
                    addMagazine();
                    break;
                case 3:
                    addDVD();
                    break;
                case 4:
                    addMember();
                    break;
                case 5:
                    viewInventory();
                    break;
                case 6:
                    searchByTitle();
                    break;
                case 7:
                    searchBookByISBN();
                    break;
                case 8:
                    searchMagazineByISSN();
                    break;
                case 9:
                    searchMemberByID();
                    break;
                case 0:
                    System.out.println("EXITED");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid input. Please enter one of the following options:");
            }
        }
    }

    private void memberPrompt() {

        // method test print statement
        System.out.println("Member prompt works!");

        // continue displaying options until exited
        boolean running = true;
        while(running) {
            System.out.println("Please choose from the following options: ");
            System.out.println("1. Manage Profile");
            System.out.println("2. View Borrowed Items");
            System.out.println("3. Return items");
            System.out.println("4. Search items");
            System.out.println("0. EXIT");

            int input = scnr.nextInt();
            scnr.nextLine();

            // switch case to handle user input
            switch (input) {
                case 1:
                    addBook();
                    break;
                case 2:
                    addMagazine();
                    break;
                case 3:
                    addDVD();
                    break;
                case 4:
                    addMember();
                    break;
                case 5:
                    viewInventory();
                    break;
                case 6:
                    searchByTitle();
                    break;
                case 7:
                    searchBookByISBN();
                    break;
                case 8:
                    searchMagazineByISSN();
                    break;
                case 9:
                    searchMemberByID();
                    break;
                case 0:
                    System.out.println("EXITED");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid input. Please enter one of the following options:");
            }
        }
    }

    private void addBook() {

        System.out.println("Enter book's ISBN: ");
        long isbn = scnr.nextLong();
        scnr.nextLine(); // consumes white space

        System.out.println("Enter title: ");
        String title = scnr.nextLine();

        System.out.println("Enter author: ");
        String author = scnr.nextLine();

        System.out.println("Enter number of pages: ");
        int numPages = scnr.nextInt();
        scnr.nextLine();

        System.out.println("Enter publication date (yyyy-mm-dd): ");
        LocalDate pubDate = LocalDate.parse(scnr.nextLine()); // parse the date entered in parseable format

        System.out.println("Enter genre: ");
        String genre = scnr.nextLine();

        System.out.println("Enter quantity: ");
        int quantity = scnr.nextInt();

        // create book from user input
        LibraryItem item = new Book(isbn, numPages, author, title, pubDate, genre, quantity);

        // add book to library
        library.addItem(item);
//        Book book = new Book(
//                9780134685991L,                  // ISBN
//                850,                             // Number of pages
//                "Joshua Bloch",                   // Author
//                "Effective Java",                 // Title
//                LocalDate.of(2018, 1, 6),         // Publication date
//                "Programming",                    // Genre
//                10                                // Quantity in stock
//        );

        System.out.println("Successfully added book with the following details: ");
        //book.displayInfo();
        item.displayInfo();
    }

    private void addMagazine() {

        System.out.println("Enter Magazine's ISSN: ");
        long issn = scnr.nextLong();
        scnr.nextLine(); // consumes white space

        System.out.println("Enter Issue number: ");
        int issueNum = scnr.nextInt();
        scnr.nextLine();

        System.out.println("Enter editor: ");
        String editor = scnr.nextLine();

        System.out.println("Enter title: ");
        String title = scnr.nextLine();

        System.out.println("Enter publication date (yyyy-mm-dd): ");
        LocalDate pubDate = LocalDate.parse(scnr.nextLine()); // parse the date entered in parseable format

        System.out.println("Enter genre: ");
        String genre = scnr.nextLine();

        System.out.println("Enter quantity: ");
        int quantity = scnr.nextInt();

        // create magazine from user input
        LibraryItem magazine = new Magazine(issn, issueNum, editor, title, pubDate, genre, quantity);
        // add magazine to library
        library.addItem(magazine);
    }

    private void addDVD() {

        // String director, double duration, String title, LocalDate publicationDate, String genre, int quantity
        System.out.println("Enter DVD's directory: ");
        String director = scnr.nextLine();

        System.out.println("Enter title: ");
        String title = scnr.nextLine();

        System.out.println("Enter DVD duration: ");
        double duration = scnr.nextDouble();

        System.out.println("Enter publication date (yyyy-mm-dd): ");
        LocalDate pubDate = LocalDate.parse(scnr.nextLine()); // parse the date entered in parseable format

        System.out.println("Enter genre: ");
        String genre = scnr.nextLine();

        System.out.println("Enter quantity: ");
        int quantity = scnr.nextInt();

        // create DVD
        LibraryItem dvd = new DVD(director, duration, title, pubDate, genre, quantity);
        // add dvd to library
        library.addItem(dvd);
    }

    private void addMember() {

        System.out.println("Enter member name: ");
        String name = scnr.nextLine();

        System.out.println("Enter member email: ");
        String email = scnr.nextLine();

        // create member
        Member member = new Member(name, email);

        // add member to library
        library.addMember(member);
    }

    private void viewInventory() {
        System.out.println(library.getName() + "'s inventory: ");
        library.viewAllItems();
    }

    private void searchByTitle() {
        System.out.println("Enter title: ");
        String title = scnr.nextLine();
        library.findItemByTitle(title);
    }

    private void searchMemberByID() {
        System.out.println("Enter Member's id: ");
        String id = scnr.nextLine();
        library.findMemberByID(id);
    }

    private void searchBookByISBN() {

    }

    private void searchMagazineByISSN() {

    }

    // bootstrap data
    private void bootStrap() {

        // add magazines
        Magazine magazine1 = new Magazine(123456, 202, "John Doe", "Tech Today", LocalDate.of(2024, 8, 1), "Technology", 20);
        Magazine magazine2 = new Magazine(789012, 103, "Jane Smith", "Fashion Weekly", LocalDate.of(2024, 7, 15), "Fashion", 15);
        Magazine magazine3 = new Magazine(345678, 215, "Alice Johnson", "Home & Garden", LocalDate.of(2024, 6, 10), "Lifestyle", 12);
        Magazine magazine4 = new Magazine(901234, 322, "Robert Brown", "Sports Monthly", LocalDate.of(2024, 8, 20), "Sports", 18);
        Magazine magazine5 = new Magazine(567890, 411, "Emily Davis", "Travel Explorer", LocalDate.of(2024, 5, 25), "Travel", 10);
        library.addItem(magazine1);
        library.addItem(magazine2);
        library.addItem(magazine3);
        library.addItem(magazine4);
        library.addItem(magazine5);

        // add dvds
        DVD dvd1 = new DVD("Steven Spielberg", 120.5, "Jurassic Park", LocalDate.of(1993, 6, 11), "Adventure", 10);
        DVD dvd2 = new DVD("James Cameron", 137.0, "Titanic", LocalDate.of(1997, 12, 19), "Romance", 8);
        DVD dvd3 = new DVD("Christopher Nolan", 148.0, "Inception", LocalDate.of(2010, 7, 16), "Sci-Fi", 12);
        DVD dvd4 = new DVD("Ridley Scott", 117.0, "Gladiator", LocalDate.of(2000, 5, 5), "Action", 7);
        DVD dvd5 = new DVD("Peter Jackson", 201.0, "The Lord of the Rings: The Return of the King", LocalDate.of(2003, 12, 17), "Fantasy", 15);
        library.addItem(dvd1);
        library.addItem(dvd2);
        library.addItem(dvd3);
        library.addItem(dvd4);
        library.addItem(dvd5);

        // add books
        Book book1 = new Book(9780451524935L, 328, "George Orwell", "1984", LocalDate.of(1949, 6, 8), "Dystopian", 5);
        Book book2 = new Book(9780061120084L, 336, "Harper Lee", "To Kill a Mockingbird", LocalDate.of(1960, 7, 11), "Fiction", 3);
        Book book3 = new Book(9780743273565L, 180, "F. Scott Fitzgerald", "The Great Gatsby", LocalDate.of(1925, 4, 10), "Classic", 7);
        Book book4 = new Book(9781503280786L, 720, "Herman Melville", "Moby Dick", LocalDate.of(1851, 11, 14), "Adventure", 4);
        Book book5 = new Book(9781503290563L, 279, "Jane Austen", "Pride and Prejudice", LocalDate.of(1813, 1, 28), "Romance", 6);
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);
        library.addItem(book4);
        library.addItem(book5);

        // add mems
        Member member1 = new Member("Alice Johnson", "alice@example.com");
        Member member2 = new Member("Bob Smith", "bob@example.com");
        Member member3 = new Member("Charlie Davis", "charlie@example.com");
        Member member4 = new Member("Diana Evans", "diana@example.com");
        Member member5 = new Member("Evan Green", "evan@example.com");
        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);
        library.addMember(member4);
        library.addMember(member5);

        // confirm method works
        System.out.println("Bootstrap method works!");
    }
}
