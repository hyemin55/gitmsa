package org.example;

public class Sum {
    int a = 3500;
    int b = 3000;
    int c = 3100;
    int d = 3300;
    int e = 3400;
    int f = 3800;
    int g = 2900;
    int h = 3600;
    int total = 0;



    public int total(int a, int b, int c, int d, int e, int f, int g, int h) {
        total =
                (this.a * a) + (this.b * b) +
                        (this.c * c) + (this.d * d) +
                        (this.e * e) + (this.f * f) +
                        (this.g * g) + (this.h * h);
        return total;
    }
}
