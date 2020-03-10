import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Task_1877 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int f = (int) in.nval;
        in.nextToken();
        int s = (int) in.nval;

        System.out.println(f % 2 == 0 || s % 2 == 1 ? "yes" : "no");
    }
}
