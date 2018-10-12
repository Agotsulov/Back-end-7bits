package it.sevenbits.workshop;

public class DoubleEndedQueue {

    private Node first;
    private Node last;

    public DoubleEndedQueue() {
        first = null;
        last = null;
    }

    public Node getFirst(){
        return first;
    }

    public Node getLast(){
        return last;
    }

    private boolean checkEmpty(Node node){
        if((first == null) && (last == null)){
            first = node;
            first.setPrev(node);
            first.setNext(node);
            last = node;
            last.setPrev(node);
            last.setNext(node);
            return true;
        }
        return false;
    }

    public void addFirst(Node node){
        if(node == null)
            return;

        if(checkEmpty(node))
            return;

        node.setNext(first);
        first.setPrev(node);
        first = node;

    }

    public void addLast(Node node){
        if(node == null)
            return;

        if(checkEmpty(node))
            return;

        node.setPrev(last);
        last.setNext(node);
        last = node;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        if(last != null) {
            Node curr = first;
            while (curr != last) {
                sb.append("-----------\n");
                sb.append(curr.toString());
                curr = curr.getNext();
            }
            sb.append("-----------\n");
            sb.append(last.toString());
        }

        return sb.toString();
    }
}
