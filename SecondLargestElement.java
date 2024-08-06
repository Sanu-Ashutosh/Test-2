import java.util.*;

public class SecondLargestElement {
    static int a=10;
     int b=10;


    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        // Add integers to the list
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        // Print the list
       System.out.println( print2largest(integerList));
       SecondLargestElement ele=null;
       System.out.println("a"+ele.a);
       System.out.println(ele.b);


    }

    public static int print2largest(List<Integer> arr) {
        // Code Here
        if (arr == null || arr.size() < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num < firstLargest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new RuntimeException("There is no second largest element");
        }

        return secondLargest;
    }
}
