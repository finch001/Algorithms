package Char2;

/**
 * Created by finch on 2016/11/8.
 */
public class ShellSort extends Sort {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;


        int h = 1;
        //计算 shell的剧烈序列
        while (h < N / 3) {
            h = h * 3 + 1;
        }

        while (h >= 1) {
            // 开始一次插入排序
            for (int i = h; i < N; i++) {
                // a[j] 插入到 h的小数组中 因为此时是接个h间距的数组 所以j 此时必须要大于等于 h 不然再下一次的循环有可能越界
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }

            h = h / 3;
        }
    }

    public static void main(String[] args) {
        Integer[] data = new Integer[]{1, 3, 5, 1, 5, 1, 8, 9, 0, 123, 123};


        ShellSort shellSort = new ShellSort();

        shellSort.sort(data);

        isSorted(data);

        show(data);

    }


}
