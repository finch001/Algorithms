package Char2;

/**
 * Created by finch on 2017/5/13.
 */
public class Insertion extends Example {

    @Override
    public void sort(Comparable[] a) {

        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }


    public static void main(String[] args) {
        Integer[] data = new Integer[]{1, 3, 2, 6, 5, 4, 7, 9, 8};


        Insertion insert = new Insertion();
        insert.sort(data);

        assert isSorted(data);

        show(data);
    }
}
