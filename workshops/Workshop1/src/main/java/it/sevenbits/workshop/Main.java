package it.sevenbits.workshop;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.println(matrix.toString());

        matrix.inverseMatrix();
        System.out.println(matrix.toString());


        DoubleEndedQueue doubleEndedQueue = new DoubleEndedQueue();

        doubleEndedQueue.addFirst(new Matrix(10,10));
        doubleEndedQueue.addFirst(new Matrix(1,1));
        doubleEndedQueue.addFirst(new Matrix(6,3));
        doubleEndedQueue.addLast(new Matrix(6,3));
        doubleEndedQueue.addLast(new Matrix(7,7));
        doubleEndedQueue.addLast(new Matrix(6,3));

        System.out.println(doubleEndedQueue.toString());
    }
}
