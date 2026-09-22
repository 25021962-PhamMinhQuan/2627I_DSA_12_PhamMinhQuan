import java.util.ArrayList;

import static java.lang.Math.round;

public class find_local_minium {
    public static int find(int[] a){
        int length = a.length;
        if(length == 0) return -1;
        if(length == 1) return 0;
        if(a[0] < a[1]) return 0;
        if(a[length-1] < a[length-2]) return length-1;
        int l=1, r=length-2;
        while(l<=r){
            int mid = (l+r) / 2;
            if(a[mid] < a[mid-1] && a[mid] < a[mid+1]){
                return mid;
            }
            if(a[mid] > a[mid-1]){
                r = mid-1;
            }
            else if(a[mid] > a[mid+1]){
                l=mid+1;
            }
        }
        return -1;
    }
}

