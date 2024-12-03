package org.example.entity;

public abstract class LibraryItem {
    private int id;
    private String title;
    private int publicationYear;

    public LibraryItem(int id, String title, int publicationYear) {
        this.id = id;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getDetails() {
        return "titre"+title+"publicationYear"+publicationYear;
    }
}
