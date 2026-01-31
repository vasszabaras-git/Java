package gr.aueb.cf.cf9.ch6;
// Stack operations, LIFO last in first out
//xreiazomai PUSH POP
//PUSH Adds an element on top of the stack.
//P0P Removes the top element from the stack and returns it.
//to top an valoue 6 tha einai 5
//    axika to top =-1
//    1h fora tha ginei 0

public class _18_Stack_operation {
    //GLOBAL VARIABLES
    static int[] stack = new int[10];
    static int top = -1;

    public static void main(String[] args) {
        int num = 0;

        push(1);        // top -> 0
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);        // top -> 5

        printStack();
        num = pop();
        System.out.println("Popped: " + num);
        System.out.println();
        printStack();
    }


    public static void push(int num) {
        if (isFull()) {
            System.err.println();
        }
    //stack[++top] = num;
    top++;
    stack[top] = num;
    }

    public static int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        //return stack[top--];
        int num = stack[top];
        top--;
        return num;
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static boolean isFull() {
        return top == stack.length -1;
    }

    public static void printStack() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        for (int i = top; i>=0; i--) {
            System.out.println(stack[i]);
        }

    }

}
