package Char2;

/**
 * Created by finch on 2016/11/13.
 */
public class QuckSort {

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi;
        Comparable v = a[lo];

        while (true) {
            //边界条件  注意 传入的hi值
            while (Sort.less(a[++i], v)) {
                if (i == hi) {
                    break;
                }
            }

            while (Sort.less(v, a[--j])) {
                if (j == lo) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }

            Sort.exch(a, i, j);
        }
        Sort.exch(a, lo, j);
        return j;
    }


    public static void main(String[] args) {
        Integer[] nums = new Integer[]{2, 1, 4, 6, 8, 7, 3, 10};
        partition(nums, 0, nums.length);

        for (int i : nums) {
            System.out.println(i);
        }

    }
}
