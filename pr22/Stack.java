package pr22;

public class Stack {
    private int arr[];
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    public void push(int num) {
        if (this.top == capacity - 1) {
            throw new StackOverflow("Cannot push: not enough space");
        }
        arr[++top] = num;
    }

    public int pop() {
       if (this.top == -1) {
            throw new StackEmpty("Cannot pop: stack is empty");
       }
       return arr[top--];
    }

    public int getSize() { return top + 1;}

    public void printStack() {
        for (int i = 0; i <= top; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
