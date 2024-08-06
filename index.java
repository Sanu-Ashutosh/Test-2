import java.lang.reflect.Array;
import java.util.Arrays;

public class index {
    
    public static void main(String[] args) {
        int[] arr = new int[]{ 11,2,3,4,5213,6,7,8,9,10 }; 
       System.out.println( largest(10,  arr));;
    }

    public static int largest(int n, int[] arr) {
        int largest=arr[0];
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>largest)
        largest=arr[i];
    }
    return largest;
    }
}
