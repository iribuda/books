package oop.library.library;

import oop.library.models.PrintEdition;

import java.util.ArrayList;

public class Library {

    private Database database;
    private ArrayList<PrintEdition> printEditions;

    public Library(Database database) {
        this.database = database;
        this.printEditions = database.loadItems();
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public ArrayList<PrintEdition> getPrintEditions() {
        return printEditions;
    }

    public void setPrintEditions(ArrayList<PrintEdition> printEditions) {
        this.printEditions = printEditions;
    }
}
