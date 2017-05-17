package Char2;

/**
 * Created by finch on 2016/11/7.
 */
public class Selection extends Sort {
    @Override
    public void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            // 每次内循环都是从下一开始 代表内循环依次最小的值
            int min = i;

            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            //遍历所有数据
            exch(a, i, min);

        }
    }


    public static void main(String[] args) {
        Integer[] data = new Integer[]{1, 3, 2, 6, 5, 4, 7, 9, 8};

        Selection insert = new Selection();
        insert.sort(data);

        assert insert.isSorted(data);

        insert.show(data);


    }
}
