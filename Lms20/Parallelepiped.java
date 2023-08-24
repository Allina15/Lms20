package Lms20;

import java.util.Scanner;

public class Parallelepiped {
    private double length;
    private double width;
    private double height;

    public Parallelepiped() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateSurfaceArea() {
        return 2 * ((height * length) + (length * width) + (height * width));
    }

    public double calculateVolume() {
        return length * width * height;
    }
}

