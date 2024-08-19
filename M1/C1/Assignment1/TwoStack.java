package module1;

public class TwoStack {
    private int[] arr;
    private int size;
    private int top1, top2;

    public TwoStack(int size) {
        this.size = size;
        arr = new int[size];
        top1 = -1; // Top for Stack 1
        top2 = size; // Top for Stack 2
    }

    // Push x to the first stack
    public void push1(int x) {
        if (top1 < top2 - 1) { // Check for overflow
            arr[++top1] = x;
        } else {
            System.out.println("Stack Overflow: Cannot push to Stack 1");
        }
    }

    // Push x to the second stack
    public void push2(int x) {
        if (top1 < top2 - 1) { // Check for overflow
            arr[--top2] = x;
        } else {
            System.out.println("Stack Overflow: Cannot push to Stack 2");
        }
    }

    // Pop element from the first stack
    public int pop1() {
        if (top1 >= 0) { // Check if stack is empty //stack1 is at left side of arr.so pop there
            return arr[top1--];  //2-1
        } else {
            System.out.println("Stack Underflow: Cannot pop from Stack 1");
            return -1; // Indicating stack is empty
        }
    }

    // Pop element from the second stack
    public int pop2() {
        if (top2 < size) { // Check if stack is empty // stack2 is at end of arr.so pop there
            return arr[top2++];  //top2=3 (remove 10) top2=4
        } else {
            System.out.println("Stack Underflow: Cannot pop from Stack 2");
            return -1; // Indicating stack is empty
        }
    }

    // Display contents of stacks
    public void displayStacks() {
        System.out.print("Stack 1: ");
        for (int i = 0; i <= top1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Stack 2: ");
        for (int i = size - 1; i >= top2; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoStack stacks = new TwoStack(10);

        stacks.push1(1);
        stacks.push1(2);
        stacks.push1(3);
        stacks.push2(10);
        stacks.push2(20);
        stacks.push2(30);

        stacks.displayStacks(); // Should display both stacks

        System.out.println("Popped from Stack 1: " + stacks.pop1());
        System.out.println("Popped from Stack 2: " + stacks.pop2());

        stacks.displayStacks(); // Should show updated stacks
    }
}


//output
Stack 1: 1 2 3 
Stack 2: 10 20 30 
Popped from Stack 1: 3
Popped from Stack 2: 30
Stack 1: 1 2 
Stack 2: 10 20 
