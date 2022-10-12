package oop.library.models;

public class Workbook extends PrintEdition implements HasNotes{
    public Workbook(String title, String author, String genre, int pages, int year) {
        super(title, author, genre, pages, year);
    }

    @Override
    public void takeNotes() {
        System.out.printf("Take note from %s by %s\n", getTitle(), getAuthor());
    }
}
