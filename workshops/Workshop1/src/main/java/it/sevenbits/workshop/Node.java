package it.sevenbits.workshop;

public class Node {

    private Node next;
    private Node prev;

    private Matrix value;

    public Node(int r, int c) {
        value = new Matrix(r,c);
    }

    public Node(Matrix value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Matrix getValue() {
        return value;
    }

    public void setValue(Matrix value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
