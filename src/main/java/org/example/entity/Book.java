package org.example.entity;

public final class Book extends LibraryItem{
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String author;
    public Book(int id, String title, int publicationYear, String author) {
        super(id, title, publicationYear);
        this.author = author;
    }

    @Override
    public String getDetails(){
        return "id: "+ super.getId()
                +", titre: "+super.getTitle()+
                ", Date de publication: "+super.getPublicationYear()+
                ", Nom de l'auteur: "+getAuthor();
    }
}
