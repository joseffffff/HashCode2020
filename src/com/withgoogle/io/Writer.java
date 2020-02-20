package com.withgoogle.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public boolean writeResult() {

        try {
            File file = new File("result.out");
            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write("");

            fileWriter.close();

            return true;
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
}
