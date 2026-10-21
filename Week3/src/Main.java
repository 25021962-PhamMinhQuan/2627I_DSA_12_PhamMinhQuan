import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 1; i<=n;i++) {
            String s = scanner.nextLine();
            System.out.println(BalancedBrackets.isBalanced(s));
        }


        int q = scanner.nextInt();
        scanner.nextLine();
        List<String> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            queries.add(scanner.nextLine());
        }
        SimpleTextEditor.processQueries(queries);
    }
}