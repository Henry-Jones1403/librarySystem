package com.company.functions;

public class bookObjects {

    private String bookTitle;
    private int ISBN;
    private String author;
    private String genre;


    public bookObjects(String bookTitle,int ISBN, String genre, String author){
        this.bookTitle = bookTitle;
        this.ISBN = ISBN;
        this.author = author;
        this.genre = genre;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
