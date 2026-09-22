import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        int index = find_local_minium.find(a);
        System.out.println(index);

        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = scanner.nextInt();
        }
        common_elements.print(a,b);
    }
}
