//230418 - 별찍기 심화
import java.util.Scanner;
public class s_021 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=1; i<=num; i++){
            for (int j=num-i; j>0; j--){
                System.out.print(" ");
            }
            for (int j=1; j<=i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<=num-1; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int j=(num-i)*2-1; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
