package oop.library.models;

public class Magazine extends PrintEdition implements HasPics{

    public Magazine(String title, String author, String genre, int pages, int year) {
        super(title, author, genre, pages, year);
    }

    @Override
    public void lookAtPics() {
        System.out.printf("Looking at the pic of magazine %s by %s\n", getTitle(), getAuthor());
    }
}
