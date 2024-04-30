package edu.dio.collections.list.book;

import java.util.ArrayList;
import java.util.List;

public class CatalogBook {
    private List<Book> books;

    public CatalogBook() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String writer, int publication) {
        books.add(new Book(title, writer, publication));
    }

    public List<Book> searchWriter(String writer) {
        List<Book> booksPerWriter = new ArrayList<>();

        if(!books.isEmpty()) {
            for (Book book : books) {
                if(book.getWriter().equalsIgnoreCase(writer)) {
                    booksPerWriter.add(book);
                }
            }
        }

        return booksPerWriter;
    }

    public List<Book> searchPublication(int start, int end) {
        List<Book> booksPerPublication = new ArrayList<>();

        if(!books.isEmpty()) {
            for (Book book : books) {
                if(book.getPublication() >= start && book.getPublication() <= end) {
                    booksPerPublication.add(book);
                }
            }
        }

        return booksPerPublication;
    }

    public Book searchTitle(String title) {
        Book bookTitle = null;

        if(!books.isEmpty()) {
            for (Book book : books) {
                if(book.getTitle().equalsIgnoreCase(title)) {
                    bookTitle = book;
                    break;
                }
            }
        }

        return bookTitle;
    }

    public static void main(String[] args) {
        CatalogBook catalogBook = new CatalogBook();

        catalogBook.addBook("Livro 1", "Autor 1", 2000);
        catalogBook.addBook("Livro 2", "Autor 2", 2001);
        catalogBook.addBook("Livro 3", "Autor 3", 2001);
        catalogBook.addBook("Livro 4", "Autor 4", 2000);
        catalogBook.addBook("Livro 5", "Autor 3", 2003);
        catalogBook.addBook("Livro 6", "Autor 1", 2004);
        catalogBook.addBook("Livro 7", "Autor 1", 2000);
        catalogBook.addBook("Livro 8", "Autor 2", 2002);
        catalogBook.addBook("Livro 9", "Autor 1", 2002);
        catalogBook.addBook("Livro 10", "Autor 4", 2003);

        System.out.println(catalogBook.searchWriter("Autor 1"));
        System.out.println(catalogBook.searchTitle("Livro 1"));
        System.out.println(catalogBook.searchPublication(2000, 2002));
    }
}
