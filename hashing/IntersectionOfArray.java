package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
// union of 2 arrays
//example 

// int[] array1 = { 7, 3, 9 };
// int[] array2 = { 6, 3, 9, 2, 9, 4 };
// output = {3, 9}

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] array1 = { 7, 3, 9 };
        int[] array2 = { 6, 3, 9, 2, 9, 4 };

        int[] result = intersectionOfArraysTwo(array1, array2);
        for(int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] intersectionOfArrays(int[] array1, int[] array2) {
        ArrayList<Integer> resultList = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 0; i < array1.length; i++) {
            set1.add(array1[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            set2.add(array2[i]);
        }

        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()) {
            int value = it.next();
            if(set2.contains(value)) {
                resultList.add(value);
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

     public static int[] intersectionOfArraysTwo(int[] array1, int[] array2) {
        ArrayList<Integer> resultList = new ArrayList<>();
        
        Arrays.sort(array1);
        Arrays.sort(array2);
        for(int i=0;i<array1.length;i++) {
            for(int j=0;j<array2.length;j++) {
                if(array1.equals(array2)) {
                    
                }
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
