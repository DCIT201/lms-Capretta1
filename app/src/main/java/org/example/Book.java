package org.example;

public class Book {

    private String Title;
    private String Author;
    private int YearPublished;


    public Book() {
    }

    public Book(String title, String author, int yearPublished) {
        Title = title;
        Author = author;
        YearPublished = yearPublished;

    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getYearPublished() {
        return YearPublished;
    }

    public void setYearPublished(int yearPublished) {
        YearPublished = yearPublished;
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
