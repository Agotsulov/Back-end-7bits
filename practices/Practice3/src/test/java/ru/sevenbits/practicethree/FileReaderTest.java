package ru.sevenbits.practicethree;

import java.io.IOException;

import static org.junit.Assert.*;

public class FileReaderTest {

    @org.junit.Test
    public void testReadLine() {
        FileReader fileReader = new FileReader("MyHomework3.txt");
        String expect = "MyHomework3.txt 0 ./\n" +
                "MyHomework3.txt 1 ../\n" +
                "MyHomework3.txt 2 Homework3.txt\n" +
                "MyHomework3.txt 3 А ларчик просто открывался\n" +
                "MyHomework3.txt 4 Александр Гоцулов\n";
        StringBuilder actual = new StringBuilder();
        while(fileReader.hasMoreLines()) {
            try {
                actual.append(fileReader.readLine());
                actual.append("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        assertEquals(expect, actual.toString());
    }
}