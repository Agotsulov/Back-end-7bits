package sevenbits.workshopthree.first;

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        FileScanner fileScanner = new FileScanner();

        Scanner scanner = new Scanner(System.in);

        String filename = scanner.next();
        String dirname = scanner.next();

        fileScanner.scan(filename, dirname);
    }

}
