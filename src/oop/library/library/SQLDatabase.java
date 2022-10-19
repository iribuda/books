package oop.library.library;

import oop.library.models.Book;
import oop.library.models.Magazine;
import oop.library.models.PrintEdition;
import oop.library.models.Workbook;

import java.util.ArrayList;

public class SQLDatabase extends Database{

    @Override
    public ArrayList<PrintEdition> loadItems() {
        ArrayList<PrintEdition> printEditions = new ArrayList<>();
        Book b1 = new Book("Gone With The Wind", "Margaret Mitchell", "Romance novel", 1037, 1936);
        Book b2 = new Book("Jane Eyre", "Charlotte Brontë", "Gothic romance", 400, 1847);
        Workbook wb1 = new Workbook("Artificial Intelligence", "Stuart J. Russel, Peter Norvig", "IT", 1000, 2016);
        Workbook wb2 = new Workbook("Machine Learning", "Kevin Murphy", "IT", 1000, 2012);
        Magazine m1 = new Magazine("Vogue", "Conde Nast", "Fashion", 100, 2022);
        Magazine m2 = new Magazine("Forbes", "Forbes", "Business", 150, 2022);

        printEditions.add(b1);
        printEditions.add(b2);
        printEditions.add(wb1);
        printEditions.add(wb2);
        printEditions.add(m1);
        printEditions.add(m2);

        return printEditions;
    }
}
