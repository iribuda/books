package oop.library;

import oop.library.models.Book;
import oop.library.models.Magazine;
import oop.library.models.PrintEdition;
import oop.library.models.Workbook;

public class Main {
    public static void main(String[] args) {
        PrintEdition b1 = new Book("Gone With The Wind", "Margaret Mitchell", "Romance novel", 1037, 1936);
        PrintEdition b2 = new Book("Jane Eyre", "Charlotte Brontë", "Gothic romance", 400, 1847);
        PrintEdition wb1 = new Workbook("Artificial Intelligence", "Stuart J. Russel, Peter Norvig", "IT", 1000, 2016);
        PrintEdition wb2 = new Workbook("Machine Learning", "Kevin Murphy", "IT", 1000, 2012);
        PrintEdition m1 = new Magazine("Vogue", "Conde Nast", "Fashion", 100, 2022);
        PrintEdition m2 = new Magazine("Forbes", "Forbes", "Business", 150, 2022);


    }
}
