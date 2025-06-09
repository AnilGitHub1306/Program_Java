package array_Java_Problem;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Array_UtilityClassMethodsForArray {
    public static void main(String[] args) {

        // 1. Arrays.sort()
        int[] nums1 = {5, 3, 8, 1};
        Arrays.sort(nums1);
        System.out.println("Sorted array: " + Arrays.toString(nums1));

        // 2. Arrays.toString()
        int[] nums2 = {10, 20, 30};
        System.out.println("Array to String: " + Arrays.toString(nums2));

        // 3. Arrays.copyOf()
        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, 5);
        System.out.println("Copy of array with new length: " + Arrays.toString(copy));

        // 4. Arrays.copyOfRange()
        int[] range = Arrays.copyOfRange(original, 0, 2);
        System.out.println("Copy of range: " + Arrays.toString(range));

        // 5. Arrays.equals()
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println("Arrays equal: " + Arrays.equals(a, b));

        // 6. Arrays.fill()
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("Filled array: " + Arrays.toString(filled));

        // 7. Arrays.binarySearch()
        int[] searchArray = {3, 6, 1, 9};
        Arrays.sort(searchArray); // binarySearch requires sorted array
        int index = Arrays.binarySearch(searchArray, 6);
        System.out.println("Index of 6 in sorted array: " + index);

        // 8. Arrays.stream()
        int[] nums3 = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(nums3).sum();
        System.out.println("Sum using stream: " + sum);

        // 9. Arrays.asList()
        String[] fruits = {"Apple", "Banana", "Mango"};
        List<String> fruitList = Arrays.asList(fruits);
        System.out.println("List from array: " + fruitList);

        // 10. clone()
        int[] originalClone = {100, 200, 300};
        int[] cloned = originalClone.clone();
        System.out.println("Cloned array: " + Arrays.toString(cloned));
    }
}