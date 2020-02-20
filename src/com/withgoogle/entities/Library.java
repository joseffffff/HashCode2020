package com.withgoogle.entities;

import java.util.List;

public class Library {

    private Integer numberOfBooks;
    private Integer signUpProcessDays;
    private Integer booksPerDay;

    private List<Integer> booksIndexes;

    public Library() {}

    public Integer getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(Integer numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public Integer getSignUpProcessDays() {
        return signUpProcessDays;
    }

    public void setSignUpProcessDays(Integer signUpProcessDays) {
        this.signUpProcessDays = signUpProcessDays;
    }

    public Integer getBooksPerDay() {
        return booksPerDay;
    }

    public void setBooksPerDay(Integer booksPerDay) {
        this.booksPerDay = booksPerDay;
    }

    public List<Integer> getBooksIndexes() {
        return booksIndexes;
    }

    public void setBooksIndexes(List<Integer> booksIndexes) {
        this.booksIndexes = booksIndexes;
    }

    @Override
    public String toString() {
        return "Library{" +
                "numberOfBooks=" + numberOfBooks +
                ", signUpProcessDays=" + signUpProcessDays +
                ", booksPerDay=" + booksPerDay +
                ", booksIndexes=" + booksIndexes +
                '}';
    }
}
