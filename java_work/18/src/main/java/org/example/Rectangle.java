package org.example;

public class Rectangle {
    int x;
    int y;
    int width;
    int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square() {
        int sq = width * height;
        return sq;
    }

    public void show() {
        System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
    }

    boolean contatins(int x, int y, int width, int height) {
        int xy = (x + width) * (y + height);
        int xy2 = (this.x + this.width) * (this.y + this.height);

        return true;
    }
}