package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfCircles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstC = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        double x1 = firstC[0];
        double y1 = firstC[1];
        double radius1 = firstC[2];

        int[] secondC = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        double x2 = secondC[0];
        double y2 = secondC[1];
        int radius2 = secondC[2];
        Point p1 = new Point();
        p1.x = x1;
        p1.y = y1;
        Point p2 = new Point();
        p2.x = x2;
        p2.y = y2;

        int d = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 -y1, 2));

        if(d <= radius1 + radius2){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

    public static class Point {
        private double x;
        private double y;


        public double getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
