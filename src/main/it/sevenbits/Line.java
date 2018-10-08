package main.it.sevenbits;

import java.util.Objects;

public class Line {

    private Point first;
    private Point second;

    private int length; //А никто не говорил что она должна быть не целая.

    public Line(Point first, Point second) {
        this.first = first;
        this.second = second;

        length = (int) Math.sqrt(Math.pow(first.getX() - second.getX(),2) + Math.pow(first.getY() - second.getY(),2));
    }


    public int length(){
        return length;
    }

    public Point getFirst() {
        return first;
    }

    public Point getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(first, line.first) &&
                Objects.equals(second, line.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
