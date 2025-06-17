class CoachYardStack {
    private String[] stack = new String[5];
    private int top = -1;

  
    public boolean isFull() {
        return top == stack.length - 1;
    }

    
    public boolean isEmpty() {
        return top == -1;
    }

   
    public String peek() {
        if (isEmpty()) {
            System.out.println("Yard is empty.");
            return null;
        }
        System.out.println("Top coach: " + stack[top]);
        return stack[top];
    }

    
    public void display() {
        if (isEmpty()) {
            System.out.println("Yard is empty.");
            return;
        }
        System.out.println("Coaches in yard (top to bottom):");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    
    public void push(String coachID) {
        if (coachID == null || coachID.isEmpty()) {
            System.out.println("Invalid coach ID.");
            return;
        }
        if (isFull()) {
            System.out.println("Yard is full. Cannot add coach " + coachID);
            return;
        }
     
        for (int i = 0; i <= top; i++) {
            if (stack[i].equals(coachID)) {
                System.out.println("Duplicate coach ID not allowed: " + coachID);
                return;
            }
        }
       
        if (coachID.startsWith("P1")) {
            
            for (int i = top + 1; i > 0; i--) {
                stack[i] = stack[i - 1];
            }
            stack[0] = coachID;
            top++;
            System.out.println("Priority coach " + coachID + " added at bottom.");
            return;
        }
        
        if (!isEmpty() && stack[top].startsWith("F") && coachID.startsWith("P")) {
            System.out.println("Cannot add passenger coach " + coachID + " on top of freight coach " + stack[top]);
            return;
        }
        
        stack[++top] = coachID;
        System.out.println("Coach " + coachID + " added.");
    }

   
    public void pop() {
        if (isEmpty()) {
            System.out.println("Yard is empty. Nothing to remove.");
            return;
        }
        System.out.println("Coach " + stack[top] + " removed.");
        top--;
    }
}

class Main {
    public static void main(String[] args) {
        CoachYardStack yard = new CoachYardStack();
        yard.push("A05"); 
        yard.push("A10");
        yard.push("A11");
        yard.push("B33"); 
        yard.push("C22");
        yard.push("B10"); 
        yard.display();
        yard.peek();
        yard.pop();
        yard.display();
    }
}