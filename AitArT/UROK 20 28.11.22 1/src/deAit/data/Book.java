package deAit.data;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String title;
    private String[] author;
    private int isbn;
    private int  pages;
    private int years;

    public Book(String title, String[] author, int isbn, int pages, int years) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.years = years;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + Arrays.toString(author) +
                ", isbn=" + isbn +
                ", pages=" + pages +
                ", years=" + years +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn && pages == book.pages && years == book.years && title.equals(book.title) && Arrays.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, isbn, pages, years);
        result = 31 * result + Arrays.hashCode(author);
        return result;
    }
}
