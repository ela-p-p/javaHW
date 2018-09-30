package MealTracker

import java.lang.Math;

class Tracker {
    private double sideLength;
    private final static int SIDES = 4;

    Tracker(double sideLength) { this.sideLength = sideLength; }

    double area() { return (this.sideLength * this.sideLength);}

    static int getSides () { return SIDES; }
    double getHeight () { return this.sideLength; }
}