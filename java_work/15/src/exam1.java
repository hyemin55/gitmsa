/*
1. Student 클래스를 작성하는 연습을 해보도록하자.
    Student 클래스에 getTotal() getAverage() 과 를 추가하시오
    1. :  getTotal 메서드
    기 능 국어 영어 수학 의 점수를 모두 더해서 반환한다 :
        (kor), (eng), (math) .
        반환타입 : int
        매개변수 없음 :
    2. : getAverage 메서드
    기 능 총점 국어점수 영어점수 수학점수 을 과목수로 나눈 평균을 구한다 : ( + + ) .
    소수점 둘째자리에서 반올림할 것.
    반환타입 : float
    매개변수 없음
 */
class Student {
    int kor;
    int eng;
    int math;
    int [] c ={kor,eng,math};


    public Student() {
    }

    public Student(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal() {
        int total = kor + eng + math;
        return total;
    }

    public float getAverage() {

        float a = (float) (kor + eng + math) / c.length;
        int b = (int) (a * 100);
        float average = (float) b/100;
        return average;
    }
}

public class exam1 {
    public static void main(String[] args) {

        Student st[] = new Student[100];
        for(int i = 0,i<st.length,i++)

        Student a = new Student(86, 85, 77);
        Student b = new Student(91, 100, 98);
        Student c = new Student(100, 87, 100);
        Student d = new Student(48, 33, 58);
        Student e = new Student(35, 22, 31);

        System.out.print("a = " + a.getTotal() + "\t\t");
        System.out.print("b = " + b.getTotal() + "\t\t");
        System.out.print("c = " + c.getTotal() + "\t\t");
        System.out.print("d = " + d.getTotal() + "\t\t");
        System.out.println("e = " + e.getTotal() + "\t\t");
        System.out.println();
        System.out.print("a = " + a.getAverage() + "\t\t");
        System.out.print("b = " + b.getAverage() + "\t\t");
        System.out.print("c = " + c.getAverage() + "\t\t");
        System.out.print("d = " + d.getAverage() + "\t\t");
        System.out.print("e = " + e.getAverage() + "\t\t");
    }
}
