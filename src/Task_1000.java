import java.io.*;

public class Task_1000 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);
        in.nextToken();
        int A = (int) in.nval;
        in.nextToken();
        int B = (int) in.nval;
        out.println(A + B);
        out.flush();
    }
}
