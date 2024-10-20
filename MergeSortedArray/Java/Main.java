import MergeSortedArray.Java.Solution;

import java.util.Scanner;

public static void main(String[] args) {
    Solution solution = new Solution();
    Scanner scanner = new Scanner(System.in);
    /* Example 1
    int[] nums1 = {1, 2, 3};
    int m = 3;
    int[] nums2 = {2, 5, 6};
    int n = 3;
    solution.merge(nums1, m, nums2, n);
    System.out.println(java.util.Arrays.toString(nums1));
    */
    System.out.print("Enter the number of elements in nums1 (m): ");
    int m = scanner.nextInt();
    System.out.print("Enter the number of elements in nums2 (n): ");
    int n = scanner.nextInt();
    // ایجاد آرایه nums1 با اندازه m+n
    int[] nums1 = new int[m + n];
    System.out.println("Enter the elements for nums1:");
    for (int i = 0; i < m; i++){
        nums1[i]= scanner.nextInt();
    }
    // ایجاد آرایه nums2 با اندازه m+n
    int[] nums2 = new int[m + n];
    System.out.println("Enter the elements for nums2:");
    for (int i = 0; i < n; i++){
        nums2[i]= scanner.nextInt();
    }
    solution.merge(nums1, m, nums2, n);
    System.out.println(java.util.Arrays.toString(nums1));

}

