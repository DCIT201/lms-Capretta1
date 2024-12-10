package org.example;


public class Patron {
    private String FullName;
    private String PatronID;

    public Patron() {
    }

    public Patron(String fullName, String patronID) {
        FullName = fullName;
        PatronID = patronID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPatronID() {
        return PatronID;
    }

    @Override
    public String toString() {
        return "Patron{" +
                "FullName='" + FullName + '\'' +
                ", PatronID='" + PatronID + '\'' +
                '}';
    }

}
