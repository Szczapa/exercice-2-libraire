package org.example.entity;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> libraryItems;

        public Library() {
        this.libraryItems = new ArrayList<>();
    }

    public Library(List<LibraryItem> libraryItems) {
        this.libraryItems = new ArrayList<>(libraryItems);
    }

    public void displayAllItems() {
        if (libraryItems.isEmpty()) {
            System.out.println("The library has no items.");
        } else {
            System.out.println("Library Items:");
            for (LibraryItem item : libraryItems) {
                System.out.println(item.getDetails());
            }
        }
    }

    public int ItemsLength() {
        return libraryItems.size();
    }

    public void addItem(LibraryItem item) {
        libraryItems.add(item);
        System.out.println("Added to library: " + item.getDetails());
    }

    public boolean removeItemById(int id) {
        return libraryItems.removeIf(item -> item.getId() == id);
    }

    public List<LibraryItem> getLibraryItems() {
        return libraryItems;
    }
}
