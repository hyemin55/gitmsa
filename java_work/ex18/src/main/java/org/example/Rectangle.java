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
//        System.out.printf("(%d,%d)에서 크기가 %d x %d인 사각형\n",x,y,width,height);
    }

    public boolean contains(Rectangle r) {
        if ((r.x > x) && (r.y > y) && ((r.width - r.x) < (width - x)) && ((r.height - r.y) < (height - y))) {
            return true;
        }
        return false;
    }
}
        for(int j=0;j<i;j++)
int a = (int) a[j].studentID
            if(studentID==a)