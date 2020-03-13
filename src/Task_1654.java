import java.io.*;

public class Task_1654 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        String s = in.sval;

        char[] deque = new char[s.length()];
        int ind = 0;
        for (char c : s.toCharArray()) {
            if (ind == 0 || deque[ind - 1] != c) {
                deque[ind++]= c;
            } else {
                ind --;
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        int x = 0;
        while (x != ind) {
            out.print(deque[x++]);
        }
        out.flush();
    }
}
