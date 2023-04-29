//알고리즘 복잡도 계산 (230429)
import java.util.*;
public class s_022 {
    public static void main(String[] args) { //시간복잡도 4
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        System.out.println(num*(num-1)/2+"\n"+2);
    }
    public static void main1(String[] args) { //시간복잡도 5
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        System.out.println(num*num*num+"\n"+3);
    }
    public static void main2(String[] args) { //시간복잡도 6 (정답봄)
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        System.out.println(num*(num-1)*(num-2)/6+"\n"+3);
    }
    public static void main3(String[] args) { //점근적표기법
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int flag=0;
        for (int i=n; i<=100; i++) {
            if (num1*i+num2<=c*i) {}
            else flag=1;
        }
        if (flag==0) System.out.println(1);
        else System.out.println(0);
    }
}