package deAit.Modes;

public class Book {
// 1 package controller & model
// Model
// Books
// -> Class Book
// String title
// int isbn
// String author
// int years
// int pages
// Constructor 2 разных
// Getters and Setters
// Display

// Class - ArrayBookTools -> метод выводит на консоль массив книг

    // Contoller -> Main
// 5 Создаете 5 разных книг
    private String title;
    private String author;
    private String isbn;
    private int years;
    private int pages;

    public void displayBooks() {
        System.out.println("Tittle " + title);
        System.out.println("Author " + author);
        System.out.println("ISBN is " + isbn);
        System.out.println("Years " + years);
        System.out.println("Pages " + pages);
    }
    public Book(String title, String author, String isbn, int years, int pages){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.years=years;
        this.pages=pages;
    }

    public void setTitle(String title){this.title=title;}
    public void setAuthor(String author){this.author=author;}
    public void setIsbn(String isbn){this.isbn=isbn;}
    public void setYears(int years){this.years=years;}
    public void setPages(int pages){this.pages=pages;}

    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public String getIsbn(){return isbn;}
    public int getYears(){return years;}
    public int getPages() {return pages;}

}