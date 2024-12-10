package org.example;


public class Patron {
    private final String FullName;
    private final String PatronID;



    public Patron(String fullName, String patronID) {
        FullName = fullName;
        PatronID = patronID;
    }

    public String getFullName() {
        return FullName;
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
