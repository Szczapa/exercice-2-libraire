package org.example;

import org.example.entity.*;

import java.util.List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        Library library = new Library();
        BorrowRecord borrowRecord = new BorrowRecord();

        initSystem(library, borrowRecord);

        Scanner scanner = new Scanner(System.in);
        while (running) {
            System.out.println("\n1. Look all library product:");
            System.out.println("2. Borrow Product");
            System.out.println("3. Add Book");
            System.out.println("4. Add Magazine");
            System.out.println("5. Get Borrowed items");
            System.out.println("6. Quit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    library.displayAllItems();
                    break;
                case 2:
                    borrowProduct(borrowRecord, library);
                    break;
                case 3:
                    addBook(library);
                    break;
                case 4:
                    addMagazine(library);
                    break;
                case 5:
                    borrowedProduct(borrowRecord, library);
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
        scanner.close();
    }

    public static void initSystem(Library library, BorrowRecord borrowRecord) {
        Book book = new Book(setId(library), "toto", 1994, "robert");
        library.addItem(book);

        Book book1 = new Book(setId(library), "tata", 1995, "robert");
        library.addItem(book1);
        borrowRecord.addItem(book1);

        Magazine magazine = new Magazine(setId(library), "le super magazine", 2024, 12);
        library.addItem(magazine);
    }

    public static void borrowedProduct(BorrowRecord borrowRecord, Library library) {
        List<LibraryItem> borrowedItems = borrowRecord.getBorrowedItems();
        for (LibraryItem item : borrowedItems) {
            System.out.println(item.getDetails());
        }
    }

    public static void borrowProduct(BorrowRecord borrowRecord, Library library) {
        List<LibraryItem> libraryItems = library.getLibraryItems();
        List<LibraryItem> borrowedItems = borrowRecord.getBorrowedItems();

        if (libraryItems.isEmpty()) {
            System.out.println("Library is empty");
            return;
        }

        System.out.println("Available library products for borrowing:");

        for (LibraryItem item : libraryItems) {
            if (!borrowedItems.contains(item)) {
                System.out.println(item.getDetails());
            }
        }
    }

    public static void addBook(Library library) {
        int id = setId(library);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the book: ");
        String name = scanner.nextLine();
        System.out.println("Please enter publication year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Author");
        String author = scanner.nextLine();
        Book book = new Book(id, name, year, author);
        library.addItem(book);

    }

    public static void addMagazine(Library library) {
        int id = setId(library);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the Magazine: ");
        String name = scanner.nextLine();
        System.out.println("Please enter publication year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("issue Number");
        int issueNumber = scanner.nextInt();
        scanner.nextLine();
        Magazine magazine = new Magazine(id, name, year, issueNumber);
        library.addItem(magazine);

    }

    public static int setId(Library library) {
        return library.ItemsLength() + 1;
    }
}