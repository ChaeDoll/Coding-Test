import java.io.*;
import java.util.*;
public class s_023 {
    public static void main(String[] args) throws IOException { //230430 진법변환
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        char[] num = st.nextToken().toCharArray();
        int gin = Integer.parseInt(st.nextToken());
        long sum=0;
        for (int i=num.length-1; i>=0; i--) {
            if (num[num.length-1-i]>=65&&num[num.length-1-i]<=90) {
                sum+=(num[num.length-1-i]-55)*Math.pow(gin, i);
            }
            else{
                sum+=(num[num.length-1-i]-'0')*Math.pow(gin, i);
            }
        }
        System.out.println(sum);
    }
}
