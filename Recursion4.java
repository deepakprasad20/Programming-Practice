import java.util.Stack;

public class Recursion4 {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        int size = (stack.size()/2) + 1;
        deleteMiddleElement(stack , size);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    private static void deleteMiddleElement(Stack<Integer> stack, int size) {
        if(size == 1){
            stack.pop();
            return;
        }
        int tmp = stack.pop();
        deleteMiddleElement(stack,size-1);
        stack.push(tmp);
    }
}
