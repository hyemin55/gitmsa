package org.example;

// comparable compareTo 사용해야한다.
// person 클래스를 배열로 가져오게 되면


// 생성자 getter setter ToString
public class Person implements Comparable {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
//        System.out.println("this = "+this);
//        System.out.println("this.age = "+this.age);
//        System.out.println("Person(o) = "+(Person)o);
//        System.out.println(((Person)o).age);

//        아래 if구문과 return에 -를 사용하는 두가지 출력방법이 있다.
//        main에서 Arrays.sort를 사용해 정렬을 해놓고 1 = 오름차순, -1 = 내림차순
//        if (this.age > ((Person) o).age) {
//            return 1;
//        } else if (this.age < ((Person) o).age) {
//            return -1;
//        } else {
//            return 0;
//        }

//        내림차순으로 출력
        return ((Person)o).age - this.age;

//        오름차순으로 출력
//        return this.age - ((Person)o).age;
    }
}

