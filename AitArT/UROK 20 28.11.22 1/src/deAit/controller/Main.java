package deAit.controller;

import deAit.dao.Library;
import deAit.data.Book;

public class Main {
    public static void main(String[] args) {
        String[] authors1 = {"Karl Marx", "Frindrich Engels"};
        String[] authors2 = {"Lev Tolstoi"};
        String[] authors3 = {"Ilya Ilf", "Evgenii Petroff"};


        Book b1 = new Book("Kapital", authors1, 2341234, 350, 1867);
        Book b2 = new Book("War and Pease", authors2, 3423421, 1050, 1869);
        Book b3 = new Book("12 chairs", authors3, 3412342, 123, 1927);

        Library myLib = new Library(20);
        myLib.addBook(b1);
        myLib.addBook(b2);
        myLib.addBook(b3);

        myLib.displayLibrary();
        System.out.println("********************");

        myLib.removeBook(b1);
        myLib.displayLibrary();
        myLib.addBook(b1);
        System.out.println("***************");
        myLib.displayLibrary();
        System.out.println("***************");
        System.out.println(myLib.search(b2) + "___" + b2.toString());
        System.out.println("***************");
        System.out.println("Homework");
        int a = 0;
        System.out.println(myLib.getBookByIndex(a));

        Library myLib2 = new Library(100);
        myLib2.addBook(b3);
        myLib2.addBook(b2);
        int b = 0;
        System.out.println(myLib2.getBookByIndex(b));


    }
}