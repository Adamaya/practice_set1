package oop_mod2_questions.collection_class.ques2;

import java.util.LinkedList;
import java.util.Scanner;

class Book {
    private String author;
    private String bookName;
    private int isbn;
    private double price;

    public Book(String author, String bookName, int isbn, double price) {
        this.author = author;
        this.bookName = bookName;
        this.isbn = isbn;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", isbn=" + isbn +
                ", price=" + price +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Book> linkedList = new LinkedList<>();
        int numberOfBooks = scanner.nextInt();
        for (int i = 0; i < numberOfBooks; i++) {
            String author = scanner.nextLine();
            String bookName = scanner.nextLine();
            int isbn = scanner.nextInt();
            double price = scanner.nextInt();
            Book book = new Book(author, bookName, isbn, price);
            linkedList.add(book);
        }
        System.out.println(linkedList.indexOf("a"));


    }
}
