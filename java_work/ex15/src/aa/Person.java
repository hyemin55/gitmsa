package aa;

public class Person {

    private String jumin;
    private String passport;

    public Person() {
    }

    public Person(String jumin) {
        this.jumin = jumin;
    }

    public Person(String jumin, String passport) {
//        아래 두가지는 같은 값이 출력된다.
//        public Person(String jumin) 를 호출해 this.jumin = jumin;을 땡겨오는 방법.
//        this.jumin = jumin;
        this(jumin);

        this.passport = passport;

    }

    @Override
    public String toString() {
        return "Person{" +
                "jumin='" + jumin + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }

    public void show(){
        System.out.println("jumin = "+jumin);
        System.out.println("passport = "+passport);
    }
}
