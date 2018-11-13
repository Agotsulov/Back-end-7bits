package ru.sevenbits.practicethree;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {

    private BufferedReader reader;

    private boolean hasMoreLines;
    private int line;
    private String filename;

    private String current;

    public FileReader(final String filename) {
        try {
            reader = new BufferedReader(new java.io.FileReader(filename));
            this.filename = filename;
            line = 0;
            current = reader.readLine();
            hasMoreLines = current != null;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String readLine() throws IOException {
        StringBuilder result = new StringBuilder();
        if (hasMoreLines) {
            result.append(filename);
            result.append(' ');
            result.append(line);
            result.append(' ');
            result.append(current);
            line++;
            if ((current = reader.readLine()) == null) {
                hasMoreLines = false;
            }
            return result.toString();
        }
        return null;
    }

    boolean hasMoreLines() {
        return hasMoreLines;
    }

}
