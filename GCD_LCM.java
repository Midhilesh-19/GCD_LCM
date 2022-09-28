import java.util.*;

public class GCD_LCM{

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> s=new ArrayList<Integer>();
        ArrayList<Integer> t=new ArrayList<Integer>();
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int GCD;
        int LCM;
        for (int i = 1; i <= num1; ++i) {
            if (num1 % i == 0) {
                s.add(i);
//                System.out.print(i + " ");
            }
            if (num2% i == 0) {
                t.add(i);
//                System.out.print("\t"+i + " ");
            }
        }
//        for (int z:s) {
//            System.out.print(z);
//        }
//        System.out.println();
//        for (int y:t) {
//            System.out.print(y);
////            System.out.println(s.contains(y));
//        }
//        System.out.println("\n");
        s.retainAll(t);
        GCD =Collections.max(s);
        LCM =(num1*num2)/GCD;
        System.out.println(GCD);
        System.out.println(LCM);


//        System.out.println("\nfbveaibsfdbo == " +t.indexOf(20));

    }
}












