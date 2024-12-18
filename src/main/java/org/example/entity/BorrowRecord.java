package org.example.entity;

import java.util.ArrayList;
import java.util.List;

/*
    public record BorrowRecord(int itemId, String borrowerName, String borrowDate){}
 */


public class BorrowRecord {
    List<LibraryItem> borrowedItems;

    public BorrowRecord() {
        borrowedItems = new ArrayList<LibraryItem>();
    }

    public BorrowRecord(List<LibraryItem> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }

    public void addItem(LibraryItem item) {
        borrowedItems.add(item);
        System.out.println("Added to borrow: " +item.getDetails());
    }

    public boolean removeItemById(int id) {
        return borrowedItems.removeIf(item -> item.getId() == id);
    }

    public void displayAllItems() {
        if (borrowedItems.isEmpty()) {
            System.out.println("No items borrowed.");
        } else {
            System.out.println("Borrowed items: ");
            for (LibraryItem item : borrowedItems) {
                System.out.println( item.getId() +" " + item.getDetails());
            }
        }
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }
}
