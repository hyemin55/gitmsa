
public class exam4 {
    public static void main(String[] args) {
        int total = 5000;
        System.out.println("DVD 한 편 빌리면 3500원");
        total = 3500;

        int cri = 500;
        int sa = 700;
        int cake = 400;

        total = total - (cri+sa+cake);
        System.out.println(total);

        /* cri = 0~3개
            sa = 0~2개
            cakt = 0~4개
            그 이상은 2000원이 넘는다.
         */
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <3; j++){
                for(int k = 0; k<5; k++){
                    if(1900 == (cri*i+sa*j+cake*k)){
                        System.out.println("i= "+i+" j= "+j+" k= "+k);
                        System.out.print("크림빵은 "+(1+i)+"개"+"\t");
                        System.out.print("새우깡은 "+(1+j)+"개"+"\t");
                        System.out.print("케이크는 "+(1+k)+"개 살 수 있다.");
                    }
                }
            }
        }
    }
}
