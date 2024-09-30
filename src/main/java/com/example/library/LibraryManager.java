package com.example.library;


public class LibraryManager {
    public static void main (String[] args) {

        // lib class to inject into lib cli
        Library lib = new Library();

        // call bootstrap method

        // UI class
        LibraryCLI libraryCLI = new LibraryCLI(lib);

        // initializes sample data and starts the UI
        libraryCLI.start();
    }
}
