package org.example;

public class Book {

    private final String Title;
    private final String Author;
    private final int YearPublished;




    public Book(String title, String author, int yearPublished) {
        Title = title;
        Author = author;
        YearPublished = yearPublished;

    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getYearPublished() {
        return YearPublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", YearPublished=" + YearPublished +
                 '\'' +
                '}';
    }
}
