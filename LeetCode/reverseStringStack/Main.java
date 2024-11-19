package reverseStringStack;

public class Main {

    // WRITE THE REVERSESTRING METHOD HERE //
    //                                     //
    //                                     //
    //                                     //
    //                                     //
    /////////////////////////////////////////
    


    public static void main(String[] args) {

        String myString = "hello";
        String reversedString = reverseString(myString);
                System.out.println(reversedString);
        
                /*
                    EXPECTED OUTPUT:
                    ----------------
                    olleh
                */
        
            }
    public static String reverseString(String string){
        Stack<Character> stack = new Stack<>();
        String reverseString = "";
                    
            for(char c : string.toCharArray()){
                stack.push(c);
            }
            while(!stack.isEmpty()){
                reverseString +=stack.pop();
            }
            return reverseString;
    }
        

}

