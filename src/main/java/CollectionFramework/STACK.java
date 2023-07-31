package CollectionFramework;

import java.util.Stack;

public class STACK {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        //Pushing
        stack.push("A");
        stack.push("C");
        stack.push("B");
        stack.push("D");
        System.out.println(stack);

        //Poping
        String poppedElement = stack.pop();
        System.out.println("Popped element:" + poppedElement);

        //Peeking
        String topElement = stack.peek();
        System.out.println("Peeking elemrnt:" + topElement);

        //Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty?" + isEmpty);

        //Finding the index of an element in the stack
        int index = stack.search("A");
        System.out.println("Insex of 'A':" + index);
    }
}
