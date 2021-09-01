package algorithm.problem.inflearnKimTaeWon.sortingandsearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            return this.y - o.y;
        } else {
            return this.x - o.x;
        }
    }
}

public class CoordinateAlignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Point> p = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            p.add(new Point(x, y));
        }

        Collections.sort(p);
        for (int i = 0; i < n; i++) {
            Point temp = p.get(i);
            System.out.print(temp.x + " ");
            System.out.println(temp.y);
        }
    }
}

