import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Task_1209 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int f = (int) in.nval;
        for (int i = 0; i < f; i++) {
            in.nextToken();
            System.out.println(Math.sqrt(8 * in.nval - 7) % 1 == 0 ? 1 : 0);
        }
    }
}
