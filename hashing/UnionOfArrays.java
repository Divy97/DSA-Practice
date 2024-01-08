package hashing;


import java.util.HashSet;

// union of 2 arrays
//example 

// int[] array1 = { 7, 3, 9 };
// int[] array2 = { 6, 3, 9, 2, 9, 4 };
// output = {7,3,9,6,2,4}

public class UnionOfArrays {
    public static void main(String[] args) {
        int[] array1 = { 7, 3, 9 };
        int[] array2 = { 6, 3, 9, 2, 9, 4 };

        unionOfArrays(array1, array2);
    }

    public static void unionOfArrays(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            set.add(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            set.add(array2[i]);
        }
        System.out.println(set);
    }
}
