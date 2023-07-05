import java.io.*;
import java.util.*;
public class s_025 { //230705 스택수열1874번 문제 실버2
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int point = 0;
        ArrayList<Integer> stack = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N+1; i++){
            stack.add(i);
        }
        for(int i=0; i<N; i++){
            int answer=sc.nextInt();
            if (stack.get(point)>answer) {
                sb.delete(0,sb.length());
                sb.append("NO\n");
                break;
            }
            else {
                while (stack.get(point) < answer) {
                    sb.append("+\n");
                    point++;
                }
                sb.append("-\n");
                stack.remove(point);
                point--;
            }
        }
        System.out.println(sb);
    }
}
