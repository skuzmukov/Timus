import java.io.*;

public class Task_1068 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);

        in.nextToken();
        int n = (int) in.nval;
        int sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        } else {
            for (int i = 1; i >= n; i--) {
                sum += i;
            }
        }
        out.print(sum);
        out.flush();
    }
}
