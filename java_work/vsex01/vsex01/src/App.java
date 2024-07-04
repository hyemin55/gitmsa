public class App {
    public static void main(String[] args) throws Exception {
        // >java:Create Java Project... 클릭 후 원하는 곳에 새폴더 생성.
        // 이클립스랑 같아요!

        int sum = 0;
        for (int i = 0; i <= 20; i++) {

            if (i % 2 != 0 && i % 3 != 0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
