import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Task_1409 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int f = (int) in.nval;
        in.nextToken();
        int s = (int) in.nval;
        System.out.println((s - 1) + " " + (f - 1));
    }
}
