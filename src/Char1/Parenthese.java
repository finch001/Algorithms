package Char1.data;


import java.util.Stack;

/**
 * Created by finch on 2016/11/6.
 */
public class Parenthese {
    public static void main(String[] args) {
        getBinaryString(50);

    }


    public static void getBinaryString(int num) {
        StringBuffer sb = new StringBuffer();
        Stack<Integer> s = new Stack<Integer>();
        while (num > 0) {
            s.push(num % 2);
            num = num / 2;
        }


        for (int d : s) {
            System.out.print(d);

        }
    }
}
