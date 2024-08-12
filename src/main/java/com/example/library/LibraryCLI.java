package com.example.library;

import java.time.LocalDate;
import java.util.Scanner;

public class LibraryCLI {

    private Library library;
    private Scanner scnr;

    // DI Library for when Library creates an instance of this class
    public LibraryCLI(Library library) {
        this.library = library;
        scnr = new Scanner(System.in);
    }

    // method to display Menu Options
    public void start() {
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

    public void addBook() {

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
    }

    public void addMagazine() {

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

    public void addDVD() {

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

    public void addMember() {

        System.out.println("Enter member name: ");
        String name = scnr.nextLine();

        System.out.println("Enter member email: ");
        String email = scnr.nextLine();

        // create member
        Member member = new Member(name, email);
        // add member to library
        library.addMember(member);
    }

    public void viewInventory() {
        System.out.println(library.getName() + "'s inventory: ");
        library.viewAllItems();
    }

    public void searchByTitle() {
        System.out.println("Enter title: ");
        String title = scnr.nextLine();
        library.findItemByTitle(title);
    }

    public void searchMemberByID() {
        System.out.println("Enter Member's id: ");
        String id = scnr.nextLine();
        library.findMemberByID(id);
    }


    public void searchBookByISBN() {

    }

    public void searchMagazineByISSN() {

    }
}
