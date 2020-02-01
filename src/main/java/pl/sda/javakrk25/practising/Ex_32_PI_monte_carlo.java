package pl.sda.javakrk25.practising;

import java.util.Random;

public class Ex_32_PI_monte_carlo {


    /**
     * Oblicz przyblizenie liczby PI
     *
     * @param args
     */
    public static void main(String[] args) {

        long iloscProb = 0;
        long iloscTrafien = 0;
        Random r = new Random();
        Point center = new Point(1, 1);
        while (true) {
            Point p = getRandomPoint(r);
            if (distance(p, center) <= 1) {
                iloscTrafien++;
            }
            iloscProb++;
            if (iloscProb % 10000000 == 0) {
                System.out.println(calculatePI(iloscProb, iloscTrafien));
            }
        }
    }

    public static double calculatePI(long iloscProb, long iloscTrafien) {
        return 4.0 * iloscTrafien / iloscProb;
    }

    public static Point getRandomPoint(Random r) {
        return new Point(r.nextDouble() * 2, r.nextDouble() * 2);
    }

    public static double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
    }

    static class Point {
        double x, y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}
