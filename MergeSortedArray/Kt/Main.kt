package MergeSortedArray.Kt

class MainKotlin {
    fun mainKt() {

        fun merge(
            nums1: IntArray,
            m: Int,
            nums2: IntArray,
            n: Int,
        ): Unit {
            var n1p: Int = m - 1
            var n2p: Int = n - 1
            var wp: Int = n + m - 1
            while (wp >= 0) {
                if (n1p < 0)
                    nums1[wp--] = nums2[n2p--]
                else if (n2p < 0)
                    nums1[wp--] = nums1[n1p--]
                else if (nums1[n1p] > nums2[n2p]){
                    nums1[wp] = nums1[n1p]
                    wp--
                    n1p--
                }
                else
                    nums1[wp--]=nums2[n2p--]
            }
        }

    }

}