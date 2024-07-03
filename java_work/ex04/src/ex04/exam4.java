package ex04;

public class exam4 {

/*
 * 아래는 화씨(F)를 섭씨(C)로 변환하는 코드이다. 변환공식이 'C = (F-32)/1.8' 라고 할 때 (1)에 알맞은 코드를 넣으시오.
 *  단, 변환 결과값은 소수점 셋째자리에서 반올림해야 한다.(형변환이용)
 */
	public static void main(String[] args) {
		int F = 100;
		float C = (float) ((F - 32) / 1.8);

		int a = (int) (C *100);
		
		float c = ((a%10)>=5) ? (float)(a+1)/100 : (float)a/100;
		
		System.out.println("F = " + F);
		System.out.println("C = " + c);
//		System.out.println("C = " + Math.round(C));
//		System.out.println(((int)(C*100))/(double)100);
		
	}
}

//package ex001;
//
////아래는 화씨(F)를 섭씨(C)로 변환하는 코드이다 변환공식이
////[C] = ([F]-32) / 1.8 라고 할때
////(1)에 알맞은 코드를 넣으시오. 단, 변환 결과값은 소수점 셋째자리에서 반올림해야 한다.
//class exam04{
// public static void main(String[] args) {
//    int F = 100;
//    
//    double fc = (F-32)/1.8;
////    System.out.println(fc);
//    int cc = (int) (fc*1000); // 셋째 자리까지 남기기 위해(37777) 
//    int ABC = cc%10; // 반올림 if 문을 위한 몫
//    
//    int cc2 = (int) (fc*100);
//    double C = (double) cc2/100;
//    double B = 0.01;
//    
//    if(5<=ABC) {
//       System.out.println("F = " + F);
//       System.out.println("C = " + (C+B));
//       System.out.println("올려");
//    }
//    else {
//       System.out.println("F = " + F);
//       System.out.println("C = " + C);
//       System.out.println("내려");
//    }

// }
//}