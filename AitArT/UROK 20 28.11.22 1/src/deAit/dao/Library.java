package deAit.dao;

import deAit.data.Book;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
    }

    public boolean addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
            return true;
        }
        return false;
    }

    public boolean removeBook(Book book) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(book)) {
                books[i] = books[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public int search(Book book) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(book)) {
                return i;
            }
        }
        return -1;
    }

 /*   public void getBookByIndex(int index) {
        for (int i = 0; i < size; i++) {
            if (index == i) {
                System.out.println(i + " " + books[i]);
            }

        }
        if (index >= size) {
            System.out.println(index + " No Index");
        }
         }*/
public Book getBookByIndex(int index){
    for (int i = 0; i < size; i++) {
        if (i==index){
            return books[i];
                    }
    }
    return null;
}

            public void displayLibrary(){
            for (int i=0; i<size; i++){
                System.out.println(books[i]);
            }
        }

    }
