package com.withgoogle;

import com.withgoogle.entities.DataSet;
import com.withgoogle.io.Reader;

import java.io.IOException;

public class Main {

    private static final String A_EXAMPLE = "inputs/a_example.txt";
    private static final String B_READ_ON = "inputs/b_read_on.txt";
    private static final String C_INCUNABULA = "inputs/c_incunabula.txt";
    private static final String D_TOUGH_CHOICES = "inputs/d_tough_choices.txt";
    private static final String E_SO_MANY_BOOKS = "inputs/e_so_many_books.txt";
    private static final String F_LIBRARIES_OF_THE_WORLD = "inputs/f_libraries_of_the_world.txt";

    public static Reader reader = new Reader();

    public static void main(String[] args) throws IOException {

        DataSet dataSet = reader.read(A_EXAMPLE);

        System.out.println(dataSet);
    }
}
