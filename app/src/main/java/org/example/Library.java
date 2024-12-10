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

    public static List<Book> getBooks() {
        return books;
    }

    public static void setBooks(List<Book> books) {
        Library.books = books;
    }

    public static List<Patron> getPatrons() {
        return patrons;
    }

    public static void setPatrons(List<Patron> patrons) {
        Library.patrons = patrons;
    }

    //METHOD TO ADD BOOK
        public void addBook(Book book) {
             books.add(book);
        }

        //METHOD TO ADD PATRON
        public void addPatron(Patron patron) {
            patrons.add(patron);
        }

    //FIND BOOKS BY TITLE USING FOR EACH LOOP AND IF-ELSE FOR VALIDATION FOR BOOK TITLE
    public List<Book> findBookByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                foundBooks.add(book);
            }if (foundBooks.isEmpty()) {
                System.out.println("Cannot Find Book By Title");
            }

        }
        return foundBooks;
    }

    //FIND BOOKS BY AUTHOR USING FOR EACH LOOP AND IF-ELSE FOR VALIDATION OF AUTHOR NAME
    public List<Book> findBooksByAuthor(String Author){
            List<Book> foundBooks = new ArrayList<>();
            for (Book book : books) {
                if (book.getAuthor().equals(Author)){
                    foundBooks.add(book);
                }if (foundBooks.isEmpty()) {
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


