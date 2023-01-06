package deAit.controller;

import deAit.ArrTools.ArrTools;
import deAit.Modes.Book;
import deAit.Modes.Magazin;

public class Main {
    public static void main(String[] args) {
        Book b1= new Book("Идиот", "Федор Достоевский", "978-5-17-1464844", 1899,640);
        Book b2= new Book("Эксклюзив: Русская классика", "Максим Горький", "978-5-17-114313-8", 1920,320);
        Book b3= new Book("Империализм, как высшая стадия капитализма", "Владимир Ленин", "978-5-04-162480-4", 1930, 192);
        Book b4= new Book("Война и Мир", "Лев Толстой", "978-5-17-118103-1", 1900, 1360);
        b1.setYears(2022);


        Book[] booksArray= new Book[5];
        booksArray[0]=b1;
        booksArray[1]=b2;
        booksArray[2]=b3;
        booksArray[3]=b4;
        ArrTools.printArray(booksArray);
        Magazin m1 = new Magazin("Sport today", 55, 66, 1985);

        System.out.println(m1.toString());



    }
}