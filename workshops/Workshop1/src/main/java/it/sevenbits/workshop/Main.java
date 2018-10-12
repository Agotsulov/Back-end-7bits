package it.sevenbits.workshop;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(10, 8);
        System.out.println(matrix.toString());

        matrix.inverseMatrix();
        System.out.println(matrix.toString());

    }
}
