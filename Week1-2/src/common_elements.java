public class common_elements {
    public static void print(int[] a,int[] b){
        int n = a.length;
        int i=0,j=0;
        while(i < n && j < n){
            if(a[i] == b[j]){
                System.out.print(a[i]);
                System.out.print(" ");
                int tmp = a[i];
                while(i<n && a[i] == tmp) i++;
                while(j<n && b[j] == tmp) j++;
            }
            else{
                if(a[i] > b[j]) j++;
                else i++;
            }
        }
    }
}


