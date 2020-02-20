package com.withgoogle.entities;

import java.util.List;

public class DataSet {

    private Integer books;
    private Integer numberOfLibraries;
    private Integer daysForScanning;

    private List<Integer> bookScores;

    private List<Library> libraries;

    public DataSet() {}

    public Integer getBooks() {
        return books;
    }

    public void setBooks(Integer books) {
        this.books = books;
    }

    public Integer getNumberOfLibraries() {
        return numberOfLibraries;
    }

    public void setNumberOfLibraries(Integer numberOfLibraries) {
        this.numberOfLibraries = numberOfLibraries;
    }

    public Integer getDaysForScanning() {
        return daysForScanning;
    }

    public void setDaysForScanning(Integer daysForScanning) {
        this.daysForScanning = daysForScanning;
    }

    public List<Integer> getBookScores() {
        return bookScores;
    }

    public void setBookScores(List<Integer> bookScores) {
        this.bookScores = bookScores;
    }

    public List<Library> getLibraries() {
        return libraries;
    }

    public void setLibraries(List<Library> libraries) {
        this.libraries = libraries;
    }

    @Override
    public String toString() {
        return "DataSet{" +
                "books=" + books +
                ", numberOfLibraries=" + numberOfLibraries +
                ", daysForScanning=" + daysForScanning +
                ", bookScores=" + bookScores +
                ", libraries=" + libraries +
                '}';
    }
}
