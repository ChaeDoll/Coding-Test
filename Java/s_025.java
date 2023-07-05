import java.io.*;
import java.util.*;
public class s_025 { //230705 스택수열1874번 문제 실버2
    public static void main(String[] args) throws IOException{
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
    public static void main1(String[] args) throws IOException { //평균은넘겠지4344 브론즈1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int student = Integer.parseInt(st.nextToken());
            int sum = 0;
            int count = 0;
            int[] slist = new int[student];
            for (int j=0; j<student; j++){
                slist[j]=Integer.parseInt(st.nextToken());
                sum+=slist[j];
            }
            for (int j=0; j<student; j++) if(slist[j] > (float)sum/(float)student) count++;
            sb.append(String.format("%.3f",(float)count/(float)student*100)+"%\n");
        }
        System.out.println(sb);
    }
}