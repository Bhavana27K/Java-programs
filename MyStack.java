class MyStack {
    int a[] = new int[5];
    int top = -1;

    public void push(int data) {
        if (top == a.length - 1) {
            System.out.println("Overflow");
        } else {
            top++;
            a[top] = data;
            System.out.println("Pushed element: " + a[top]);
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println("Popped element: " + a[top]);
            top--;
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + a[top]);
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("All elements in stack:");
            for (int i = top; i >= 0; i--) {
                System.out.println(a[i]);
            }
        }
    }
}
 class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();  
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.pop();
        stack.peek();
        stack.display();
    }
}
