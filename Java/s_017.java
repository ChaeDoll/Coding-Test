//문자열 230410
import java.io.*;
import java.util.*;
public class s_017 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(S.charAt(n-1));
    }
    public static void main1(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        char[][] array = new char[5][15];
        //int j=0;
        for (int i=0; i<array.length; i++) {
            st = new StringTokenizer(br.readLine()," ");
          //  while(st.hasMoreTokens()){
            for(int j=0; j<15 ;j++){
                if (st.hasMoreTokens()) {
                    array[i][j] = st.nextToken().charAt(0);
                }
                else break;
                //j++;
            }
        }
    }

}
