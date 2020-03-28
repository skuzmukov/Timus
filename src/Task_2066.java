import java.io.*;
import java.util.Arrays;

public class Task_2066 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);
        int[] arr = new int[3];
        in.nextToken();
        arr[0] = (int) in.nval;
        in.nextToken();
        arr[1] = (int) in.nval;
        in.nextToken();
        arr[2] = (int) in.nval;
        Arrays.sort(arr);
        if (arr[1] <= 1 || arr[2] == 1) {
            out.print(arr[0] - arr[1] - arr[2]);
        } else {
            out.print(arr[0] - arr[1] * arr[2]);
        }
        out.flush();
    }
}
