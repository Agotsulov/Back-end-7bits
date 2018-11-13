package ru.sevenbits.practicethree;

import java.io.*;

public class Main {

    public static void main(final String [] args){
        File file = new File("MyHomework3.txt");
        try {
            file.createNewFile();

            InputStream in = new FileInputStream(new File("Homework3.txt"));

            byte[] d = in.readAllBytes();

            in.close();

            OutputStream out = new FileOutputStream(file);

            out.write(d);
            out.write("Александр Гоцулов".getBytes());

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
