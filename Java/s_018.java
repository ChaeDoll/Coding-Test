//230410 2차원배열
import java.util.Scanner;

public class s_018 {
    public static void main(String[] args) { //세로읽기
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
    public static void main0(String[] args) { //행렬 덧셈 (230411)
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] A = new int[row][column];
        int[][] B = new int[row][column];
        int[][] result = new int[row][column];
        for (int i=0; i<row; i++) {
            for (int j=0; j<column; j++) {
                A[i][j]=sc.nextInt();
            }
        }
        for (int i=0; i<row; i++) {
            for (int j=0; j<column; j++) {
                B[i][j]=sc.nextInt();
            }
        }
        for (int i=0; i<row; i++) {
            for (int j=0; j<column; j++) {
                result[i][j]=A[i][j]+B[i][j];
            }
        }
        for (int i=0; i<row; i++) {
            for (int j=0; j<column; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int row = 0;
        int column = 0;
        int[][] array = new int[9][9];
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                array[i][j]=sc.nextInt();
                if (array[i][j]>max) {
                    max=array[i][j];
                    row=i+1;
                    column=j+1;
                }
            }
        }
        System.out.print(max+"\n"+row+" "+column);
    }
}
