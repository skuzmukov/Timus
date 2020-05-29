import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Task_1005 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int n = (int) in.nval;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            in.nextToken();
            arr[i] = (int) in.nval;;
        }
        int min = Integer.MAX_VALUE;
        int w1;
        int w2;
        String mask;
        for (int num = (int) Math.pow(2, n) + 1; num < Math.pow(2, n + 1); num++) {
            mask = Integer.toBinaryString(num);
            w1 = 0;
            w2 = 0;
            for (int i = 1; i < mask.length(); i++) {
                if (mask.charAt(i - 1) == '0') {
                    w1 += arr[i - 1];
                } else {
                    w2 += arr[i - 1];
                }
            }
            min = Math.min(min, Math.abs(w1 - w2));
        }
        System.out.println(min);
    }
}
