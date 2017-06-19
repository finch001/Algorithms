package Stack;

import java.util.Stack;

/**
 * Created by finch on 6/19/17.
 */
public class no3 {
    private static Stack<Integer> stack = new Stack<>();

    // 每次返回的都是最底下的数据
    public static int getAndRemoveLast(Stack<Integer> data) {
        int value = data.pop();

        if (data.isEmpty()) {
            return value;
        } else {
            int last = getAndRemoveLast(data);
            data.push(value);
            return last;
        }
    }

    //取出其中最少的数据
    // 方法的结束有几种  常见的有函数走完了  还有提前被return 掉了  这个方法主要是通过将栈中的数据都取出来 然后最后才放回去
    public static void reverse(Stack<Integer> data) {
        if (data.isEmpty()) {
            return;
        }

        int last = getAndRemoveLast(data);
        reverse(data);
        data.push(last);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            stack.push(i);
        }

        reverse(stack);

        while(!stack.isEmpty()){
            System.out.println("Data num: " + stack.pop());
        }
    }
}
