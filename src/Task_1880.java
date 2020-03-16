import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1880 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            map.put(scanner.nextInt(), 1);
        }
        n = scanner.nextInt();
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = scanner.nextInt();
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            temp = scanner.nextInt();
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 3) {
                res ++;
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        out.print(res);
        out.flush();
    }
}
