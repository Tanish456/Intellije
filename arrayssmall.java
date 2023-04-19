package basics;

import java.lang.reflect.Array;
import java.net.StandardSocketOptions;
import java.util.Arrays;

public class arrayssmall {
    public static void main(String[] args) {
        int i;
        int small =arr[0];
        int large = arr[0];
        for(i =1;i<arr.length;i++);
        if(arr[i]>large)
            large = arr[1];
        else if(arr[i]<small)
            small = arr[1];
    }

    System.out.println("Smallest Number: ");
    System.out.println(Arrays.stream(arr).min());
    System.out.println("Smallest Number: ");
    System.out.println(Arrays.stream(arr).max());
}
}
