package oop.library.models;

public class Book extends PrintEdition implements CanBeVoiced{
    public Book(String title, String author, String genre, int pages, int year) {
        super(title, author, genre, pages, year);
    }

    @Override
    public void voiceBook() {
        System.out.printf("Voicing of %s by %s starts ...\n", getTitle(), getAuthor());
    }
}
