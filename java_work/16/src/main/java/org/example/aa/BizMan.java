package org.example.aa;

//extends(상속) Man은 Man클래스를 부모클래스로 지정하고
//BizMan은 자식클래스가 된다.
public class BizMan extends Man {

    private String company;
    private String position;

    public BizMan(String name, String company, String position) {

//        super 는 부모클래스의 name을 호출한다.
        super(name);
        this.company = company;
        this.position = position;

    }

    public void showInfo() {
        System.out.println("company = " + company);
        System.out.println("position = " + position);

        tellInfo();
    }
}
