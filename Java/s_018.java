//230410 2차원배열 세로읽기
import java.util.Scanner;

public class s_018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] array = new char[5][];

        for (int i=0; i<5; i++){
            String str = sc.nextLine();
            array[i]=str.toCharArray();
        }
        for (int i=0; i<15; i++) {
            for (int j=0; j<5; j++) {
                //if() //민약에 i의 길이가 끝나면 다음으
                if(i<array[j].length) {
                    System.out.print(array[j][i]);
                }
              //  else
            }
        }
    }
}
