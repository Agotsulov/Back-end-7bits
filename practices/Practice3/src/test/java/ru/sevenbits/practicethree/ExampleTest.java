package ru.sevenbits.practicethree;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExampleTest {

    @Test
    public void testGetLongestLineCharsCountFirst() throws IOException {
        FileReader fileReader = mock(FileReader.class);
        when(fileReader.readLine()).thenReturn("a.txt 10 aaaaa",
                "a.txt 10 aaaaa",
                "a.txt 10 aaagfasfhbfdgaaaa",
                "a.txt 10000 agdhasdhaaaaa");
        when(fileReader.hasMoreLines()).thenReturn(true, true, true, true, false);
        assertEquals(26, new Example().getLongestLineCharsCount(fileReader));
    }


    @Test
    public void testGetLongestLineCharsCountSecond() throws IOException {
        FileReader fileReader = mock(FileReader.class);
        when(fileReader.readLine()).thenReturn("");
        when(fileReader.hasMoreLines()).thenReturn(true,  false);
        assertEquals(0, new Example().getLongestLineCharsCount(fileReader));
    }
}