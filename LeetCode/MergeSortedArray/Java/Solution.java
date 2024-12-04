package LeetCode.MergeSortedArray.Java;
/*شما دو آرایه‌ی عدد صحیح به نام‌های nums1 و nums2 دارید که به ترتیب غیر‌کاهشی مرتب شده‌اند.
همچنین دو عدد صحیح m و n داده شده است که به ترتیب نشان‌دهنده‌ی تعداد عناصر موجود در nums1 و nums2 هستند.

وظیفه‌ی شما این است که nums1 و nums2 را در یک آرایه‌ی واحد که به ترتیب غیر‌کاهشی مرتب شده است، ادغام کنید.

آرایه‌ی نهایی نباید توسط تابع بازگردانده شود،بلکه باید در داخل آرایه‌ی nums1 ذخیره شود. برای این منظور،
آرایه‌ی nums1 طول m + n دارد، که در آن m عنصر اول نشان‌دهنده‌ی عناصری است که باید ادغام شوند و n
عنصر آخر به صورت 0 تنظیم شده‌اند و باید نادیده گرفته شوند.
 آرایه‌ی nums2 طول n دارد.

مثال ۱:
ورودی: nums1 = [1,2,3,0,0,0]، m = 3، nums2 = [2,5,6]، n = 3
خروجی: [1,2,2,3,5,6]
توضیح: آرایه‌هایی که در حال ادغام آنها هستیم، [1,2,3] و [2,5,6] هستند. نتیجه‌ی ادغام، [1,2,2,3,5,6] است.

مثال ۲:
ورودی: nums1 = [1]، m = 1، nums2 = []، n = 0
خروجی: [1]
توضیح: آرایه‌هایی که در حال ادغام آنها هستیم، [1] و [] هستند. نتیجه‌ی ادغام، [1] است.

مثال ۳:
ورودی: nums1 = [0]، m = 0، nums2 = [1]، n = 1
خروجی: [1]
توضیح: چون m = 0 است، هیچ عنصری در nums1 وجود ندارد. عدد 0 فقط برای اطمینان از این که نتیجه‌ی ادغام در nums1 جا می‌گیرد، وجود دارد.*/

import java.util.Scanner;

public class Solution {
    Scanner scanner = new Scanner(System.in);
    public void merge(
            int[] nums1
            , int m
            , int[] nums2
            , int n
    ) {
        // وقتی به شما n میدهد مثا 3 یعنی سه عدد داریم پس آخرین ایندکس شما 2 خواهد بود
        //و پوینتر های ما به ته آرایه اشاره میکنند
        int n1p = m - 1;
        int n2p = n - 1;
        // نشانگر نویسنده عدد ها و مجموع تعداد
        int wp = (n + m) - 1;

        while (wp >= 0) {
            if (n1p < 0) {
                nums1[wp--] = nums2[n2p--];
            } else if (n2p < 0) {
                nums1[wp--] = nums1[n1p--];
            } else if (nums1[n1p] > nums2[n2p]) {
                nums1[wp--] = nums1[n1p--];
            } else  {
                nums1[wp--] = nums2[n2p--];
            }
        }
    }
    public void margeRun() {
        Solution solution=new Solution();
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
}
