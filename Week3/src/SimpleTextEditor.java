import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SimpleTextEditor {
    public static void processQueries(List<String> queries) {
        StringBuilder s = new StringBuilder();
        Stack<String> history = new Stack<>();

        for (String query : queries) {
            if (query == null || query.trim().isEmpty()) continue;

            String[] parts = query.trim().split(" ");
            int type = Integer.parseInt(parts[0]);

            switch (type) {
                case 1:
                    history.push(s.toString());
                    s.append(parts[1]);
                    break;

                case 2:
                    history.push(s.toString());
                    int k = Integer.parseInt(parts[1]);
                    s.delete(s.length() - k, s.length());
                    break;

                case 3:
                    int index = Integer.parseInt(parts[1]);
                    System.out.println(s.charAt(index - 1));
                    break;

                case 4:
                    if (!history.isEmpty()) {
                        s = new StringBuilder(history.pop());
                    }
                    break;
            }
        }
    }
}