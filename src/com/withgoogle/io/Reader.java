package com.withgoogle.io;

import com.withgoogle.entities.DataSet;
import com.withgoogle.entities.Library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Reader {

    public DataSet read(String filePath) throws IOException {
        DataSet dataSet = new DataSet();

        File file = new File(filePath);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String[] firstLine = br.readLine().split(" ");

        dataSet.setBooks(Integer.parseInt(firstLine[0]));
        dataSet.setNumberOfLibraries(Integer.parseInt(firstLine[1]));
        dataSet.setDaysForScanning(Integer.parseInt(firstLine[2]));

        String[] secondLine = br.readLine().split(" ");
        List<String> listSecondLine = Arrays.asList(secondLine);

        dataSet.setBookScores(
                listSecondLine.stream()
                        .map(Integer::parseInt)
                        .collect(Collectors.toList())
        );

        String line = null;
        List<Library> libraryList = new ArrayList<>();

        while ((line = br.readLine()) != null && !line.equals("")) {

            String[] splittedLine = line.split(" ");

            Library library = new Library();
            library.setNumberOfBooks(Integer.parseInt(splittedLine[0]));
            library.setSignUpProcessDays(Integer.parseInt(splittedLine[1]));
            library.setBooksPerDay(Integer.parseInt(splittedLine[2]));

            String[] splittedSecondLine = br.readLine().split(" ");
            List<String> librarySecondLine = Arrays.asList(splittedSecondLine);

            library.setBooksIndexes(
                    librarySecondLine.stream()
                            .map(Integer::parseInt)
                            .collect(Collectors.toList())
            );

            libraryList.add(library);
        }

        dataSet.setLibraries(libraryList);

        br.close();

        return dataSet;
    }
}
