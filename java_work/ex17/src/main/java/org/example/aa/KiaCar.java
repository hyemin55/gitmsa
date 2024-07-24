package org.example.aa;

import lombok.ToString;

@ToString
public class KiaCar extends Car {

    public KiaCar(String name, String desc, String company){
        this.name=name;
        super.desc=desc;
        super.company=company;
    }
    public void show() {
        System.out.println(
                name + " " +
                        desc + " " +
                        company);
    }
}
