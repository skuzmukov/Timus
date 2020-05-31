import java.io.*;
//https://acm.timus.ru/problem.aspx?space=1&num=1225
public class Task_1225 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int n = (int) in.nval;
        if (n < 3) {
            System.out.println(2);
            return;
        }
        long[] dp = new long[n + 1];
        dp[1] = 2;
        dp[2] = 2;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[n]);
    }
}