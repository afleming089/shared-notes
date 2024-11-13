import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemo {
    static ArrayList<Integer> commonElements(int[] nums1, int[] nums2) {
        // return the elements in both nums1 and in nums2
        // assume that there are no duplicates
        // commonElements([10,20,30,40], [20,40,50]) return [20, 40]

        // O^2
        // int length = nums1.length <= nums2.length ? nums1.length : nums2.length;
        // int cnt = 0;
        // for (int i = 0; i < nums1.length; i++) {
        // for (int j = 0; j < nums2.length; j++) {
        // if (nums1[i] == nums2[j]) {
        // cnt++;
        // break;
        // }
        // }
        // }

        // int[] newArr = new int[cnt];
        // cnt = 0;
        // for (int i = 0; i < nums1.length; i++) {
        // for (int j = 0; j < nums2.length; j++) {
        // if (nums1[i] == nums2[j]) {
        // newArr[cnt++] = nums1[i];
        // break;
        // }
        // }
        // }

        // return newArr;

        // O^2
        // ArrayList<Integer> newArr = new ArrayList<>();
        // for (int i = 0; i < nums1.length; i++) {
        // for (int j = 0; j < nums2.length; j++) {
        // if (nums1[i] == nums2[j]) {
        // newArr.add(nums1[i]);
        // }
        // }
        // }

        // can uses java array
        // has binary search
        // also has sort function

        // O(n*log(n))
        Arrays.sort(nums2);
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            // for (int j = 0; j < nums2.length; j++) {
            // if (nums1[i] == nums2[j]) {
            // newArr.add(nums1[i]);
            // }
            if (ArrayDemo.binarySearch(nums2, nums1[i]) >= 0) {
                newArr.add(nums1[i]);
            }
        }

        return newArr;
    }

    static void displayArray(int[] nums) { // T(nums.length) = O(nums.length) == O(N)
        for (int i = 0; i < nums.length; i++) { // c1 nums.length+1
            System.out.print(nums[i] + " "); // c2 nums.length
        }
        System.out.println(""); // c3 1
    }

    // when array is passed over it dose not make a copy
    // Arrays are reference types so it passes over the memory address
    static void swapFirstSecond(int[] nums) {
        // Make change to the input of the array by exchanging the first and second
        // elements

        int firstElement = nums[0]; // c1 O(1)
        nums[0] = nums[1]; // c2 O(1)
        nums[1] = firstElement; // c3 O(1)
        // O(1)
    }

    static void swapFirstSecondNewArray(int[] nums) {
        // Make a new array that has all elements of nums but first and second swapped.
        // do not change orginal array.
        int[] newArray = new int[nums.length]; // O(N)
        newArray[0] = nums[1]; // O(1)
        newArray[1] = nums[0]; // O(1)

        for (int i = 2; i < newArray.length; i++) // O(N)
            newArray[i] = nums[i];

        System.out.print("\nNEW Array "); // O(1)
        for (int i = 0; i < newArray.length; i++) // O(N)
            System.out.print(newArray[i] + " "); // O(1)

        System.out.print("\nOrginal Array "); // O(1)

        // O(N)
    }

    static void shiftLeft(int[] nums) { // T(nums.length)
        // Make chanege to array nums so that all elements of nums shift left
        // the left most elements will be dropped

        for (int i = 0; i < nums.length - 1; i++) { // O(N)
            nums[i] = nums[i + 1];
        }

        // O(N)

        System.out.print("\nShifted array left ");
        for (int i : nums) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
    }

    static void shiftRight(int[] nums) {
        // Make chanege to array nums so that all elements of nums shift right
        // the right most elements will be dropped

        for (int i = nums.length - 1; i > 0; i--)
            nums[i] = nums[i - 1];

        System.out.print("\nShifted array right ");
        for (int i : nums) { // O(N)
            System.out.print(i + " ");
        }

        System.out.println("\n");
    }

    static void add(int[] nums, int val) { // O(N)
        // create and return a new array with new val in it and all older elements in
        // it.
        int[] numsAndNewVal = new int[nums.length + 1]; // O(N)

        numsAndNewVal[numsAndNewVal.length - 1] = val; // O(1)
        for (int i = 0; i < nums.length; i++) { // O(N)
            numsAndNewVal[i] = nums[i];
        }

        System.out.print("\nAdded element ");
        for (int i : numsAndNewVal) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
    }

    static void add(int[] nums1, int[] nums2) { // O(nums1.length + nums2.length)
        // Create and return a new array that has all the elements from nums1 and nums2
        int[] concatedArray = new int[nums1.length + nums2.length]; // num1.length + nums2.length // 1

        for (int i = 0; i < nums1.length; i++) { // c1 nums1.length+1
            concatedArray[i] = nums1[i]; // c2 nums1.length
        }

        for (int i = nums1.length, j = 0; i < concatedArray.length; i++, j++) { // c3 nums2.length + 1
            concatedArray[i] = nums2[j]; // c4 nums2.length
        }

        // return newArr; // c5 1

        System.out.print("\nConcat array ");
        for (int i : concatedArray) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
    }

    static void removeLast(int[] nums) { // T(nums1.length) = O(nums.length)
        // create and return a new array that has all the elements of the array except
        // the last one.
        int[] newArray = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            // not efficient because it is copying all elements when you only need to remove
            // the last one
            newArray[i] = nums[i];
        }
    }

    static void removeFirst(int[] nums) {
        // create and return a new array that has all the elements of the array except
        // the first one.
        int[] newArray = new int[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            // not efficient because it is copying all elements when you only need to remove
            // the first one
            newArray[i] = nums[i + 1];
        }
    }

    static void countPostive(int[] nums1) {
        // return number of postive elemenys in an array

        int count = 0;
        for (int i = 0; i < nums1.length; i++)
            if (nums1[i] > 0)
                count++;
    }

    static int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i : nums) {
            if (i > max)
                max = i;
        }
        return max;
    }

    // <-------------------- important ------------->
    // find minuam value and then add it to 0
    // then swap the number at 0 with the index of where the minum value is.
    // then repeat for the rest of the array.

    // <-------------------- sort ------------->
    static void selectionSort(int[] nums) { // T(nums.length) = O(nums.length ^ 2)
        // make change to the input array so that is sorted in non-descending order
        int minV = nums[0];

        for (int j = 0; j < nums.length; j++) { // nums.length
            int minIndex = j; // nums.length - 1
            for (int i = j + 1; i < nums.length; i++) { //
                if (nums[i] < nums[minIndex])
                    minIndex = i;
                // swap nums[0] with minV
                int t = nums[j];
                nums[j] = nums[minIndex];
                nums[minIndex] = t;
            }
        }

        System.out.print("\nSort array ");
        for (int i : nums) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
    }

    // <-------------------- search ------------->
    static int linearSearch(int[] nums, int val) { // Best T(nums.length) Worst O(N)
        // return index of the element

        // cost // time(best-case) // time(worst-case)
        // best nums[0] == val worst nums[nums.length - 1] == val
        for (int i = 0; i < nums.length; i++) { // c1 best O(1) worst O(N)
            if (val == nums[i]) { // c2 best O(1) worst O(N)
                return i; // c3 best O(1) worst O(1)
            }
        }

        return -1; // c4 best O(1) worst O(1)
    }

    // needs to be sorted before
    static int binarySearch(int[] nums, int val) {
        // return the index of an element that is equal to val
        // return -1 if val is not found
        // assumes that the array is sorted in non descending order

        // if it is less than middle number you can ignore everything middle and up
        // if it is less than middle number that you can ignore everything less than
        // middle and middle and focus only on the right side.

        // cost // times(best-case) // times(worst-case)
        // best case = vals == nums[mid] = O(1)
        // worst case = O(log(N))
        int start = 0, end = nums.length - 1; // worst case 1
        while (start <= end) { // worst case log(n)
            int mid = end - start / 2; // worst case log(n)
            if (val == nums[mid]) // worst case log(n)
                return mid;
            else if (val < nums[mid]) // worst case log(n)
                end = mid - 1; // worst case < log(n)
            else // val > nums[mid]
                start = mid + 1; // worst case < log(n)
        }

        return -1; // worst case 1
    }

    public static void main(String[] args) {
        // declare array
        int[] nums1 = new int[5];

        // takes longer to make a bigger array
        // so nums2 = new int[20] would take longer because it is being filled with 0

        nums1[0] = 10;
        nums1[1] = 30;
        nums1[2] = 234;

        nums1[nums1.length - 1] = nums1[0];
        swapFirstSecond(nums1);
        displayArray(nums1);
        swapFirstSecondNewArray(nums1);
        displayArray(nums1);
        shiftLeft(new int[] { 10, 20, 30, 40 }); // 20 30 40 0
        shiftRight(new int[] { 10, 20, 30, 40 }); // 10 10 20 30
        add(new int[] { 10, 20, 30 }, 40); // 10 20 30 40
        add(new int[] { 10, 20, 30 }, new int[] { 40, 50 }); // 10 20 30 40 50
        System.out.println(findMax(new int[] { 10, 20, 30, 40 })); // 40

        // sort
        selectionSort(new int[] { 3, 51, 2, 1, 10 }); // 1, 2, 3, 10, 51

        // liner search
        System.out.println("Liner Search");
        System.out.println(linearSearch(new int[] { 3, 51, 2, 1, 10 }, 0)); // -1
        System.out.println(linearSearch(new int[] { 3, 51, 2, 1, 10 }, 2)); // 2

        System.out.println("Binary Search");
        // binary search
        System.out.println(binarySearch(new int[] { 10, 20, 30, 35, 100, 103, 153 }, 30)); // 2 {index of 30}
        // -1 if not in array
    }
}
