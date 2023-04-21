//심화1
import java.util.Scanner;
public class s_021 {
    public static void main(String[] args){ // 별찍기 230418
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
    public static void main0(String[] args){ //체스판 말 개수 230421
        Scanner sc = new Scanner(System.in);
        int[] correct = {1, 1, 2, 2, 2, 8};
        int[] find = new int[6];
        for (int i=0; i<6; i++){
            find[i] = sc.nextInt();
            correct[i]=correct[i]-find[i];
        }
        for (int res: correct) {
            System.out.print(res+" ");
        }
    }
    public static void main1(String[] args){ //바구니 순서 바꾸기기 230421
        Scanner sc = new Scanner(System.in);
        int boxNum = sc.nextInt();
        int cycle = sc.nextInt();
        int[] box = new int[boxNum];
        int[] result = new int[boxNum];
        for(int i=0; i<boxNum; i++) {
            box[i]=i+1;
            result[i]=i+1;
        }
        for (int i=0; i<cycle; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            int m = sc.nextInt()-1;
            for (int j=a; j<=b; j++) {
                if (m>b) m=a;
                result[j] = box[m++];
            }
            for (int j=0; j<boxNum; j++) box[j]=result[j];
        }
        for (int print:result) System.out.print(print+" ");
    }
    public static void main2(String[] args) { //팰린드롬 230421
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int flag=1;
        for(int i=0; i<sentence.length()/2; i++){
            if(sentence.charAt(i)!=sentence.charAt(sentence.length()-1-i)) {
                flag=0;
                break;
            }
        }
        System.out.println(flag);
    }
    public static void main3(String[] args) { //단어공부 230421
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        int[] alp = new int[26];
        for(int i=0; i<alp.length; i++) alp[i]=0;
        for(int i=0; i<sen.length(); i++){
            if(sen.charAt(i)>=65&&sen.charAt(i)<91) alp[sen.charAt(i)-65]++;
            else alp[sen.charAt(i)-97]++;
        }
        int max=Integer.MIN_VALUE;
        int result=0;
        boolean flag=false;
        for (int i=0; i<alp.length; i++) {
            if(alp[i]>max) {
                max = alp[i];
                result=i;
            }
        }
        for (int i=0; i<alp.length; i++) {
            if(result!=i&&max==alp[i]) flag=true;
        }
        if(flag) System.out.println("?");
        else System.out.println((char)(result+65));
    }
    public static void main4(String[] args) { //평균넘는비율 230421
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int student = sc.nextInt();
            int[] arr = new int[student];
            int sum = 0;
            int good = 0;
            for (int j=0; j<student; j++) {
                arr[j] = sc.nextInt();
                sum+=arr[j];
            }
            for (int j=0; j<student; j++) {
                if (arr[j]>(float)sum/student) good++;
            }
            System.out.println(String.format("%.3f", (float)good/student*100)+"%");
        }
    }
    public static void main5(String[] args) { //크로아티아 알파벳
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='c'&&(i+1)<str.length()) {
                if (str.charAt(i+1)=='='||str.charAt(i+1)=='-') count++;
            }
            if(str.charAt(i)=='d'&&(i+1)<str.length()) {
                if (str.charAt(i+1)=='-') count++;
                if ((i+2)<str.length()) {
                    if (str.charAt(i+1)=='z'&&str.charAt(i+2)=='=') count++;
                }
            }
            if(str.charAt(i)=='l'&&(i+1)<str.length())
                if(str.charAt(i+1)=='j') count++;
            if(str.charAt(i)=='n'&&(i+1)<str.length())
                if(str.charAt(i+1)=='j') count++;
            if(str.charAt(i)=='s'&&(i+1)<str.length())
                if(str.charAt(i+1)=='=') count++;
            if(str.charAt(i)=='z'&&(i+1)<str.length())
                if(str.charAt(i+1)=='=') count++;
        }
        System.out.println(str.length()-count);
    }
    public static void main6(String[] args) { //너의평점은 230421
        Scanner sc = new Scanner(System.in);
        int subject = 20;
        float subjectSum = 0;
        float scoreSum = 0;
        for (int i=0; i<subject; i++){
            String[] sub = sc.nextLine().split(" ");
            if(sub[2].contains("A+")){
                subjectSum+=Float.parseFloat(sub[1]);
                scoreSum+=Float.parseFloat(sub[1])*4.5;
            }
            else if(sub[2].contains("A0")) {
                subjectSum+=Float.parseFloat(sub[1]);
                scoreSum+=Float.parseFloat(sub[1])*4.0;
            }
            else if(sub[2].contains("B+")) {
                subjectSum+=Float.parseFloat(sub[1]);
                scoreSum+=Float.parseFloat(sub[1])*3.5;
            }
            else if(sub[2].contains("B0")) {
                subjectSum+=Float.parseFloat(sub[1]);
                scoreSum+=Float.parseFloat(sub[1])*3.0;
            }
            else if(sub[2].contains("C+")) {
                subjectSum+=Float.parseFloat(sub[1]);
                scoreSum+=Float.parseFloat(sub[1])*2.5;
            }
            else if(sub[2].contains("C0")) {
                subjectSum+=Float.parseFloat(sub[1]);
                scoreSum+=Float.parseFloat(sub[1])*2.0;
            }
            else if(sub[2].contains("D+")) {
                subjectSum+=Float.parseFloat(sub[1]);
                scoreSum+=Float.parseFloat(sub[1])*1.5;
            }
            else if(sub[2].contains("D0")) {
                subjectSum+=Float.parseFloat(sub[1]);
                scoreSum+=Float.parseFloat(sub[1]);
            }
            else if(sub[2].contains("F")) {
                subjectSum+=Float.parseFloat(sub[1]);
            }
            else if(sub[2].contains("P")) {}
        }
        System.out.println(String.format("%.6f", scoreSum/subjectSum));
    }
}
