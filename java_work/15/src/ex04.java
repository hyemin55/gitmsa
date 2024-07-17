public class ex04 {

    public static void main(String[] args) {
        String a ="asd";
        String b ="bsd";

        System.out.println(a +b);
        System.out.println(a.concat(b));

        System.out.println();

//        같은 글자는 0 출력, 큰글자는 양수, 작은 글자는 음수 출력.
//        사전편찬 순으로 값을 정한다.
        System.out.println(a.compareTo("asd"));
        System.out.println(a.compareTo("ASD"));
        System.out.println(a.compareTo("qweqwe"));

        System.out.println();

        System.out.println(a.compareToIgnoreCase("asd"));
        System.out.println(a.compareToIgnoreCase("Asd"));

        System.out.println();

        System.out.println(a.compareToIgnoreCase("ASda"));
        System.out.println(a.compareToIgnoreCase("ASdaqwe"));
        System.out.println(a.compareToIgnoreCase("qweqwedaqwe"));



    }
}
