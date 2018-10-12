package it.sevenbits.workshop;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.println(matrix.toString());

        matrix.inverseMatrix();
        System.out.println(matrix.toString());



        DoubleEndedQueue doubleEndedQueue = new DoubleEndedQueue();

        doubleEndedQueue.addFirst(new Node(10,10));
        doubleEndedQueue.addFirst(new Node(1,1));
        doubleEndedQueue.addFirst(new Node(6,3));
        doubleEndedQueue.addLast(new Node(6,3));
        doubleEndedQueue.addLast(new Node(6,3));
        doubleEndedQueue.addLast(new Node(6,3));

        System.out.println(doubleEndedQueue.toString());
    }
}
