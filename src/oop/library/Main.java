package oop.library;

import oop.library.library.Database;
import oop.library.library.Library;
import oop.library.library.SQLDatabase;
import oop.library.models.Book;
import oop.library.models.Magazine;
import oop.library.models.PrintEdition;
import oop.library.models.Workbook;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        Database db = new SQLDatabase();
        Library library = new Library(db);
        for (PrintEdition printEdition: library.getPrintEditions()){
            System.out.println(printEdition.toString());
        }
    }
}
