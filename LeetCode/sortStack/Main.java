package sortStack;

public class Main {
    
    // WRITE THE SORTSTACK METHOD HERE //
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);
        
                System.out.println("\nAfter sorting:");
                stack.printStack();
         
                /*
                    EXPECTED OUTPUT:
                    ----------------
                    Before sorting:
                    4
                    1
                    5
                    2
                    3
                    
                    After sorting:
                    1
                    2
                    3
                    4
                    5
        
                */
                
            }
        
            private static void sortStack(Stack<Integer> stack) {
                Stack <Integer> soretedStack = new Stack<>();
                while (!(stack.isEmpty())) {
                    int temp = stack.pop();
                    while (!soretedStack.isEmpty() && soretedStack.peek() > temp ) {
                        stack.push(soretedStack.pop());
                    }
                    soretedStack.push(temp);
                }
                while (!soretedStack.isEmpty()) {
                    stack.push(soretedStack.pop());
            }
     }
}

