package edu.dio.collections.list.book;

/**
 * Book
 */
public class Book {
    private String title;
    private String writer;
    private int publication;
    
    public Book(String title, String writer, int publication) {
        this.title = title;
        this.writer = writer;
        this.publication = publication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPublication() {
        return publication;
    }

    public void setPublication(int publication) {
        this.publication = publication;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", writer=" + writer + ", publication=" + publication + "]";
    }
}