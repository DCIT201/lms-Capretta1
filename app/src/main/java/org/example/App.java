/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public static void main(String[] args) {

        //CREATING OBJECT FOR BOOK CLASS
        Book book = new Book("1984", "George Orwell", 1949);

        //CREATING OBJECT FOR PATRON CLASS
        Patron pt = new Patron("Bless Kofi", "22040340");

        //CREATING OBJECT FOR THE LIBRARY CLASS
        Library lb = new Library();

        //THIS ADDS THE BOOKS TO THE LIBRARY
        lb.addBook(book);

        //THIS ADDS PATRONS TO THE LIBRARY
        lb.addPatron(pt);

        System.out.println(lb.findBookByTitle("1984"));
        System.out.println(lb.findBooksByAuthor("George Orwell"));


    }
}
