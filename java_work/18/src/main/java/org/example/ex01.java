package org.example;

import org.example.friend.CompFriend;
import org.example.friend.UniFriend;

import java.util.Arrays;

public class ex01 {
    public static void main(String[] args) {
        UniFriend unifriend[] = new UniFriend[10];
        CompFriend compfriend[] = new CompFriend[10];

        int ucnt = 0;
        int ccnt = 0;

        unifriend[ucnt++] = new UniFriend("홍길동", "010-1234-5678", "히히");

//        System.out.println(Arrays.toString(unifriend));
//        System.out.println(Arrays.toString(compfriend));

        for (int i = 0; i < ucnt; i++) {
            unifriend[i].showInfo();
        }

        for (int i = 0; i < ccnt; i++) {
            compfriend[i].showInfo();

        }
    }
}
