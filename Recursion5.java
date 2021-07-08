import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Recursion5 {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        reverseStack(stack );
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    private static void reverseStack(Stack<Integer> stack) {
        if(stack.isEmpty()){
            return;
        }
        int tmp = stack.pop();
        reverseStack(stack);
        insert(stack,tmp);
    }

    private static void insert(Stack<Integer> stack, int tmp) {
        if(stack.isEmpty()){
            stack.push(tmp);
            return;
        }
        int ele = stack.pop();
        insert(stack,tmp);
        stack.push(ele);
    }
}
