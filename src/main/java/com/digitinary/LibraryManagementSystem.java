package com.digitinary;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new Book(1, "java basics", 2017));
        library.addBook(new Book(2, "data structure", 2018));
        library.addBook(new Book(3, "collections", 2019));
        library.addBook(new Book(1, "java basics", 2017));

        System.out.println("All books (with duplicates):");
        library.displayBooks();

        // Remove duplicates
        library.removeDuplicates();
        System.out.println("\nUnique books:");
        library.displayBooks();

        // Search
        System.out.println("\nSearch Book with ID 2:");
        System.out.println(library.searchBookById(2));

        // Update
        System.out.println("\nUpdating Book ID 2...");
        library.updateBook(2, "Advanced Data Structures", 2022);
        library.displayBooks();

        // Delete
        System.out.println("\nDeleting Book ID 3...");
        library.deleteBook(3);
        library.displayBooks();

        // Queue
        System.out.println("\nQueue Management:");
        library.addPersonToQueue("Alice");
        library.addPersonToQueue("Bob");
        library.servePersonFromQueue();
        library.servePersonFromQueue();

        // Double-ended queue
        System.out.println("\nDouble-Ended Queue:");
        library.addPersonFront("Charlie");
        library.addPersonBack("Diana");
        library.addPersonFront("Eve");
        library.showDoubleEndedQueue();

        // Sorting
        System.out.println("\nBooks sorted by Title:");
        library.displaySortedByTitle();

        System.out.println("\nBooks sorted by Year (newest to oldest):");
        library.displaySortedByYear();

        System.out.println("\nBooks sorted by ID:");
        library.displaySortedById();

    }
}
