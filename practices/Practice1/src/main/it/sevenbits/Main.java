package main.it.sevenbits;

public class Main {

    public static void main(String[] args) {
        Line lines[] = new Line[10];

        lines[0] = new Line(new Point(0,0),new Point(-1 ,18));
        lines[1] = new Line(new Point(0,0),new Point(10 ,10));
        lines[2] = new Line(new Point(-1,-12),new Point(0 ,10));
        lines[3] = new Line(new Point(1,1),new Point(1 ,1));
        lines[4] = new Line(new Point(8,8),new Point(9 ,9));
        lines[5] = new Line(new Point(12,0),new Point(120 ,10));
        lines[6] = new Line(new Point(0,0),new Point(-8 ,7));
        lines[7] = new Line(new Point(0,5),new Point(10 ,10));
        lines[8] = new Line(new Point(3,0),new Point(10 ,10));
        lines[9] = new Line(new Point(1,1),new Point(1 ,0));

        int max = 0;
        for (int i = 0;i < lines.length;i++) {
            if(lines[i].length() > max)
                max = lines[i].length();
            System.out.println("Отрезок[" + i + "]" + lines[i].length());
        }
        System.out.println("Максимальная:" + max);
    }

}
