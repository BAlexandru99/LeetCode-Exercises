package isBalancedParentheses;

public class Main {
    
    public static boolean isBalancedParentheses(String string){
        Stack<Character> newStack = new Stack<>();
        for(char ch : string.toCharArray()){
            if(ch == '('){
                newStack.push(ch);
            }else if(ch == ')'){
                if(newStack.isEmpty() || newStack.pop() != '('){
                    return false;
                }
            }
        }
        return newStack.isEmpty();
    }
    // WRITE THE ISBALANCEDPARENTHESES METHOD HERE //
    //                                             //
    //                                             //
    //                                             //
    //                                             //
    /////////////////////////////////////////////////




    public static void main(String[] args) {
        testAndPrint("()", true);
        testAndPrint("()()", true);
        testAndPrint("(())", true);
        testAndPrint("()()()", true);
        testAndPrint("(()())", true);
        testAndPrint(")()(", false);
        testAndPrint(")(", false);
        testAndPrint("(()", false);
        testAndPrint("))", false);
        testAndPrint("(", false);
        testAndPrint(")", false);
    }
    
    public static void testAndPrint(String testStr, boolean expected) {
        // Run the test and store the result
        boolean result = isBalancedParentheses(testStr);
        
        // Print the test string, expected result, and actual result
        System.out.println("Test String: " + testStr);
        System.out.println("EXPECTED: " + expected);
        System.out.println("RESULT: " + result);
        
        // Check if the test passed or failed
        if (result == expected) {
            System.out.println("STATUS: PASS");
        } else {
            System.out.println("STATUS: FAIL");
        }
        
        // Print a separator for better readability
        System.out.println("--------------");
    }

}

