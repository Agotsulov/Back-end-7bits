package ru.sevenbits.practicethree;

import java.io.IOException;

public class Example {

    public int getLongestLineCharsCount(final FileReader fileReader) {
        int result = 0;
        while(fileReader.hasMoreLines()) {
            try {
                int buff = fileReader.readLine().length();
                if (buff > result) {
                    result = buff;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

}
