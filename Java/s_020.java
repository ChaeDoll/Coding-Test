//230416 폭탄터지기... 메모리부족..?
import java.io.*;

public class s_020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String string = br.readLine();
        String bombString = br.readLine();
        br.close();
        bw.write(bomb(string, bombString));
        bw.flush();
        bw.close();
    }
    public static String bomb(String str, String bomb) {
        if (str.contains(bomb)) {
            String newString = String.join("", str.split(bomb));
            return bomb(newString, bomb);
        }
        else if (str.length()==0) return "FRULA";
        else return str;
    }
}
