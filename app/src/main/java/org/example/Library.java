package org.example;
import java.util.ArrayList;
import java.util.List;
public class Library {
        private static List<Book> books;
        private static List<Patron> patrons;

        public Library() {
            books = new ArrayList<>();
            patrons = new ArrayList<>();
        }

        //METHOD TO ADD BOOK
        public Book addBook(Book book) {
             books.add(book);
            return book;
        }

        //METHOD TO ADD PATRON
        public Patron addPatron(Patron patron) {
            patrons.add(patron);
            return patron;
        }

    //FIND BOOKS BY TITLE USING FOR EACH LOOP AND IF-ELSE FOR VALIDATION FOR BOOK TITLE
    public static List<Book> findBookByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                foundBooks.add(book);
            }else {
                System.out.println("Cannot Find Book By Title");
            }
        }
        return foundBooks;
    }

    //FIND BOOKS BY AUTHOR USING FOR EACH LOOP AND IF-ELSE FOR VALIDATION OF AUTHOR NAME
    public static List<Book> findBooksByAuthor(String Author)throws Exception {
            List<Book> foundBooks = new ArrayList<>();
            for (Book book : books) {
                if (book.getAuthor().equals(Author)){
                    foundBooks.add(book);
                }else {
                    System.out.println("Cannot Find Book By Author");
                }
            }
            return foundBooks;
        }

        @Override
        public String toString() {
            return "Library{" +
                    "books=" + books +
                    ", patrons=" + patrons +
                    '}';
        }
    }


